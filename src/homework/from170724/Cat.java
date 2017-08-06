package homework.from170724;

public class Cat implements PetBrain{
    private PetBrain catBrain = new Fed();

    @Override
    public void feed() {
        catBrain.feed();
    }

    @Override
    public void play() {
        catBrain.play();
    }

    @Override
    public void pat() {
        catBrain.pat();
    }

    @Override
    public void bathe() {
        catBrain.bathe();
    }

    private class Fed implements PetBrain {
        @Override
        public void feed() {
            ignore();
        }

        @Override
        public void play() {
            meow();
            jump();
            run();
            catBrain = new Dirty();
        }

        @Override
        public void pat() {
            purr();
            wag();
        }

        @Override
        public void bathe() {
            hiss();
            scratch();
        }

    }

    private class Dirty implements PetBrain {
        @Override
        public void feed() {
            ignore();
            lick();
        }

        @Override
        public void play() {
            ignore();
            lick();
        }

        @Override
        public void pat() {
            ignore();
            lick();
        }

        @Override
        public void bathe() {
            hiss();
            scratch();
            catBrain = new Hungry();
        }
    }

    private class Hungry implements PetBrain {
        @Override
        public void feed() {
            meow();
            wag();
            eat();
            meow();
        }

        @Override
        public void play() {
            ignore();
            meow();
        }

        @Override
        public void pat() {
            wag();
            meow();
        }

        @Override
        public void bathe() {
            hiss();
            scratch();
            hiss();
            runAway();
        }

    }

    private void runAway() {
        System.out.println("Runs away");
    }

    private void eat() {
        System.out.println("Eats");
    }

    private void lick() {
        System.out.println("Licks itself");
    }

    private void scratch() {
        System.out.println("Scratches actively");
    }

    private void hiss() {
        System.out.println("Hisses");
    }

    private void wag() {
        System.out.println("Wags it's tail");
    }

    private void purr() {
        System.out.println("Purrs");
    }

    private void meow() {
        System.out.println("Meows");
    }

    private void jump() {
        System.out.println("Jumps");
    }

    private void run() {
        System.out.println("Runs");
    }

    private void ignore() {
        System.out.println("Ignores");
    }
}
