package Book;

public class Book {
    String title;
    int PagesCount;
    int Rating;

    Book(){
        title = "Harry Potter";
        PagesCount = 435;
        Rating = 9;
    }

    Book(String name, int PagesCount, int Rating){
        this.title = name;
        this.PagesCount = PagesCount;
        this.Rating = Rating;
    }

    void printInfo(){
        System.out.println("Title of the book: " + this.title);
        System.out.println("Pages Count: " + this.PagesCount + " pages");
        System.out.println("Rating of the book: " + this.Rating + "/10");
    }

    static void BestRating(Book a, Book b){
        if (a.Rating > b.Rating){
            System.out.println("The rating of the book '" + a.title + "' is better than the rating of the book '" + b.title + "'");
        }
        if (a.Rating < b.Rating){
            System.out.println("The rating of the book '" + b.title + "' is better than the rating of the book " + a.title + "'");
        }
        if (a.Rating == b.Rating){
            System.out.println("Their ratings are the same");
        }
    }
}
