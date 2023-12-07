public class Cau4_ListedPrimeNumber {
    public static void main(String[] args) {
        listedTenPrimeNumbers();
        listedPrimeNumbersLessThanTen();
    }

    //Danh sach 10 snt dau tien
    static void listedTenPrimeNumbers() {
        int i = 2, count = 0;
        System.out.println("Muoi so nguyen to dau tien la: ");
        while (count < 10) {
            if (isPrimeNumber(i)) {
                System.out.print(i + "\t");
                count++;
            }
            i++;
        }
        System.out.println();
    }

    //danh sach snt nho hon 10
    static void listedPrimeNumbersLessThanTen() {
        System.out.println("Cac so nguyen to nho hon 10 la: ");
        for (int i = 2; i < 10; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    //kiem tra snt
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
