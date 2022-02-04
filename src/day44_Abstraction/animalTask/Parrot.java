package day44_Abstraction.animalTask;

public final class Parrot extends Animal{


    public Parrot(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats chocolate");
    }
}
