/*
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {

        //call method
        arrayOption(arr, n);
    }

    static void menuArrOption() {
        int m = 0, n = 0;
        //int[] arr = null;
        while (m != 5) {
            System.out.println("**********MENU**********");
            System.out.println("1. Khoi tao mang");
            System.out.println("2. Nhap phan tu cho mang");
            System.out.println("3. In mang ra man hinh");
            System.out.println("4. Thay doi so chan trong mang (Neu co)");
            System.out.println("5. Thoat");

            Scanner scn = new Scanner(System.in);
            m = scn.nextInt();
            switch (m) {
                case 1:
                  int[] arr =  initialArr();
                    break;
                case 2:
                    inputForArr(arr, n);
                    break;
                case 3:
                    printArr(arr);
                    break;
                case 4:
                    changeArr(arr, n);
                    break;
                default:
                    break;
            }
        }
    }

    static int[] initialArr() {
        //initial array
        System.out.println("Ban chuan bi khoi tao mang, hay nhap so phan tu cho mang: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        return new int[n];
    }

    static void inputForArr(int[] arr, int n) {
        System.out.println("Nhap tung phan tu cho mang:");
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static void printArr(int[] arr) {
        System.out.println("Mang sau khi da nhap phan tu:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void changeArr(int[] arr, int n) {
        System.out.println("Mang sau khi tang cac so chan len 1 don vi:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            System.out.print(arr[i] + " ");
        }
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
*/
