package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Массивы
//        int numbers[] = new int[3];
//        int[] num = new int[3];
//        int num2[] = {1, 2, 3};
//
//        num[0] = 1;
//        num[1] = 2;
//        num[2] = 3;
//        System.out.println(Arrays.toString(num));
//
        //Листы
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size());


        // Тернарный оператор
//        int cash = -1;
//
//        String result = (cash > 100) ? "cash > 100"
//                : (cash == 100) ? "cash = 100"
//                : (cash < 100 && cash > 0) ? "0 < cash < 100"
//                : "cash <= 0";
//
//        System.out.println(result);

        // ЕСЛИ
//        Integer cash = 101;
//        String result;
//
//        if (cash > 100){
//            result = "cash > 100";
//        } else if (cash == 100){
//            result = "cash = 100";
//        } else  if (cash < 100 && cash > 0){
//            result = "0 < cash < 100";
//        } else {
//            result = "cash <= 0";
//        }
//
//        System.out.println(result);


        // Рекурсия
        System.out.println(calculateFactorialRec(5));



    }

    static int calculateFactorialRec(int n){
        // рекусия
        int result;
        System.out.println(n);
        if (n == 1) return 1;
        result = calculateFactorialRec(n-1)*n;
        System.out.println(result);
        return result;
    }
}

