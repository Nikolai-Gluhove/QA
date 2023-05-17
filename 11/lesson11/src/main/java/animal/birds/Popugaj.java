package animal.birds;

import animal.Animal;

public class Popugaj extends Animal implements IBirds {


    public Popugaj(String eye) {
        super(eye);
    }

    @Override
    public void say() {
        System.out.println("Hello world");
    }

    @Override
    public void fly() {
        System.out.println("Лечуууууууууу");
    }
}
