package homework.from170701;

import java.util.Random;

public class Matrix {

    public static final int ROWS = 5;
    public static final int COLUMNS = 5;

//        main logic
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(ROWS, COLUMNS);
        printMatrix(matrix);

        OUTER:
        for (int i = 0; i < ROWS; i++) {
            int sum = 0;
            for (int j = 0; j < COLUMNS; j++) {
                if (matrix[i][j] >= 0) {
                    sum += matrix[i][j];
                } else {
                    continue OUTER;
                }
            }
            System.out.println((i + 1) + " row sum is " + sum);
        }
    }

    public static int[][] generateMatrix(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        Random rnd = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rnd.nextInt()%30 + 20;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
