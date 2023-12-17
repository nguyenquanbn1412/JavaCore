import java.util.Scanner;

public class BookController {
//    Book[] createArrBook(int n) {
//        return new Book[n];
//    }

    void findBookByName(Book[] bookArr, Scanner scn) {
        System.out.println("Nhap ten sach ban muon tim:");
        String strBookName = scn.nextLine();
        System.out.println("Sach voi ten ban da tim:");
        for (Book book : bookArr) {
            if (book.getTitle().contains(strBookName)) {
                System.out.println(book);
                return;
            }
        }
    }

    void findBookByCategory(Book[] bookArr, Scanner scn) {
        System.out.println("Nhap the loai sach ban muon tim:");
        String strBookCategory = scn.nextLine();
        System.out.println("Cac sach thuoc the loai ban da tim:");
        for (Book book : bookArr) {
            if (book.getCategory().contains(strBookCategory)) {
                System.out.println(book);
            }
        }
    }

    void lstBookPublisherInYear(Book[] bookArr, Scanner scn) {
        System.out.println("Nhap vao so nam xuat ban sach:");
        int year = scn.nextInt();
        System.out.println("Cac sach xuat ban trong nam vua nhap:");
        for (Book book :
                bookArr) {
            if (book.getYear() == year) {
                System.out.println(book);
            }
        }
    }
}
