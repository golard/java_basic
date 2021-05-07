public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        //create the object and test arithmetics methodes
        Arithmetic arithmetic= new Arithmetic();

        /*testing arithmetics methodes
        System.out.println(arithmetic.summ());
        System.out.println(arithmetic.dif());
        System.out.println(arithmetic.multi());
        System.out.println(arithmetic.average());
        System.out.println(arithmetic.max());
        System.out.println(arithmetic.min());
         */

        Printer printer1 = new Printer();
        //System.out.println(printer1.append()); //Работать не будет, потому что нет параметра у append
        //System.out.println(printer1.append(printer1.textDoc, printer1.nameDoc)); так тоже не работает, а почему?
        //
        //System.out.println(printer1.append("Document", "Переводы")); //Почему так тоже не работает?
    }
}
