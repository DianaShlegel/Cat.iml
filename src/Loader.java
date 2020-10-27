
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println("Murka weight: " + murka.getWeight());

        murka.meow();
        System.out.println("Murka weight: " + murka.getWeight());

        Cat vasya = new Cat ();
        System.out.println("Vasya weight: " + vasya.getWeight());

        Cat shedy = new Cat ();
        System.out.println("Shedy weight: " + shedy.getWeight());

        Cat felix = new Cat ();
        System.out.println("Felix weight: " + felix.getWeight());

        Cat tom = new Cat();
        System.out.println("Tom weight: " + tom.getWeight());

        Cat houppy = new Cat();
        System.out.println("Houppy weight: " + houppy.getWeight());



    }
}