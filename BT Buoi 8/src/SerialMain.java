public class SerialMain {
    public static void main(String[] args) {
        SerialService serial = new SerialService();
        SerialMovie[] serials = serial.createSerialArr();
        serial.printSerialMovie(serials);
        serial.findMovieByTitle(serials);
    }

}
