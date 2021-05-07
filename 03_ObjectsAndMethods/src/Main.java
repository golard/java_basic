public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        //create the object and test arithmetics methodes
        Arithmetic arithmetic= new Arithmetic();

        System.out.println(arithmetic.summ());
        System.out.println(arithmetic.dif());
        System.out.println(arithmetic.multi());
        System.out.println(arithmetic.average());
        System.out.println(arithmetic.max());
        System.out.println(arithmetic.min());
    }
}
