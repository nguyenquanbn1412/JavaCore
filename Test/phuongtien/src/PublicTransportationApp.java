import java.util.Scanner;

// Lớp trừu tượng TransportationVehicle đại diện cho phương tiện giao thông công cộng
abstract class TransportationVehicle {
    // Hằng số tốc độ của các phương tiện
    protected static final int BUS_SPEED = 20; // km/h
    protected static final int TRAIN_SPEED = 40; // km/h
    protected static final int AIRPLANE_SPEED = 80; // km/h

    // Phương thức trừu tượng tính thời gian đến nơi
    public abstract double calculateTime(double distance);
}

// Lớp con Bus kế thừa từ lớp TransportationVehicle
class Bus extends TransportationVehicle {
    @Override
    public double calculateTime(double distance) {
        return distance / BUS_SPEED;
    }
}

// Lớp con Train kế thừa từ lớp TransportationVehicle
class Train extends TransportationVehicle {
    @Override
    public double calculateTime(double distance) {
        return distance / TRAIN_SPEED;
    }
}

// Lớp con Airplane kế thừa từ lớp TransportationVehicle
class Airplane extends TransportationVehicle {
    @Override
    public double calculateTime(double distance) {
        return distance / AIRPLANE_SPEED;
    }
}

// Lớp chứa phương thức main để thực thi ứng dụng
public class PublicTransportationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào quãng đường
        System.out.print("Nhập vào quãng đường (km): ");
        double distance = scanner.nextDouble();

        // Tạo các đối tượng phương tiện
        Bus bus = new Bus();
        Train train = new Train();
        Airplane airplane = new Airplane();

        // Tính thời gian đến nơi cho từng phương tiện
        double busTime = bus.calculateTime(distance);
        double trainTime = train.calculateTime(distance);
        double airplaneTime = airplane.calculateTime(distance);

        // Hiển thị thông tin
        System.out.println("Thời gian đến nơi:");
        System.out.println("Xe buýt: " + busTime + " giờ");
        System.out.println("Tàu hỏa: " + trainTime + " giờ");
        System.out.println("Máy bay: " + airplaneTime + " giờ");

        scanner.close();
    }
}
