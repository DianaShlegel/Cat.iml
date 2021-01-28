
public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        System.out.println("Murka weight: " + murka.getWeight());
// перекормила
        while (9000 > murka.getWeight())
        {
            murka.feed(50.0);
            System.out.println("Murka weight: " + murka.getWeight() + murka.getStatus());

        }

        Cat vasya = new Cat ();
        System.out.println("Vasya weight: " + vasya.getWeight());
//замяукала
         while (1000 < vasya.getWeight() )
        {
            vasya.meow();
            System.out.println("Vasya weight: " + vasya.getWeight() + vasya.getStatus());
        }

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