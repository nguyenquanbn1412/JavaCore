import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        
        Book[] bookArr = new Book[3];
        bookArr[0] = Book.newBook().setId(1).setTitle("Dinh ly cuoi cung cua Fermat")
                .setAuthor("Simon Singh").setCategory("Toan hoc").setPublisher("NXB Tre")
                .setYear(1893).createBook();
        bookArr[1] = Book.newBook().setId(1).setTitle("Luoc Su Thoi Gian")
                .setAuthor("Stephen Hawking").setCategory("Vat Ly").setPublisher("Nha Nam")
                .setYear(1972).createBook();
        bookArr[2] = Book.newBook().setId(1).setTitle("Khong gia dinh")
                .setAuthor("Hector Malot").setCategory("Van hoc").setPublisher("Kim Dong")
                .setYear(1921).createBook();

        BookController bookController = new BookController();
        Scanner scn = new Scanner(System.in);
        bookController.findBookByName(bookArr, scn);
        bookController.findBookByCategory(bookArr, scn);
        bookController.lstBookPublisherInYear(bookArr, scn);
    }
}
