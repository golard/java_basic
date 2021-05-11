public class Printer {
    String queue = "";

    int countPageInQueue;
    int countDocsInQueue;

    int countPrintedPages;
    int countPrintedDocs;

    public void append(String textDoc) {
        append(textDoc, "Без имени, ");
    }

    public void append(String textDoc, String nameDoc) {
        append(textDoc, nameDoc, 1);
    }

    public void append(String textDoc, String nameDoc, int pageCount) {
        queue = queue + "Имя документа: " + nameDoc + " Текст документа: " + textDoc + " Количество страниц: " + pageCount + "\n";
        countPageInQueue = countPageInQueue + pageCount;
        countDocsInQueue = countDocsInQueue + 1;
    }

    public void clear() {
        queue = "";
        countPageInQueue = 0;
        countDocsInQueue = 0;
    }

    public void print () {
        if(queue.equals("")) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(queue);
        countPrintedPages = countPageInQueue + countPrintedPages;
        countPrintedDocs = countDocsInQueue + countPrintedDocs;

        System.out.println("Идет печать, пожалуйста, подождите..." + "\n");

        System.out.println("Количество всего напечатанных документов: " + countPrintedDocs);
        System.out.println("Количество всего напечатанных страниц: " + countPrintedPages);
        clear();
    }

    public int getPageCount() {
        return countPrintedPages;
    }

    public int getCountPrintedDocs() {
        return countPrintedDocs;
    }

    public  int getCountDocsInQueue()  {
        return countDocsInQueue;
    }
}
