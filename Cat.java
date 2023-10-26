
public class Cat
{
    public static final int NUMBER_OF_EYES = 2;
    public static final double MIN_WEIGHT = 1000;
    public static final double MAX_WEIGHT = 9000;

    public static int count;
    private double originWeight;
    private double weight;

    private double weightE;

    private double minWeight;
    private double maxWeight;

    public double startWeight;
    public double kitten;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }
    public Cat(double startWeight)
    {
        this();
        this.startWeight = startWeight;
        System.out.println("Cat start weight - " + startWeight);
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
        if (weight > maxWeight);
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