package animal;

public abstract class Animal {
    private String eye;

    public Animal(String eye){
        this.eye = eye;
    }

    public abstract void say();

    public String getEye(){
        return this.eye;
    }
}


