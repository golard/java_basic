import java.sql.SQLOutput;

public class Printer {
    String queue = "";
    String textDoc = "The new text in the document";
    String nameDoc = "New document";
    int pageCount;
    int documentsCount;
    int getPrintDocumentCount;


    public void append(String textDoc) {
        append(textDoc, "Платежи", 5);

    }

    public void append(String textDoc, String nameDoc) {
        append(textDoc, "Переводы", 9);
    }


    public void append(String textDoc, String nameDoc, int pageCount) {
        append("Document", "Отчеты");
    }

    public void clear() {
        queue = "";
    }

    public void print () {
        System.out.println("Текс документа: " + textDoc + "\n"
                + "Количество страниц: " + pageCount
                + "Количество документов: " + documentsCount);
        clear();
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }

    public static int getPrintDocumentsCount()  {
        return  getPrintDocumentsCount();
    }
}
