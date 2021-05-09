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
        queue = queue + "Имя документа:" + nameDoc + "Текст документа:" + textDoc + "Количество страниц:" + pageCount + "\n";
        getPrintDocumentCount = getPrintDocumentCount + pageCount;
    }

    public void clear() {
        queue = "";
    }

    public void print () {
        System.out.printf(queue);
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
