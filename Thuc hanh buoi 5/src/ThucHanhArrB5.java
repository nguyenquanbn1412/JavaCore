public class ThucHanhArrB5 {
    public static void main(String[] args) {
        String str = "abcdef0123456789";
        System.out.println("Mau HEX ngau nhien lan nay la:");
        System.out.print("#");
        randomHEXColor(str);
    }

    static void randomHEXColor(String str) {
        if (str.length() >= 6) {
            char[] arrChar = str.toCharArray();
            for (int i = 0; i < 6; i++) {
                int randomChar = (int) (Math.random() * (arrChar.length - 1));
                System.out.print(arrChar[randomChar]);
            }
        } else {
            System.out.println("Dieu kien khong phu hop!");
        }
    }
}

