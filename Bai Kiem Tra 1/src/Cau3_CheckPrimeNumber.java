public class Cau3_CheckPrimeNumber {
    public static void main(String[] args) {
        int max = 100;
        //Lay so ngau nhien
        int m = (int) (Math.random() * max);
        System.out.println("So ngau nhien vua sinh ra la: " + m);
        if (isPrimeNumber(m)) {
            System.out.println(m + " la so nguyen to!");
        } else {
            System.out.println(m + " khong la so nguyen to!");
        }
    }

    //Kiem tra SNT
    static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
