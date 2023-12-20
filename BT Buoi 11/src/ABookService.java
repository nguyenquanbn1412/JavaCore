import java.util.List;
import java.util.Scanner;

public abstract class ABookService {
    abstract List<Book> getListObjectFromJsonFile(String fileName);

    abstract void printListBook(String fileName, List<Book> books);

    abstract int checkIntNumber(Scanner scn);
}
