package day44_Abstraction.animalTask;

public final class Dog extends Animal{


    public Dog(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }


    @Override
    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }
}
