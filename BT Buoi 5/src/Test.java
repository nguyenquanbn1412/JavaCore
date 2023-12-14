public class Test {
    public static void main(String[] args) {
        String s1 = "this is index of example";

        //Truyền vào chuỗi con

        for (int i = 0; i < s1.length(); i++) {
            int index1 = s1.indexOf("i");
            int index2 = s1.indexOf("x");
            System.out.println(index1);
            System.out.println(index2);
        }

    }
}
