
    import java.util.Scanner;

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    public class Bai1 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Nhập chiều dài hcn:");
            float a = scn.nextFloat();
            System.out.println("Nhập chiều rộng hcn:");
            float b = scn.nextFloat();
            System.out.println("Chu vi hcn là: " + perimeterRectangle(a, b));
            System.out.println("Diện tích hcn là: " + acreageRectangle(a, b));
        }

        static float perimeterRectangle(float a, float b) {
            return 2 * (a + b);
        }

        static float acreageRectangle(float a, float b) {
            return a * b;
        }
    }
