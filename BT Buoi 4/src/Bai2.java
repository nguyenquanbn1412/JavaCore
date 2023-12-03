import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //initial array
        System.out.println("Ban chuan bi khoi tao mang, hay nhap so phan tu cho mang: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        //call method
        arrayOption(arr, n);
    }

    static void arrayOption(int[] arr, int n) {
        //input for arr
        System.out.println("Nhap tung phan tu cho mang:");
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        //print arr
        System.out.println("Mang sau khi da nhap phan tu:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        //change arr
        System.out.println("Mang sau khi tang cac so chan len 1 don vi:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
