package classwork.lesson170814;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, Red");
        Integer[] arr = {1, 7, 16, 17, 2, 7, 15, 20};
        System.out.println(Arrays.asList(arr).toString());

        merge(arr, 0, arr.length / 2, arr.length - 1);
        System.out.println(Arrays.asList(arr).toString());
    }

    //doesn't work properly, needs correction
    private static void merge(Comparable[] arr, int lo, int mid, int hi) {
        Comparable[] aux = new Comparable[arr.length];
        System.arraycopy(arr, 0, aux, 0, arr.length);
        int i = lo, j = mid;
        for (int k = 0; k < arr.length; k++) {
            if (i > mid) {
                System.arraycopy(aux, j, arr, k, hi - j);
                return;
            }
            if (j > hi) {
                System.arraycopy(aux, i, arr, k, mid - i);
                return;
            }
            arr[k] = aux[i].compareTo(aux[j]) <= 0 ? aux[i++] : aux[j++];
        }

    }
}

//можно попробовать сделать мержсорт без доп. памяти - gonna be fun
//раскурить получше код мержсорта, google mergesort trace

/*
compare(arg1, arg2) возвращает <0 если arg1 по порядку должен идти РАНЬШЕ, чем arg2
остались лямбды, стримы, и/о, немного сети, многопоточка, бд (JDBC) (дата,тайм,локализация - дз)
посмотрели сортировки: selection, insertion + shell (весьма юзабельна, т.к. хорошо работает на частично отсортированных)
стандратные merge & quick sorts при небольшом кол-ве эл-тов переходят на insertion sort
обратная задача - перемешать массив
    merge & quick
merge не предполагает, что мы делим ровно на 2 части и что части сортируем тоже слиянием и это обузится
//последняя часть занятия - подробненько про мержсорт
 */
