import java.util.Scanner;

public class ThucHanhMangDaChieu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ban dang khoi tao mang 2 chieu!");
        System.out.println("Nhap vao so dong cua mang: ");
        int a = checkIsNumber(scn);
        System.out.println("Nhap vao so cot cua mang: ");
        int b = checkIsNumber(scn);
        int[][] arr = new int[a][b];
        inputForArr(scn, arr);
        printArr(arr);
        sumOfEvenNumber(arr);
        maxOfArr(arr);
    }

    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    static void inputForArr(Scanner scn, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                arr[i][j] = checkIsNumber(scn);
            }
        }
    }

    static void printArr(int[][] arr) {
        System.out.println("In mang ra man hinh:");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println("\n");
        }
    }

    static void sumOfEvenNumber(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    sum += anInt;
                }
            }
        }
        System.out.println("Tong cac phan tu chan co trong mang la: " + sum);
    }

    static void maxOfArr(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);
    }
}
