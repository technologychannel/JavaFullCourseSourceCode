public class AbstactionWork {
    public static void main(String[] args) {
        HarryPoter h1 = new HarryPoter();
        h1.bookPages();

        ChinaHarayekoManxe c1 = new ChinaHarayekoManxe();
        c1.bookPages();
        c1.printBookDetails();

    }
}

abstract class Book{
    public abstract void bookPages();

    public void printBookDetails(){
        System.out.println("Book Details");
    }
}

class HarryPoter extends Book{
    public void bookPages(){
        System.out.println("100 page");
    }
}

class ChinaHarayekoManxe extends  Book{
    public void bookPages(){
        System.out.println("102 page");
    }
}
