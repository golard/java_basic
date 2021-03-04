import com.skillbox.airport.Airport;

public class Loader
{
    public static void main(String[] args)// урок 3.5
    {
       /* Cat murzik = getKitty(1500.0 + 3000.0 * Math.random());
        murzik.setColor(CatColor.Black);//Урок 3.6
        System.out.println("Родился котенок с весом "+murzik.getWeight()+" и цветом: "+murzik.getColor());*/

        Cat m = new Cat();
        System.out.println(Cat.сount);
        System.out.println(m.getWeight());
        m.feed(20000.);
        Cat cat2 = Cat.makeTwin(m);
        System.out.println(Cat.сount);
        System.out.println(m.getWeight());
        System.out.println(cat2.getWeight());
        cat2.feed(20000.);
        System.out.println(Cat.сount);



        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts());
    }
    public static Cat getKitty(double weigth){// урок 3.5
        Cat cat = new Cat();
        return cat;
    }

}