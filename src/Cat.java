public class Cat {

    public double weight;
    String name = "Barsik";
    int age = 1;
    String color = "Grey";

    int flag = 55;


    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        this.weight += 50;
    }
}

