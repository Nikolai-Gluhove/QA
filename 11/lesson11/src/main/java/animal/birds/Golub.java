package animal.birds;

import animal.Animal;

public class Golub extends Animal implements IBirds {
    public Golub(String eyes) {
        super(eyes);
    }

    @Override
    public String fly() {
        return "Я голуб, я летаю";
    }
}
