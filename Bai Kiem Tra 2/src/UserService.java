import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserService extends AUserManager implements IUserLogin, IUserRegister, IUserForgotPassword {
    void startProgram(Scanner scanner, String fileName) {
        try {
            while (true) {
                System.out.println("-----------------MENU-----------------");
                System.out.println("1. Dang nhap");
                System.out.println("2. Dang ky");
                System.out.println("3. Quen mat khau");
                System.out.println("4. Thoat");
                int optionMenu = checkIntNumber(scanner);
                scanner.nextLine();
                switch (optionMenu) {
                    case 1:
                        userLogin(scanner, fileName);
                        break;
                    case 2:
                        userRegister(scanner, fileName);
                        break;
                    case 3:
                        userForgotPassword(scanner, fileName);
                        break;
                    case 4:
                        return;
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
        while (true) {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1. Thay doi username");
            System.out.println("2. Thay doi email");
            System.out.println("3. Thay doi mat khau");
            System.out.println("4. Dang xuat");
            System.out.println("5. Thoat chuong trinh");
            int optionMenu = checkIntNumber(scanner);
            scanner.nextLine();
            switch (optionMenu) {
                case 1:
                    userChangeUsername(scanner, user, fileName);
                    break;
                case 2:
                    userChangeEmail(scanner, user, fileName);
                    break;
                case 3:
                    userChangePassword(scanner, user, fileName);
                    break;
                case 4:
                    userLogout(scanner, fileName);
                    return;
                case 5:
                    return;
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

    void printUser(List<User> users) {
        System.out.println("Thong tin user sau khi cap nhat!");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String userJson = gson.toJson(users);
        System.out.println(userJson);
    }

    @Override
    public void userRegister(Scanner scanner, String fileName) {
        try {
            System.out.println("***************DANG KY***************");
            System.out.println("Nhap username:");
            User user = new User();
            String username = scanner.nextLine();
            user.setUsername(username);
            System.out.println("Nhap email:");
            while (true) {
                String email = scanner.nextLine();
                if (checkLegalEmail(email)) {
                    if (!isExistsEmail(fileName, email)) {
                        user.setEmail(email);
                        break;
                    } else {
                        System.out.println("Tai khoan da ton tai!\nVui long nhap lai email:");
                    }
                } else {
                    System.out.println("Email khong hop le!\nVui long nhap lai email:");
                }
            }
            System.out.println("Nhap password:");
            String password = checkPassword(scanner);
            user.setPassword(password);
            ArrayList<User> users = new ArrayList<>(getListObjectFromJsonFile(fileName));
            users.add(user);
            convertObjectToJsonFile("user.json", users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void userLogin(Scanner scanner, String fileName) {
        try {
            System.out.println("***************DANG NHAP***************");
            System.out.println("Nhap email:");
            String email = scanner.nextLine();
            System.out.println("Nhap password:");
            String password = scanner.nextLine();
            List<User> users = getListObjectFromJsonFile(fileName);
            Optional<List<User>> usersOptional = Optional.ofNullable(users);
            if (usersOptional.isPresent()) {
                for (User user : users) {
                    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                        System.out.println("Xin chao " + user.getUsername() + "!\nBan co the thuc hien cac cong viec sau:");
                        loginSuccess(scanner, fileName, user);
                        return;
                    }
                }
                System.out.println("Tai khoan hoac mat khau khong chinh xac!\nVui long thu lai");
            } else {
                System.out.println("Tai khoan hoac mat khau khong chinh xac!\nVui long thu lai");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void userForgotPassword(Scanner scanner, String fileName) {
        System.out.println("Vui long nhap email cua ban:");
        String email = scanner.nextLine();
        if (isExistsEmail(fileName, email)) {
            while (true) {
                System.out.println("Vui long nhap mat khau moi:");
                String password = checkPassword(scanner);
                System.out.println("Nhap lai mat khau moi:");
                String passwordAgain = checkPassword(scanner);
                if (password.equals(passwordAgain)) {
                    System.out.println("Cai dat mat khau thanh cong!");
                    System.out.println("Vui long dang nhap lai!");
                    userLogin(scanner, fileName);
                    return;
                } else {
                    System.out.println("Mat khau khong trung khop!\nVui long nhap lai!");
                }
            }
        } else {
            System.out.println("Tai khoan khong ton tai!");
        }
    }

    @Override
    void userLogout(Scanner scanner, String fileName) {
        startProgram(scanner, fileName);
    }

    @Override
    void userChangeUsername(Scanner scanner, User user, String fileName) {
        ArrayList<User> users = new ArrayList<>(getListObjectFromJsonFile(fileName));
        int indexOfUser = users.indexOf(user);
        System.out.println("Nhap username moi:");
        String username = scanner.nextLine();
        user.setUsername(username);
        users.set(indexOfUser, user);
        System.out.println("Cap nhat username thanh cong!");
        //printUser(users);
        convertObjectToJsonFile("user.json", users);
    }

    @Override
    void userChangeEmail(Scanner scanner, User user, String fileName) {
        System.out.println("Nhap email moi:");
        while (true) {
            String email = scanner.nextLine();
            if (checkLegalEmail(email)) {
                if (!isExistsEmail(fileName, email)) {
                    ArrayList<User> users = new ArrayList<>(getListObjectFromJsonFile(fileName));
                    int indexOfUser = users.indexOf(user);
                    user.setEmail(email);
                    users.set(indexOfUser, user);
                    System.out.println("Cap nhat email thanh cong!");
                    //printUser(user);
                    convertObjectToJsonFile("user.json", users);
                    break;
                } else {
                    System.out.println("Email da ton tai!\nVui long nhap lai email:");
                }
            } else {
                System.out.println("Email khong hop le!\nVui long nhap lai email:");
            }
        }
    }

    @Override
    void userChangePassword(Scanner scanner, User user, String fileName) {
        ArrayList<User> users = new ArrayList<>(getListObjectFromJsonFile(fileName));
        int indexOfUser = users.indexOf(user);

        while (true) {
            System.out.println("Vui long nhap mat khau moi:");
            String password = checkPassword(scanner);
            System.out.println("Nhap lai mat khau moi:");
            String passwordAgain = checkPassword(scanner);
            if (password.equals(passwordAgain)) {
                user.setPassword(password);
                users.set(indexOfUser, user);
                convertObjectToJsonFile("user.json", users);
                System.out.println("Cap nhat mat khau thanh cong!");
                break;
            } else {
                System.out.println("Mat khau khong trung khop!\nVui long nhap lai!");
            }
        }

//        System.out.println("Nhap password moi:");
//        String password = scanner.nextLine();
//        user.setPassword(password);
//        users.set(indexOfUser, user);
//        System.out.println("Cap nhat password thanh cong!");
//        //printUser(user);
//        convertObjectToJsonFile("user.json", users);
    }

}
