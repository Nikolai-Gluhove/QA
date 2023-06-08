import animals.AbsAnimal;
import commands.add.ADD_check;
import commands.add.CreateAnimal;
import data.AnimalTypeData;
import data.CommandsData;
import factories.AnimalFactory;
import factories.CommandFactory;

import java.util.*;

public class Runner {
    public static ArrayList<AbsAnimal> listAnimal = new ArrayList<>();

    public final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CommandFactory comFact = new CommandFactory();
        //список животных


        while (true) {
            //запрос команды от пользователей
            String usercommand;
            while (true) {
                System.out.println("Пожалуйста введите одну из следующих команд:");
                System.out.println("LIST - получить список всех животных");
                System.out.println("ADD  - добавить животное");
                System.out.println("EXIT - выйти из программы");
                usercommand = scanner.next().toUpperCase().trim();
                System.out.println(usercommand);

                if (usercommand.equals(CommandsData.ADD.name()) ||
                        usercommand.equals(CommandsData.LIST.name()) ||
                        usercommand.equals(CommandsData.EXIT.name())) {
                    break;
                }
                System.out.println("Было введено не корректное значение");
            }

            CommandFactory commandFactory = new CommandFactory();
            CommandsData commandsData = commandFactory.createComand(usercommand);

            switch (commandsData) {
                case LIST -> {
                    System.out.println("На данный момент созданы:");
                    for (AbsAnimal anim : listAnimal) {
                        System.out.println(anim.toString());
                    }
                }
                case ADD -> {
                    ADD_check addCheck = new ADD_check();
                    AnimalTypeData typeAnimal = addCheck.active();
                    CreateAnimal createAnimal = new CreateAnimal();
                    listAnimal.add(createAnimal.fillAnimalData(typeAnimal));

                }
                case EXIT -> {
                    System.exit(0);
                }
            }
        }

    }

    //создание животных
//    public static AbsAnimal fillAnimalData(AnimalTypeData animalTypeData){
//
//        AnimalFactory animalFactory = new AnimalFactory();
//        AbsAnimal animal = animalFactory.create(animalTypeData);
//
//        System.out.println("Как зовут животное?");
//        animal.setName(Runner.scanner.next());
//
//        System.out.println("Какой цвет у животного?");
//        animal.setColor(Runner.scanner.next());
//
//        System.out.println("Какой возраст у животного");
//        String ageStr = Runner.scanner.next();
//        while (! isNumber(ageStr)){
//            System.out.println("Введен неверный возраст");
//            System.out.println("Повторите ввод");
//            ageStr = Runner.scanner.next();
//        }
//        animal.setAge(Integer.parseInt(ageStr));
//
//        System.out.println("Какой вес у животного");
//        String weightStrStr = Runner.scanner.next();
//        while (! isNumber(weightStrStr)){
//            System.out.println("Введен неверный вес");
//            System.out.println("Повторите ввод");
//            ageStr = Runner.scanner.next();
//        }
//        animal.setWeight(Integer.parseInt(weightStrStr));
//
//        return animal;
//    }
//
//    //проверка на число
//    private static boolean isNumber(String str){
//        try {
//            Integer.parseInt(str);
//            return true;
//        }catch (NumberFormatException ignoring){
//            return false;
//        }
//    }




}
