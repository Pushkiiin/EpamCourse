package homework.from170629;


// the task is to repeat duplicates search algorithm with iterations
// actually we made a huge mistake at class, so I'll write new one later probably

public class Genome {


    public static final int DATA_SIZE = 30;

    public static void main(String[] args) {
        byte[] data = DataGen.generate(DATA_SIZE);
        print(data);

    }

    public static void print(byte[] arr){
        for (byte b : arr) {
            System.out.print((char)b);
        }
    }
}
