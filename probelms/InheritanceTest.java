public class InheritanceTest {
    public static void main(String[] args) {
        Ebook java = new Ebook();
        int chapter=8, pages=500;
        Ebook c=new Ebook(chapter, pages, "pdf");
        Book b= java;
        b.printSummary();
        b=c;
        b.printSummary();
    }
}
class Book{
    public int chapter;
    public int pages;
    Book(){}
    public Book(int chapter, int pages){
        this.chapter=chapter;
        this.pages=pages;
    }
    public void printSummary(){
        System.out.println(chapter);
        System.out.println(pages);
    }
}
class Ebook extends Book{
    public String format;
    Ebook(){}
    Ebook(int chapter, int pages, String format){
        super(chapter, pages);
        this.format=format;
    }
    public void printSummary(){
        super.printSummary();
        System.out.println(format);
    }}