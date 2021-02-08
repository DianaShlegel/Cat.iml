
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double allFood;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public int meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        return 0;
    }
    public void feed(Double amount) { weight = weight + amount;
        allFood += amount;}

    //съеденная еда
    public Double getAllFood() {return allFood;}

    public void drink(Double amount)
    {
        weight = weight + amount;
    }
    //"Сходить в туалет"
    public  int pee()
    {
    weight = weight - (weight/20);
    System.out.println("Yo-ho-ho!");
    return  0;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

}