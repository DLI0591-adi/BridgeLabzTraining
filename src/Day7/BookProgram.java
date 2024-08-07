package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}

class BookRecommendation {
    String title;
    double rating;

    @Override
    public String toString() {
        return "BookRecommendation{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }
}

public class BookProgram {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("1984", "George Orwell", "Dystopian Fiction", 4.5));
        list.add(new Book("To Kill a Mockingbird", " Harper Lee", "Science Fiction", 4.8));
        list.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic American Literature", 4.2));
        list.add(new Book("Pride and Prejudice", "Jane Austen", "Historical Romance", 4.6));

        System.out.println("Filter : ");
        list.stream().filter(a -> a.genre.equals("Science Fiction") && a.rating > 4.0).forEach(System.out::println);

        List<BookRecommendation> newlist = new ArrayList<>();
        newlist.add(new BookRecommendation("To Kill a Mockingbird", 4.8));
        newlist.add(new BookRecommendation("1984", 4.5));
        newlist.add(new BookRecommendation("The Great Gatsby", 4.2));
        newlist.add(new BookRecommendation("Pride and Prejudice", 4.6));

        System.out.println("\nSorted : ");
        newlist.stream().sorted((a, b) -> Double.compare(b.rating, a.rating)).forEach(System.out::println);

        System.out.println("\n Paginate : ");
        List<BookRecommendation> filteredAndSortedBooks = list.stream()
                .filter(book -> book.getGenre().equals("Science Fiction") && book.getRating() > 4.0)
                .map(book -> new BookRecommendation(book.getTitle(), book.getRating()))
                .sorted((br1, br2) -> Double.compare(br2.rating, br1.rating))
                .limit(10)
                .collect(Collectors.toList());
        List<BookRecommendation> paginatedBooks = new ArrayList<>();
        for (int i = 0; i < filteredAndSortedBooks.size(); i += 10) {
            paginatedBooks.addAll(filteredAndSortedBooks.stream()
                    .skip(i)
                    .limit(10)
                    .collect(Collectors.toList()));
        }
        paginatedBooks.forEach(System.out::println);


    }
}