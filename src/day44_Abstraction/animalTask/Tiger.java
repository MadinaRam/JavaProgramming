package day44_Abstraction.animalTask;

public final class Tiger extends Animal{


    public Tiger(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }


}
