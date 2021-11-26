package at.campus02.putz.animal;

public class DemoDogApp {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eyeColor = "brown";
        d.weight = 2900;

        System.out.println(d.toString());
        d.doSomething();

        Beagle b = new Beagle();
        b.eyeColor = "blue";
        b.weight = 2850;
        b.lovedFood = "burger";

        System.out.println(b.toString());
        b.doSomething();
        b.doSomething2();

        d.bark();
        b.bark();
    }
}
