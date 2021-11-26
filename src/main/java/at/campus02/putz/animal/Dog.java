package at.campus02.putz.animal;

public class Dog {

    public String eyeColor;
    public int weight;

    public void doSomething(){
        System.out.println("This is a dog!");
    }

    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
