package animal;

import animal.birds.Calibri;
import animal.birds.IBirds;

public class Animal {

    public Animal(String eyes){
        colorEyes = eyes;

    }
    public Animal(){

    }

    private String colorEyes;


    public String getColorEyes(){
        return colorEyes;
    }

    public void say(String voice){
        System.out.println(voice);
    }

    public void see(){
        System.out.println("Я вижу");
    }


}
