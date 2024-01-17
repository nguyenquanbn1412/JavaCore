import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    //    public static void main(String[] args) {
//        // Tạo đối tượng gson
//        // Gson gson = new Gson();
//
//        // Khởi tạo Object student
//        Student student = new Student(1, "Bùi Hiên", 25, "hien@techmaster.vn");
//
//        // Ghi đối tượng student vào file "student.json"
//        convertObjectToJsonFile("new student.json", student);
//
//        // ********************************************
//
//        // Khởi tạo danh sách student
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Nguyễn A", 30, "a@gmail.com"));
//        students.add(new Student(2, "Ngô B", 31, "b@gmail.com"));
//        students.add(new Student(3, "Trần C", 23, "c@gmail.com"));
//        students.add(new Student(4, "Phan D", 26, "d@gmail.com"));
//
//        // Ghi danh sách student vào file "list-student.json"
//        convertObjectToJsonFile("list-student.json", students);
//    }
//    public static void convertObjectToJsonFile(String fileName, Object obj) {
//        try {
//            // Tạo đối tượng gson
//            // Gson gson = new Gson();
//
//            // Nếu muốn format JSON cho đẹp
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//            // Tạo đối tượng Writer để ghi nội dung vào file
//            Writer writer = Files.newBufferedWriter(Paths.get(fileName));
//
//            // Ghi object vào file
//            gson.toJson(obj, writer);
//
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        // Triển khai functional interface
        Student student = new Student(1, "Bùi Hiên", 25, "hiengmail.com");
        IStudent iStudent = student::printInfo;
        iStudent.display();

        // Tham chiếu đến method của 1 instance
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bùi Hiên", 25, "hiengmail.com"));
        students.add(new Student(2, "Thu Hằng", 25, "hanggmail.com"));
        students.add(new Student(3, "Phương Loan", 25, "loangmail.com"));

        students.forEach(Student::printInfo);
        students.forEach(System.out::println);

        // Sắp xếp theo tên
        students.sort(Comparator.comparing(Student::getName));
        students.forEach(System.out::println);
    }
}
