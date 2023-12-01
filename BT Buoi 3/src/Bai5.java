import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh cua hinh cau:");
        double r = scn.nextDouble();
        sphericalVolume(r);
    }

    static void sphericalVolume(double radius) {
        if (radius > 0)
        {
            double volume = (4 * Math.PI * (Math.pow(radius, 3))) / 3;
            System.out.println("The tich hinh cau la: " + volume);
        }
        else
        {
            System.out.println("Gia tri khong hop le!");
        }
    }
}
