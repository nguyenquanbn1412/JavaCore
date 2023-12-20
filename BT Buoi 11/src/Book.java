import java.util.Arrays;

public class Book {
    // id, title, category, author, page_number, release_year, với category là một mảng String
    private int id;
    private String title;
    private String[] category;
    private String author;
    private int page_number;
    private int release_year;

    private Book() {
    }

    public Book(int id, String title, String[] category, String author, int page_number, int release_year) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.page_number = page_number;
        this.release_year = release_year;
    }

    public static Book newStudent() {
        return new Book();
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

    public String[] getCategory() {
        return category;
    }

    public Book setCategory(String[] category) {
        this.category = category;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public int getPage_number() {
        return page_number;
    }

    public Book setPage_number(int pageNumber) {
        return this;
    }

    public int getRelease_year() {
        return release_year;
    }

    public Book setRelease_year(int releaseYear) {
        return this;
    }

    public Book createStudent() {
        return new Book(id, title, category, author, page_number, release_year);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + Arrays.toString(category) +
                ", author='" + author + '\'' +
                ", page_number=" + page_number +
                ", release_year=" + release_year +
                '}';
    }
}
