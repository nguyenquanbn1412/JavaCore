import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Scanner;

public class UserService extends AUserManager implements IUserLogin, IUserRegister, IUserForgotPassword {

    void startProgram(Scanner scanner, String fileName) {
        try {
            int optionMenu = 0;
            while (optionMenu != 4) {
                System.out.println("-----------------MENU-----------------");
                System.out.println("1. Dang nhap");
                System.out.println("2. Dang ky");
                System.out.println("3. Quen mat khau");
                System.out.println("4. Thoat");
                optionMenu = checkIntNumber(scanner);
                scanner.nextLine();
                switch (optionMenu) {
                    case 1:
                        userLogin(scanner, fileName);
                        break;
                    case 2:
                        userRegister(scanner);
                        break;
                    case 3:
                        userForgotPassword(scanner, fileName);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Khong co chuc nang nay!");
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void loginSuccess(Scanner scanner, String fileName, User user) {
        int optionMenu = 0;
        while (optionMenu != 5) {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1. Thay doi username");
            System.out.println("2. Thay doi email");
            System.out.println("3. Thay doi mat khau");
            System.out.println("4. Dang xuat");
            System.out.println("5. Thoat chuong trinh");
            optionMenu = checkIntNumber(scanner);
            scanner.nextLine();
            switch (optionMenu) {
                case 1:
                    userChangeUsername(scanner, user);
                    break;
                case 2:
                    userChangeEmail(scanner, user);
                    break;
                case 3:
                    userChangePassword(scanner, user);
                    break;
                case 4:
                    userLogout(scanner, fileName);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Khong co chuc nang nay!");
                    break;
            }
        }
    }

    void printUser(User user) {
        System.out.println("Thong tin user sau khi cap nhat!");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String userJson = gson.toJson(user);
        System.out.println(userJson);
    }

    @Override
    public void userRegister(Scanner scanner) {
        try {
            System.out.println("Dang ky!");
            System.out.println("Nhap username:");
            User user = new User();
            String username = scanner.nextLine();
            user.setUsername(username);
            System.out.println("Nhap email:");
            String email = checkEmail(scanner);
            user.setEmail(email);
            System.out.println("Nhap password:");
            String password = checkPassword(scanner);
            user.setPassword(password);
            System.out.println(user.toString());
            convertObjectToJsonFile("user.json", user);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void userLogin(Scanner scanner, String fileName) {
        try {
            System.out.println("Dang nhap!");
            System.out.println("Nhap email:");
            String email = scanner.nextLine();
            System.out.println("Nhap password:");
            String password = scanner.nextLine();
            List<User> users = getListObjectFromJsonFile(fileName);
            for (User user : users) {
                if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                    System.out.println("Xin chao " + user.getUsername() + "!\nBan co the thuc hien cac cong viec sau:");
                    loginSuccess(scanner, fileName, user);
                    return;
                }
            }
            System.out.println("Email hoac mat khau khong chinh xac!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void userForgotPassword(Scanner scanner, String fileName) {
        System.out.println("Vui long nhap email cua ban:");
        String email = checkEmail(scanner);
        List<User> users = getListObjectFromJsonFile(fileName);
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                while (true) {
                    System.out.println("Vui long nhap mat khau moi:");
                    String password = checkPassword(scanner);
                    System.out.println("Nhap lai mat khau moi:");
                    String passwordAgain = checkPassword(scanner);
                    if (password.equals(passwordAgain)) {
                        System.out.println("Vui long dang nhap lai:");
                        userLogin(scanner, fileName);
                        return;
                    } else {
                        System.out.println("Mat khau khong trung khop!\nVui long nhap lai!");
                    }
                }

            }
        }
        System.out.println("Tai khoan khong ton tai!");
    }

    @Override
    void userLogout(Scanner scanner, String fileName) {
        startProgram(scanner, fileName);
    }

    @Override
    void userChangeUsername(Scanner scanner, User user) {
        System.out.println("Nhap username moi:");
        String username = scanner.nextLine();
        user.setUsername(username);
    }

    @Override
    void userChangeEmail(Scanner scanner, User user) {
        System.out.println("Nhap email moi:");
        String email = scanner.nextLine();
        user.setUsername(email);
        printUser(user);
    }

    @Override
    void userChangePassword(Scanner scanner, User user) {
        System.out.println("Nhap password moi:");
        String email = scanner.nextLine();
        user.setUsername(email);
        printUser(user);
    }
}
