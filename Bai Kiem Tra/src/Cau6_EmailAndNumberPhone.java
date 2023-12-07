import java.util.Scanner;
import java.util.regex.Pattern;

public class Cau6_EmailAndNumberPhone {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 email:");
        String strEmail = scn.nextLine();
        checkEmail(strEmail);
        System.out.println("Nhap vao 1 so dien thoai:");
        String str = scn.nextLine();
        checkNumberPhone(str);
    }


    //Kiem tra email
    static void checkEmail(String str) {

        //Check email hop le
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        if (Pattern.matches(EMAIL_PATTERN, str)) {
            System.out.println("Email hop le!");
        } else {
            System.out.println("Email khong hop le!");
        }
    }

    //kiem tra sdt
    static void checkNumberPhone(String strNumberPhone) {
        Pattern pattern = Pattern.compile("\\d{9,11}");
        boolean isNumberPhone = pattern.matcher(strNumberPhone).matches();
        if (isNumberPhone) {
            System.out.println("So dien thoai hop le!");
        } else {
            System.out.println("So dien thoai khong hop le!");
        }
    }
}
