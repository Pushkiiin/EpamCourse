package homework.from170811;

import java.util.*;

public class TimeTests {
    private static final int SEED = 1_000_000;
    private static final int SIZE = 1_000_000;
    private static final int RANGE = 1_000_000;
    private static final int TO_SEARCH = 10;

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        Set<Integer> ts = new TreeSet<>();

        double alFill = fillBench(al);
        double llFill = fillBench(ll);
        double tsFill = fillBench(ts);
        System.out.println("ArrayList fill: " + alFill + " ms");
        System.out.println("LinkedList fill: " + llFill + " ms");
        System.out.println("TreeSet fill: " + tsFill + " ms");
        System.out.println();

        double alSort = sortBench(al);
        double llSort = sortBench(ll);
        System.out.println("ArrayList sort: " + alSort + " ms");
        System.out.println("LinkedList sort: " + llSort + " ms");
        System.out.println();

        double alSearch = listBinSearchBench(al);
        double llSearch = listBinSearchBench(ll);
        double tsSearch = setBinSearchBench(ts);
        System.out.println("ArrayList binSearch: " + alSearch + " ms");
        System.out.println("LinkedList binSearch: " + llSearch + " ms");
        System.out.println("TreeSet binSearch: " + tsSearch + " ms");
        System.out.println();

        System.out.println("Total ArrayList operations: " + (alFill + alSort + alSearch) + " ms");
        System.out.println("Total LinkedList operations: " + (llFill + llSort + llSearch) + " ms");
        System.out.println("Total TreeSet operations: " + (tsFill + tsSearch) + " ms");
        System.out.println();
    }

    private static double setBinSearchBench(Set<Integer> set) {
        double start = System.currentTimeMillis();
        set.contains(TO_SEARCH);
        double finish = System.currentTimeMillis();
        return finish - start;
    }

    private static double listBinSearchBench(List<Integer> list) {
        double start = System.currentTimeMillis();
        Collections.binarySearch(list, TO_SEARCH);
        double finish = System.currentTimeMillis();
        return finish - start;
    }

    private static double sortBench(List<Integer> list) {
        double start = System.currentTimeMillis();
        Collections.sort(list);
        double finish = System.currentTimeMillis();
        return finish - start;
    }

    public static double fillBench(Collection<Integer> collection){
        List<Integer> arr = new ArrayList<>(SIZE);
        Random rnd = new Random(SEED);
        for (int i = 0; i < SIZE; i++) {
            arr.add(Math.abs(rnd.nextInt()%RANGE));
        }

        double start = System.currentTimeMillis();
        collection.addAll(arr);
        double finish = System.currentTimeMillis();
        return finish - start;
    }

}
