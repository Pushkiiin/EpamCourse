package classwork.lesson170629.classstructure;

public class A {

    static final int MAX = 10;
    static final String whatever = "asd";
    static int instanceConter = 0;

    static{

    }

    //
    int x = 0;
    int y = 0;

    {
        instanceConter++;
    }

    public A(){

    }

}
