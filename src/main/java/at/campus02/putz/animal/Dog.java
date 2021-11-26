package at.campus02.putz.animal;

public class Dog {

    public String eyeColor;
    public int weight;
    private String privateValue; // darauf kann nur in der Klasse 'Dog' zugegriffen werden

    public void doSomething(){
        privateValue = "PRIVATE";
        System.out.println(privateValue); // funktioniert in Beagle auch, da es hier bereits initialisiert wurde
        System.out.println("This is a dog!");
    }

    public void bark(){
        System.out.println("This dog sounds like: wuff wuff");
    }

    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
