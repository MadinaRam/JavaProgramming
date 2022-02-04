package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private final String bread;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath;

    static {
        canBreath = true;  // only one value can be assigned to final static method. and only one time we can reassign it
       // if(canBreath == false){
            //throw new RuntimeException("Invalid");}
    }

    public Animal(String name, String bread, char gender, int age, String size, String color) {
        setName(name);
        this.bread = bread;
        this.gender = gender;
        if( !(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender:" + gender);
        }
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }


    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name"+name);
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public final void drink(){
        System.out.println(name +" is drinking");
    }

    public abstract void eat();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
/*
Animal Task:
    Create an abstract class named Animal:
        Variables:
            name, breed(final), gender(final),  age, size, color(final)

        Encapsulate all the fields

        Add a constructor that can set all the fields

        Methods:
            eat() ==> different animals eat different foods
            drink() ==> all the animals drink water
            toString() ==> to display the full info of the animal

    Create the following subclasses of Animal:
            Dog
                eat(): eats Pizza

            Cat
                eat(): eats Biryani

            Tiger
                eat(): eats deer

            Parrot
                eat(): eats chocolate

            Eagle
                eat(): eats snake
 */