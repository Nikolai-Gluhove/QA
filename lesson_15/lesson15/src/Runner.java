import animals.AbsAnimal;
import data.AnimalTypeData;
import data.CommandsData;
import factories.AnimalFactory;

import java.util.Locale;
import java.util.Scanner;

public class Runner {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        CommandsData command = CommandsData.ADD;
        command.name().toUpperCase(Locale.ROOT).trim();

        AbsAnimal animal = fillAnimalData(AnimalTypeData.CAT);

    }


    private static AbsAnimal fillAnimalData(AnimalTypeData animalTypeData){
        AnimalFactory animalFactory = new AnimalFactory();
        AbsAnimal animal = animalFactory.create(animalTypeData);

        System.out.println("Как зовут животное?");
        animal.setName(scanner.next());

        System.out.println("Какой цвет у животного?");
        animal.setColor(scanner.next());

        System.out.println("Какой возраст у животного");
        String ageStr = scanner.next();
        while (! isNumber(ageStr)){
            System.out.println("Введен неверный возраст");
            System.out.println("Повторите ввод");
            ageStr = scanner.next();
        }
        animal.setAge(Integer.parseInt(ageStr));

        System.out.println("Какой вес у животного");
        String weightStrStr = scanner.next();
        while (! isNumber(weightStrStr)){
            System.out.println("Введен неверный вес");
            System.out.println("Повторите ввод");
            ageStr = scanner.next();
        }
        animal.setWeight(Integer.parseInt(weightStrStr));

        return animal;
    }

    //проверка на число
    private static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException ignoring){
            //перенести цикл из создания сюда
            return false;
        }
    }
}
