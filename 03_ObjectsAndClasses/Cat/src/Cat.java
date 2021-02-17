import java.io.Serializable;

public class Cat
{
    private double originWeight;
    public double weight;

    private double minWeight;
    private double maxWeight;
    public double totalFoodWeight;
    static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        totalFoodWeight = 0;
        // pee = 100.0;
        count++;

    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        if(weight < maxWeight) {
            weight = weight + amount;
            System.out.println("Кошка поела:" + weight);
            if (weight > maxWeight) {
                count--;
        }

        }
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getTotalFoodWeight () {       //Сумма общего корма кота
        return totalFoodWeight;
    }

    public Double pee () {
        weight = weight - 100.0;
        return weight;
    }

    public String getStatus() {
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

    public static int count () {
        return count;
    }

    static int getCount() {
        return count;
    }
}