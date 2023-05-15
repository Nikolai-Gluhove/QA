package org.example;

import animal.Animal;
import animal.birds.Calibri;
import animal.birds.Golub;
import animal.birds.IBirds;
import animal.pet.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.getColorEyes());


        cat.see();

        Calibri calibri = new Calibri();
        System.out.println(calibri.fly());;

        IBirds golub = new Golub("blue");
        Golub secondGolub = new Golub("blue");
        Animal thirdGolub = new Golub("blue");

        System.out.println(golub.fly());
        System.out.println(secondGolub.fly());
        thirdGolub.say("гав гав");




    }
}