public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private String publisher;
    private int year;


    //Constructor


    private Book() {
    }

    private Book(int id, String title, String author, String category, String publisher, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.year = year;
    }

    public static Book createBook() {
        return new Book();
    }

    public static Book createBook1(int id, String title, String author, String category, String publisher, int year) {
        return new Book(id, title, author, category, publisher, year);
    }

    static void test(int a) {

    }

    void test() {

    }

    public Book createBook1() {
        return createBook1(id, title, author, category, publisher, year);
    }

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }


    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Book setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}
