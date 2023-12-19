import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        //Create List
        List<Student> lstStudents = studentService.createListStudent();
        //Display List
        System.out.println("Hien thi danh sach sinh vien!");
        studentService.viewListStudent(lstStudents, null);
        //Display List by name
        System.out.println("-------------------------------------------");
        System.out.println("Hien thi danh sach sinh vien theo ten lop!");
        System.out.println("Nhap vao ten lop hoc ma ban muon xem danh sach:");
        String studentClassroom = new Scanner(System.in).nextLine();
        System.out.println("Danh sach sinh vien trong lop " + studentClassroom + " la:");
        studentService.viewListStudent(lstStudents, studentClassroom);
        //Add new student
        System.out.println("-------------------------------------------");
        System.out.println("Them sinh vien moi!");
        studentService.addNewStudent(lstStudents);
        //Update point for student
        System.out.println("-------------------------------------------");
        System.out.println("Cap nhat diem cho sinh vien!");
        studentService.updateStudentPoint(lstStudents);
        //Delete student
        System.out.println("-------------------------------------------");
        System.out.println("Xoa sinh vien khoi danh sach!");
        studentService.deleteStudent(lstStudents);
        //Sort list student
        System.out.println("-------------------------------------------");
        System.out.println("Sap xep danh sach sinh vien!");
        studentService.sortListStudent(lstStudents);
    }
}
