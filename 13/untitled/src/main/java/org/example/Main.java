package org.example;

import org.example.data.CityData;
import org.example.data.Command;
import org.example.data.CountryData;

import java.util.*;

public class Main {
    public static void main(String... args) {
//        CityData cityData = CityData.MOSSCOW;
//
//        System.out.println(cityData.getName());
//        System.out.println(cityData.getCountryData());
//
//        //обращение к элементу enums
//        Command command = Command.valueOf("EXIT");
//        System.out.println(command.name());
//
//        //обработка ошибки обычным способом
//        try {
//            Command command1 = Command.valueOf("bla");
//            System.out.println(command1.name());
//        }catch (Exception ex){
//            System.out.println("Wrong");
//        }
//
//        //другой способ обработать ошибки в enum
//        String userInput = "ADD";
//        Command[] commands = Command.values();
//        boolean isExist = false;
//        for (Command command1: commands){
//            if(command1.name().equals(userInput)){
//                isExist = true;
//                break;
//            }
//        }
//        if(!isExist){
//            System.out.println("Ошибка");
//            System.exit(1);
//        }
//        System.out.println("Все хорошо");




//        //МАСИВЫ
//        String[] test = new String[5];
//        //иттерируются
//        for(String st: test){
//
//        }

//        //коллекции
//        ArrayList<String> list = new ArrayList();
//        List<Float> linkedList = new LinkedList();
//
//        //добавить
//        list.add("dfdfdf");
//        list.add(0,"daaaaaa");
//        //получить
//        list.get(1);
//        //длина списка
//        list.size();
//
//        linkedList.add(1.2f);
//        linkedList.add(0, 2.2f);
//
//
//
//        List<List<List<List<String>>>> matrix = new ArrayList<>();
//
//        String test = matrix.get(0).get(1).get(0).get(3);


//        // СЕТЫ - не допускает одинаковые значения
//        Set<String> mySet = new HashSet<>();
//
//        mySet.add("test");
//        mySet.add("test2");
//        mySet.add("test");
//        System.out.println(mySet.size());
//
//        //Как получать эл сета
//        Iterator<String> iterator = mySet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Map<Integer, String> myMap = new HashMap<>();
        //добавить
        myMap.put(1, "Ivan");
        myMap.put(20, "Petya");
        //получаем
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(20));
        //плохой способ вывести все значения
        for (Integer key: myMap.keySet()){
            System.out.println(myMap.get(key));
        }
        //эфективный способ вывести все элементы
        for (Map.Entry<Integer, String> entry: myMap.entrySet()){
            System.out.println(entry.getKey() + " value = " + entry.getValue());
        }


    }

}