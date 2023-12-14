public class Calculator {
    private int number1;
    private int number2;

    void printInfo() {
        System.out.println(number1);
        System.out.println(number2);
    }

    int addition(int number1, int number2) {
        return number1 + number2;
    }

    int subtract(int number1, int number2) {
        return number1 - number2;
    }

    int multi(int number1, int number2) {
        return number1 * number2;
    }

    double division(int number1, int number2) {
        return (double) number1 / number2;
    }
}
