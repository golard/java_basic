import java.io.Serializable;

public class Cat
{
    private double originWeight;
    private double weight;

    public static final int eyes = 2;//урок 3.4
    private static final double minWeight = 1000.0; //я просто не создал новую а переделал эту урок 3.4
    private static final double maxWeight = 9000.0; //я просто не создал новую а переделал эту урок 3.4

    private double eating;//урок 3.2

    private String name;//урок 3.2

    static int сount;//урок 3.3
    private boolean flag;

    public Enum color;
    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        flag = true;
        сount++;
    }
    public Cat(double weight)// урок 3.5
    {
        if(weight>minWeight && weight<maxWeight){
            сount++;
            flag = true;
            this.weight=weight;
            originWeight = weight;
        }else{
            System.out.println("Кошка не может столько весить");
        }
    }
    public static Cat makeTwin(Cat cat)

    {
        Cat cat2 = new Cat();

        cat2.name=cat.getName();

        cat2.weight=cat.getWeight();

        cat2.color=cat.color;

        cat2.checkWeight();

        return cat2;
    }



    public void setName(String name){this.name=name;}//Урок 3.7
    public String getName(){//Урок 3.6
        return name;
    }

    public void meow()
    {
        if(flag){
            weight = weight - 1;
            checkWeight();
            System.out.println("Meow");
        }else {System.out.println("Кошка мертва , она больше не может мяукать");}
    }

    public void feed(Double amount)
    {
        if(flag){
            weight = weight + amount;
            checkWeight();
            eating +=amount;}else {System.out.println("Кошка мертва , она больше не может кушать");}
    }

    public void drink(Double amount)
    {
        if(flag){
            weight = weight + amount;
            checkWeight();
        }else {System.out.println("Кошка мертва , она больше не может пить");
        }}

    public Double getWeight() { return weight;}

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
    public void goToTheToilet() //урок 3.2
    {
        if(flag){
            weight-=2;
            checkWeight();
            System.out.println("Кошка сходила в туалет и похудела на 2 единицы");
        }else {System.out.println("Кошка мертва , она больше не может ходить в туалет");}
    }
    public Double getFood() //урок 3.2
    {
        System.out.print("За все время кошка съела : ");
        return eating;
    }
    static int getCount(){ //урок 3.3
        System.out.print("Всего живых кошек: ");
        return сount;
    }

    public void setColor(CatColor color){ //Урок 3.6
        this.color=color;
    }
    public Enum getColor(){//Урок 3.6
        return color;
    }
    private void checkWeight(){
        if(weight<minWeight || weight>maxWeight)
        {сount--;flag=false;
        }
    }
}