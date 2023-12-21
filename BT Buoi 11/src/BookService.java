

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BookService extends ABookService implements IBookService_Find, IBookService_Sort {
    @Override
    public List<Book> getListObjectFromJsonFile(String fileName) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            List<Book> books = Arrays.asList(gson.fromJson(reader, Book[].class));
            reader.close();
            return books;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    void printListBook(String fileName, List<Book> books) {
        try {
            Optional<List<Book>> bookOptionals = Optional.ofNullable(books);
            System.out.println("Thong tin toan bo sach (Dang JSON):");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            if (bookOptionals.isPresent()) {
                String studentJson = gson.toJson(books);
                System.out.println(studentJson);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    int checkIntNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    @Override
    public void findBook(String fileName) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Book> lstBooks = getListObjectFromJsonFile(fileName);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            int optionFind = 0;
            while (optionFind != 3) {
                System.out.println("Ban muon tim sach theo:");
                System.out.println("1. Tim theo ten");
                System.out.println("2. Tim theo the loai");
                System.out.println("3. Thoat");
                optionFind = checkIntNumber(scanner);
                scanner.nextLine();
                switch (optionFind) {
                    case 1:
                        System.out.println("Nhap ten sach:");
                        String strBookName = scanner.nextLine();
                        for (Book book : lstBooks) {
                            if (book.getTitle().equals(strBookName)) {
                                System.out.println("Sach ban can tim la:");
                                //System.out.println(book.toString());
                                String studentJson = gson.toJson(book);
                                System.out.println(studentJson);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhap the loai sach:");
                        String strBookCategory = scanner.nextLine();
                        System.out.println("Cac dau sach ban can tim la:");
                        for (Book book : lstBooks) {
                            boolean contains = Arrays.asList(book.getCategory()).contains(strBookCategory);
                            if (contains) {
                                String studentJson = gson.toJson(book);
                                System.out.println(studentJson);
                            }
                        }
                        break;
                    case 3:
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

    @Override
    public void sortBook(String fileName) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Book> lstBooks = getListObjectFromJsonFile(fileName);
            int optionSort = 0;
            while (optionSort != 3) {
                System.out.println("Chon kieu sap xep ma ban muon:");
                System.out.println("1. Sap xep theo so trang");
                System.out.println("2. Sap xep theo nam xuat ban");
                System.out.println("3. Thoat");
                optionSort = checkIntNumber(scanner);
                switch (optionSort) {
                    case 1:
                        System.out.println("Cac dau sach sau khi sap xep:");
                        lstBooks.sort(Comparator.comparing(Book::getPage_number));
                        printListBook(fileName, lstBooks);
                        break;
                    case 2:
                        System.out.println("Cac dau sach sau khi sap xep:");
                        lstBooks.sort(Comparator.comparing(Book::getRelease_year));
                        printListBook(fileName, lstBooks);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Khong co kieu sap xep khac!");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
