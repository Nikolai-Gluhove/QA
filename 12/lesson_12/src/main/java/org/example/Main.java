package org.example;

import delivery.DeliveryPost;
import factory.Factory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        new Child().method();

/*
        Factory factory = new Factory();
        DeliveryPost delivery = new DeliveryPost();

        delivery.delivery(factory.create());

        String type = DeliveryPost.TYPE;
        System.out.println(type);
        System.out.println(DeliveryPost.TYPE);
*/

        //регулярные выражений
        String str = "I am user email mail@aaaaaaa.ru with name Koli and mail@bb.ru";

        Pattern pattern = Pattern.compile(".*\s+(.*?@.*?\\.\\w+).*");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            System.out.println(matcher.group(1));
        }

                System.out.println(str.replaceAll("\\w*\\d*@\\w*\\d*\\.\\w{2,3}", "*****"));

        String[] result = str.split(" ");



    }
}