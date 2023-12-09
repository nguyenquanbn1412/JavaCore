public class ThucHanhArrB6 {
    public static void main(String[] args) {
        System.out.println("Mau RGB ngau nhien lan nay la:");
        System.out.print("rgb(");
        randomRGBColor();
        System.out.print(")");
    }

    static void randomRGBColor() {
        for (int i = 0; i < 3; i++) {
            int randomChar = (int) (Math.random() * 255);
            System.out.print(randomChar);
            if (i < 2) {
                System.out.print(",");
            }
        }
    }
}

