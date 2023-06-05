package animals;

public abstract class AbsAnimal {
    //parameter
    private String name;
    private int age;
    private int weight;
    private String color;

    //get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }


    //set
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }



    //methods
    public void say(){
        System.out.println("Я говарю");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    public void go(){
        System.out.println("Я иду");
    }


    //переопределить метод toString
    @Override
    public String toString(){
        return String.format("Привет меня зовуп %s, мне %d %s, я вешу - %d кг, мой цвет - %s", name, age, getYearStringPadej(age), weight ,color);
    }

    //падежи годов
    private String getYearStringPadej(int age){
        if(this.age % 10 == 0 || this.age % 10 >= 5 || this.age >= 10  && this.age <= 19){
            return "лет";
        }
        if(this.age % 10 == 1){
            return "год";
        }
        else{
            return "года";
        }
    }
}
