import java.sql.SQLOutput;

public class Printer {
    String queue = "";
    String textDoc;
    String nameDoc;
    int pageCount;
    int documentsCount;
    int countPrintDocument;
    int printDocumentCount;

    public void append(String textDoc) {
        append("");
    }

    public void append(String textDoc, String nameDoc) {
        append(textDoc, nameDoc, 2);
    }

    public void append(String textDoc, String nameDoc, int pageCount) {
        queue = queue + "Имя документа: " + nameDoc + " Текст документа: " + textDoc + " Количество страниц: " + pageCount + "\n";
        countPrintDocument = countPrintDocument + pageCount;
    }

    public void clear() {
        queue = "";
        pageCount = 0;
    }

    public void print () {
        System.out.println(queue);
        clear();
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }

    public  int getPrintDocumentCount()  {
        return printDocumentCount;
    }
}
