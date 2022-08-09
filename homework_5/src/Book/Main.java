package Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Adventures of Tom Sawyer", 378, 8);
        book1.printInfo();
        System.out.println();
        book2.printInfo();
        System.out.println();
        Book.BestRating(book1, book2);
    }
}
