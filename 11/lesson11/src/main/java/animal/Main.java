package animal;

import animal.Animal;
import animal.birds.IBirds;
import animal.birds.Popugaj;
import animal.pet.Cat;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("blue");
        System.out.println(String.format("Я кошка. У меня цвет глаз %s", cat.getEye()));

        IBirds popugaj = new Popugaj("black");
        popugaj.fly();
        ((Animal)popugaj).say(); 
    }


}