public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        //create the object and test arithmetics methodes
        Arithmetic arithmetic= new Arithmetic(10, 5);

        //testing arithmetics methodes
        System.out.println(arithmetic.summ());
        System.out.println(arithmetic.dif());
        System.out.println(arithmetic.multi());
        System.out.println(arithmetic.average());
        System.out.println(arithmetic.max());
        System.out.println(arithmetic.min());

        Printer printer1 = new Printer();
        //количество документов в очереди перед печатью
        System.out.println("Количество документов в очереди: " + printer1.countDocsInQueue);
        System.out.println("Количество страниц в очереди на печать: " + printer1.countPageInQueue);
        System.out.println("");

        printer1.append("Первый текст документа, ", "Без имени, ");
        printer1.append("Второй текст документа, ", "Это второе имя документа, ", 1);
        printer1.append("Третий текст документа, ", "Это третье имя теста, ");
        printer1.append("Четвертый текст документа, ");

        printer1.print();

        printer1.append("Пятый текст документа, ", "Это пятое имя теста, ");
        System.out.println("");
        printer1.print();
    }
}
