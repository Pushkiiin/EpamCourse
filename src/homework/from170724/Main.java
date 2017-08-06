package homework.from170724;

//inner class really seems to be more handy
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Rat rat = new Rat();

        cat.bathe();
        System.out.println();
        cat.feed();
        System.out.println();
        cat.play();
        System.out.println();
        cat.feed();
        System.out.println();
        cat.bathe();
        System.out.println();
        cat.bathe();
        System.out.println();
        cat.feed();

        System.out.println("........");
        System.out.println("........");

        rat.bathe();
        System.out.println();
        rat.feed();
        System.out.println();
        rat.play();
        System.out.println();
        rat.feed();
        System.out.println();
        rat.bathe();
        System.out.println();
        rat.bathe();
        System.out.println();
        rat.feed();
    }
}
