class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    void displayAuthor() {
        System.out.println("Author Name: " + name);
        System.out.println("Author Email: " + email);
        System.out.println("Author Gender: " + gender);
    }
}

public class Book {
    String name;
    Author author;
    double price;
    int instock;

    Book(String name, Author author, double price, int instock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.instock = instock;
    }

    void displayBook() {
        System.out.println("Book Name: " + name);
        author.displayAuthor();
        System.out.println("Book Price: " + price);
        System.out.println("In Stock: " + instock);
    }

    public static void main(String[] args) {
        Author a = new Author("James", "james@gmail.com", 'M');

        Book b = new Book("Java Programming", a, 500.0, 20);

        b.displayBook();
    }
}