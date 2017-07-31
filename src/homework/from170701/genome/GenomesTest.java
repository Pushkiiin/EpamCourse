package homework.from170701.genome;

public class GenomesTest {

    //sorting algorithm is a bit more efficient on these arguments, but changing them can make huge difference
    private static int DATA_SIZE = 10_000_000;
    private static int WORD_LEN = 20;

    public static void main(String[] args) {
        byte[] data = DataGen.generate(DATA_SIZE);

        long startTime, finishTime, diff;

        startTime = System.currentTimeMillis();
        System.out.println("Duplicates found: " + HashMapGenome.countDuplicates(data, WORD_LEN));
        finishTime = System.currentTimeMillis();
        diff = finishTime - startTime;
        System.out.println("HashMap time: " + diff + " ms");

        startTime = System.currentTimeMillis();
        System.out.println("Duplicates found: " + SortGenome.countDuplicates(data, WORD_LEN));
        finishTime = System.currentTimeMillis();
        diff = finishTime - startTime;
        System.out.println("Sorting time: " + diff + "ms");

    }

    private static void print(byte[] arr) {
        for (byte b : arr) {
            System.out.print((char) b);
        }
        System.out.println();
    }
}
