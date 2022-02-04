package day44_Abstraction.animalTask;

public final class Cat extends Animal{


    public Cat(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println(getName()+ " eats Biryani");
    }

    public void Meow(){
        System.out.println(getName()+" is Meowing");
    }
}
