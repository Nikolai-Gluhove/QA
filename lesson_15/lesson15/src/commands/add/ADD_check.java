package commands.add;
import data.AnimalTypeData;

import java.util.Scanner;

public class ADD_check {
    public  Scanner scanner = new Scanner(System.in);
    public AnimalTypeData active() {
        String animal;

        while (true){
            System.out.println("Пожалуйста напишите одно из следующих жиотных:");
            System.out.println("1) Cat");
            System.out.println("2) Dog");
            System.out.println("3) Duck");

            animal = scanner.next().toUpperCase().trim();

            if (animal.equals(AnimalTypeData.DOG.name()) ||
                    animal.equals(AnimalTypeData.CAT.name()) ||
                    animal.equals(AnimalTypeData.DUCK.name())){
                break;
            }
            System.out.println("Было введено некорректное значение");
        }
        switch (animal){
            case "CAT" ->{
                return AnimalTypeData.CAT;
            }
            case "DOG" ->{
                return AnimalTypeData.DOG;
            }
            case "DUCK" ->{
                return AnimalTypeData.DUCK;
            }
        }
        return null;
    }
}
