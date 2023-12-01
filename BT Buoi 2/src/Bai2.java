import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn:");
        String fullName = scn.nextLine();
        System.out.println("Nhập vào tuổi của bạn:");
        int age = scn.nextInt();
        scn.nextLine();
        System.out.println("Nhập vào giới tính của bạn:");
        String sex = scn.nextLine();
        System.out.println("Nhập vào địa chỉ của bạn:");
        String address = scn.nextLine();
        System.out.println("Xin chào các bạn, mình tên là " + fullName + ", năm nay mình " + age + " tuổi, giới tính " + sex + ". Hiện mình đang sống và làm việc tại " + address + ".");
    }
}
