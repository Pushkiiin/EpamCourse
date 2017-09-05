package classwork.lesson170816;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{2,1,3},{3,3,1}};
        int[][] matrix0 = {{1,5,3},{2,1,3},{3,3,1}};
        int[][] matrix1 = {};
        System.out.println(isSimm(matrix));
        System.out.println(isSimm(matrix0));
        System.out.println(isSimm(matrix1));

    }

    private static boolean isSimm(int[][] matrix){
        if(matrix == null){
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != matrix [j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}

//еще есть задача про заполнение массива MxN по спирали; есть идея с рекурсией
//kinda hw - пописать partition, mb even quick and mergesort
//hw - radix sort для целых чисел через побитовые сдвиги (32 бита разбить на 4 байта)

/*
    quicksort (вообще много инфы про неё было, можно пересмотреть, можно не)
основная идея - берем эл-т и ставим туда, где он будет в уже отсортированном массиве
ключевая процедура - partitioning:
берем очередной элемент (опорный/пивот), идем двумя итераторами с начала и с конца, и если чо меняем их местами
мерж(код) внешне очень похож на квиксорт, оба - divide&conquer
string sorts - немного отдельный раздел, в основном про lsd и msd radix
4+ части - про радикс и сортировку подсчетом
    priority queue
добавление эл-та и извлечение максимума
удобно делать на массиве; знаем по эл-ту места его родителя и детей
 */