package day44_Abstraction.animalTask;

public final class Eagle extends Animal{


    public Eagle(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats snake");
    }



}
