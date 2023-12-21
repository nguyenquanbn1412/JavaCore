import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        String fileName = "user.json";
        userService.startProgram(scanner, fileName);
    }
}
