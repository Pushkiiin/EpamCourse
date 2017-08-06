package homework.from170724;

public class Rat implements PetBrain{
    PetBrain ratBrain = new Fed(this);

    @Override
    public void feed() {
        ratBrain.feed();
    }

    @Override
    public void play() {
        ratBrain.play();
    }

    @Override
    public void pat() {
        ratBrain.pat();
    }

    @Override
    public void bathe() {
        ratBrain.bathe();
    }
}


class Fed implements PetBrain {
    Rat rat;

    public Fed(Rat rat){
        this.rat = rat;
    }
    @Override
    public void feed() {
        ignore();
        run();
    }

    @Override
    public void play() {
        jump();
        run();
        jump();
        rat.ratBrain = new Dirty(rat);
    }

    @Override
    public void pat() {
        scratch();
        lick();
        scratch();
    }

    @Override
    public void bathe() {
        standStill();
    }


    private void standStill() {
        System.out.println("Stands still");
    }

    private void lick() {
        System.out.println("Licks itself");
    }

    private void scratch() {
        System.out.println("Scratches actively");
    }

    private void jump() {
        System.out.println("Jumps");
    }

    private void run() {
        System.out.println("Runs in a wheel");
    }

    private void ignore() {
        System.out.println("Ignores");
    }
}

class Dirty implements PetBrain {
    Rat rat;

    public Dirty(Rat rat){
        this.rat = rat;
    }
    @Override
    public void feed() {
        ignore();
        lick();
    }

    @Override
    public void play() {
        runAway();
        lick();
    }

    @Override
    public void pat() {
        lick();
        lick();
    }

    @Override
    public void bathe() {
        lick();
        scratch();
        wag();
        rat.ratBrain = new Hungry(rat);
    }

    private void runAway() {
        System.out.println("Runs away");
    }

    private void lick() {
        System.out.println("Licks itself");
    }

    private void scratch() {
        System.out.println("Scratches actively");
    }

    private void wag() {
        System.out.println("Wags it's tail");
    }

    private void ignore() {
        System.out.println("Ignores");
    }
}

class Hungry implements PetBrain {
    Rat rat;
    public Hungry(Rat rat){
        this.rat = rat;
    }
    @Override
    public void feed() {
        makeSound();
        eat();
        jump();
        rat.ratBrain = new Fed(rat);
    }

    @Override
    public void play() {
        runAway();
        stareAtFeeder();
    }

    @Override
    public void pat() {
        ignore();
        stareAtFeeder();
    }

    @Override
    public void bathe() {
        runAway();
        stareAtFeeder();
    }

    private void stareAtFeeder() {
        System.out.println("Stares at feeder hungrily");
    }

    private void makeSound() {
        System.out.println("Makes sound");
    }

    private void runAway() {
        System.out.println("Runs away");
    }

    private void eat() {
        System.out.println("Eats");
    }

    private void jump() {
        System.out.println("Jumps");
    }

    private void ignore() {
        System.out.println("Ignores");
    }
}
