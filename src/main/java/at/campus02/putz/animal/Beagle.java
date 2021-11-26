package at.campus02.putz.animal;

public class Beagle extends Dog {

    public String lovedFood;

    public void doSomething2(){
        System.out.println("This is a beagle!");
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
