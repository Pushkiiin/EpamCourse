package classwork.lesson170717.practice;

public abstract class Guitar extends Stringed {
    @Override
    public void makeNoize(){
        super.makeNoize();
        System.out.println("Only guitar can sound like that...");
    }
}
