public class Loader
{
    public static void main(String[] args)
    {
        Cat.count = 0;


        Cat olli = new Cat();
        System.out.println("Olli  " + olli.getWeight());
        olli.feed(olli.getWeight()/100);
        olli.weightEat();
        System.out.println("Olli after eat  " + olli.getWeight());
        olli.pee();


        Cat murka = new Cat();
        System.out.println("Murka   " + murka.getWeight());
        murka.meow();
        System.out.println(murka.getWeight());
        double weightMurkaAfterFeed = 9000;


        while (murka.getWeight() <= weightMurkaAfterFeed) {
            murka.feed((double) 1000);
            System.out.println(murka.getWeight());
        }
        System.out.println("Murka after eat:  " + murka.getStatus());


        Cat belka = new Cat();
        System.out.println(belka.getWeight());
        belka.feed((double) 1000);
        System.out.println(belka.getWeight());


        Cat vasya = new Cat();
        System.out.println("Vasya -- " + vasya.getWeight());
        vasya.drink((double)9000);
        System.out.println("Vasya after drink -- " + vasya.getWeight());
        double weightVasyaAfterDrink = 9000;
        while (vasya.getWeight() >= weightVasyaAfterDrink) {
            System.out.println("Vasya after drink -- "  + vasya.getStatus());
            if (weightVasyaAfterDrink == 9000) ;
            break;
        }

        Cat benedikt = new Cat();
        System.out.println("Benedikt -- " + benedikt.getWeight());

        double benediktAfterMeow = 1000;
        while (benedikt.getWeight() >= benediktAfterMeow) {
            benedikt.meow();
        }
        System.out.println("Benedikt after many meow -- " + benedikt.getStatus());


        Cat hehe = new Cat();
        hehe.meow();
        System.out.println("Hehe:  " + hehe.getWeight());


        Cat.getCount();

        Cat niki = new Cat();
        GetKitten(1100);
        GetKitten(1200);
        GetKitten();

        Cat xyi = new Cat("Jeny", 5, 2154.23);
        System.out.println("Меня зовут:  " + xyi.getCatName() + ", мне " +xyi.getCatAge() + " лет, а вешу я - " + xyi.getWeight() + "грамм.");

        Cat pidor = new Cat();
        pidor.setCatName(xyi.getCatName());
        pidor.setCatAge(xyi.getCatAge());
        pidor.setWeight(xyi.getWeight());
        System.out.println(pidor.getCatName());
        System.out.println(pidor.getCatAge());
        System.out.println(pidor.getWeight());

    }

    double startWeight;

    private static Cat GetKitten(double startWeight)
    {
        if(startWeight <= 1100)
        System.out.println("Return Cat   ><  this is kitten " + startWeight);
        return null;
    }
    private static Cat GetKitten()
    {
        System.out.println("Cat started;   ");

        return null;
    }


    }



