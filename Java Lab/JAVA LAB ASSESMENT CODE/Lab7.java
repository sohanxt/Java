

class Book {
    protected String title;

    public void setTitle(String t) {
        title = t;
        System.out.println("book name " + title);
    }
}
class Ebook extends Book {
    void displayFormat(String format) {
        System.out.println("book title " + title + " Format " + format);
    }
}


public class Lab7 {

   
    public static void main(String[] args) {
         Ebook b1 = new Ebook();
        b1.setTitle("Novel book");
        b1.displayFormat("Ebook");

    }
    
}
