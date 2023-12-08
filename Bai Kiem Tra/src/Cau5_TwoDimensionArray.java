import java.util.Scanner;

public class Cau5_TwoDimensionArray {
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
        itemOfDiagonalLine(arr);
        duplicateArray(arr);
    }


    //kiem tra thao tac nhap so
    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    //nhap thong so cho mang
    static void inputForArr(Scanner scn, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                arr[i][j] = checkIsNumber(scn);
            }
        }
    }

    //in mang ra man hinh
    static void printArr(int[][] arr) {
        System.out.println("In mang ra man hinh:");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println("\n");
        }
    }


    //phan tu duong cheo
    static void itemOfDiagonalLine(int[][] arr) {
        System.out.println("Cac phan tu nam tren duong cheo chinh:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i || j == arr.length - i - 1) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }


    //cong 2 mang
    static void duplicateArray(int[][] firstArr) {

        //Gia su mang 2 = mang 1 (khong can nhap lai phan tu)
        int[][] secondArr = firstArr;
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < firstArr[i].length; j++) {
                firstArr[i][j] += secondArr[i][j];
            }
        }
        System.out.println("Ket qua khi cong 2 mang voi nhau:");
        printArr(firstArr);
    }
}
