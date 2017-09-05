package classwork.lesson170629.practice;

//we have wrong handling of repeating subsequences here
//A C G T
//циклы, хэш, сортировка, сравнить скорости
//дз - повторить, мб сделать сортировку


public class Genome {
    public static void main(String[] args) {
        byte[] data = DataGen.generate(30);

        for (byte b : data) {
            System.out.println((char)b);
        }

        findDuplicates(data, 2);
    }

    private static void findDuplicates(byte[] data, int w) {
        int counter = 0;
        for (int i = 0; i < data.length - w; i++) {
            for (int j = i + 1; j < data.length - w + 1; j++) {
                boolean found = true;
                for (int k = 0; k < w; k++) {
                    if(data[i + k] != data[j + k]){
                        found = false;
                        break;
                    }
                }
                if (found){
                    counter++;
//                    System.out.println("Hurray");
//                    System.out.println("i = " + i + ", j = " + j);
                }
            }
        }
        System.out.println();
        System.out.println(counter);
    }


}
