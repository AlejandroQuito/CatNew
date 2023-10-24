
public class Cat
{
    public static int count;
    private double originWeight;
    private double weight;

    private double weightE;

    private double minWeight;
    private double maxWeight;



    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }
    public static int getCount()

    {
        System.out.println("How match cat will be started:  " + count);
        return count;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void pee() {
        weight = weight - 123;
        System.out.println("PEPEPEeeeeeee");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double weightEat () {
        weightE = getWeight() - originWeight;
        System.out.println("Weight eat:  " + weightE);
        return weightE;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
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