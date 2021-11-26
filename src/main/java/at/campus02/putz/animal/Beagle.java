package at.campus02.putz.animal;

public class Beagle extends Dog {

    public String lovedFood;

    public void doSomething2(){
        System.out.println("This is a beagle!");
    }

    @Override
    public void bark() {
        // super.bark(); // super ruft die methode der basisklasse auf
        System.out.println("This beagle sounds like: wau wau");
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
