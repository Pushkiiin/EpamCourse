package classwork.lesson170627.Creation;

public class A {
    int i;
    long timestamp;
    {
        System.out.println("asd"); // блок инициализации - всегда выполняетсяраньше конструктора
    }
    public A(){
        super();    //на самом деле вызывается всегда в самом начале выполнения конструктора
        System.out.println("constructor A");
        i = 10;
        timestamp = System.currentTimeMillis();
    }
}
