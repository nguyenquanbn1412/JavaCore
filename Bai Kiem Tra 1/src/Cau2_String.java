import java.util.Scanner;

public class Cau2_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky: ");
        String str = scn.nextLine();
        System.out.println("So tu co trong chuoi vua nhap la: " + countWord(str));
        System.out.println("So luong ky tu 'o' trong chuoi la: " + countOInString(str));

    }

    //Dem so tu
    static int countWord(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }


    //Dem ky tu 'o'
    static int countOInString(String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        System.out.print("Ky tu 'o' co tai cac index sau: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'o') {
                System.out.print(i + "\t");
                count += 1;
            }
        }
        System.out.println();
        return count;
    }
}
