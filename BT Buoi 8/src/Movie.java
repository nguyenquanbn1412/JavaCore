public class Movie extends Film {
    //Movie movie = new Movie();
    private String time;

    public Movie() {
    }

    public Movie(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
