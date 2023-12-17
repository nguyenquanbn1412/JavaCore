public class SerialMovie extends Movie {


    private int totalChap;
    private String mediumTime;

    public SerialMovie() {
    }

    public SerialMovie(int totalChap, String mediumTime) {
        this.totalChap = totalChap;
        this.mediumTime = mediumTime;
    }

    public int getTotalChap() {
        return totalChap;
    }

    public void setTotalChap(int totalChap) {
        this.totalChap = totalChap;
    }

    public String getMediumTime() {
        return mediumTime;
    }

    public void setMediumTime(String mediumTime) {
        this.mediumTime = mediumTime;
    }

}
