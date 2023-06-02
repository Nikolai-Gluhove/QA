package org.example;

import org.example.functionInterfaces.FumctionImpl;
import org.example.functionInterfaces.IMyFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        IMyFunction iMyFunction = new FumctionImpl();
//        iMyFunction.check(3);
//
//
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(-1);
//        list.add(3);
//
//        for (Integer integer : list) {
//            if (iMyFunction.check(integer)) {
//                System.out.println("Good");
//            }
//        }
//
//        //Лямбда выражение
//        IMyFunction myLambda= (int a) -> a > 0;
//        IMyFunction myLambdaNew = (int a) -> a % 2 ==0;
//
//        for (Integer integer : list) {
//            if (myLambda.check(integer)) {
//                System.out.println("Good");
//            }
//        }

//        //STREAM
//        Collection<String> collection = Arrays.asList("a1","a2","a3");
//        Stream<String> streamFromCollection = collection.stream();


//        IMyFunction iMyFunction = new FumctionImpl();
//        iMyFunction.check(3);


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-1);
        list.add(3);

        List<Integer> resultStream = gerDataByStream(list, num -> num % 2 == 0);

        System.out.println("Конец");
    }

    public static List<Integer> gerDataByStream(List<Integer> list, Predicate<Integer> predicate){
        return list
                .stream() //преобразовать данные в стрим
                .filter(predicate) // отфильтровать
                .collect(Collectors.toList()); // собрать в коллекцию
    }


}