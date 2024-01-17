import java.util.Date;
import java.util.List;

public class Movie {
    private int id;
    private String title;
    private List<String> category;
    private String director;
    private int length;
    private Date release;

    private int view;

    // Constructors
    public Movie() {
        // Default constructor
    }

    public Movie(int id, String title, List<String> category, String director, int length, Date release, int view) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.release = release;
        this.view = view;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }


    // Other methods as needed
}
