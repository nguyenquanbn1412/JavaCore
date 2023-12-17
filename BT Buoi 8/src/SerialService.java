import java.util.Scanner;

public class SerialService {
    SerialMovie[] createSerialArr() {
        SerialMovie[] serialArr = new SerialMovie[3];
        SerialMovie serial1 = new SerialMovie();
        serial1.setId(1);
        serial1.setTitle("Nhiem Vu Bat Kha Thi");
        serial1.setCategory("Action");
        serial1.setDirector("Tom Cruise");
        serial1.setReleaseDate("2000-12-11");
        serial1.setTime("11:00:00");
        serial1.setTotalChap(4);
        serial1.setMediumTime("05:00:00");
        serialArr[0] = serial1;
        SerialMovie serial2 = new SerialMovie();
        serial2.setId(2);
        serial2.setTitle("Chua Te Cua Nhung Chiec Nhan");
        serial2.setCategory("Science");
        serial2.setDirector("Peter Jackson");
        serial2.setReleaseDate("2002-11-11");
        serial2.setTime("06:00:00");
        serial2.setTotalChap(5);
        serial2.setMediumTime("07:00:00");
        serialArr[1] = serial2;
        SerialMovie serial3 = new SerialMovie();
        serial3.setId(3);
        serial3.setTitle("Harry Potter");
        serial3.setCategory("Science");
        serial3.setDirector("Rowling");
        serial3.setReleaseDate("2005-05-11");
        serial3.setTime("09:00:00");
        serial3.setTotalChap(6);
        serial3.setMediumTime("10:00:00");
        serialArr[2] = serial3;
        return serialArr;
    }

    void printSerialMovie(SerialMovie[] serialsArr) {
        for (SerialMovie serialMovie :
                serialsArr) {
            System.out.println(serialMovie.getId() + " - " + serialMovie.getTitle() + " - "
                    + serialMovie.getCategory() + " - " + serialMovie.getDirector() + " - "
                    + serialMovie.getTime() + " - " + serialMovie.getTotalChap()
                    + " - " + serialMovie.getMediumTime());
        }
    }

    void findMovieByTitle(SerialMovie[] serials) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao tieu de phim ban muon tim:");
        String title = scn.nextLine();
        for (SerialMovie serialMovie :
                serials) {
            if (serialMovie.getTitle().contains(title)) {
                System.out.println("Phim ban can tim la: ");
                System.out.println(serialMovie.getId() + " - " + serialMovie.getTitle() + " - "
                        + serialMovie.getCategory() + " - " + serialMovie.getDirector() + " - "
                        + serialMovie.getTime() + " - " + serialMovie.getTotalChap()
                        + " - " + serialMovie.getMediumTime());
            }
        }
    }
}
