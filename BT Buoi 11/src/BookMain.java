import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        String fileName = "E:\\Techmaster\\Java\\Java Core\\BaiTap\\BT Buoi 11\\assets\\book.json";
        BookService bookService = new BookService();
        //Lay thong tin toan bo sach
        List<Book> books = bookService.getListObjectFromJsonFile(fileName);
        bookService.printListBook(fileName, books);
        //Tim sach
        bookService.findBook(fileName);
        //Sap xep sach
        bookService.sortBook(fileName);
    }
}
