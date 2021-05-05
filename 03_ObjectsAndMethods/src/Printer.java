public class Printer {
    String queue = "";
    String textDoc;
    String nameDoc;
    int pageCount;
    int documentsCount;
    int printDocumentsCount;

    //Methode with only doc text
    public void append(String textDoc) {
        append(textDoc);
    }

    //Methode with doc text and name text
    public void append(String textDoc, String nameDoc) {
        append(textDoc, nameDoc);
    }

    //Methode with doc text, name text and page count
    public void append(String textDoc, String nameDoc, int pageCount) {
        append(textDoc, nameDoc, pageCount);
    }

    public void clear() {
        queue = "";
    }

    public void print () {
        System.out.println("Текс документа: " + textDoc + "\n"
                + "Имя документа: " + nameDoc + "\n"
                + "Количество страниц: " + pageCount);
        queue = "";
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }

    public int getPrintDocumentsCount() {
        return  printDocumentsCount;
    }
}
