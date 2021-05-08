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

        printer1.append("Первый текст документа", "Это первое имя документа");
        printer1.append("Второй текст документа", "Это второе имя документа");
        printer1.append("Третий текст документа", "Это третье имя документа");

        printer1.print();
    }
}
