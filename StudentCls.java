public class Student {
//    Viết chương trình quản lý học sinh gồm các thông tin sau: id, name, age, address, point, classroom
//    Xem danh sách học sinh
//    Thêm học sinh mới
//    Cập nhập điểm học sinh
//    Xóa học sinh
//    Xem danh sách học sinh theo lớp
//    Sắp xếp theo tên
//    Sắp xếp theo tuổi
//    Sắp xếp theo điểm

    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentAddress;
    private double studentPoint;
    private String studentClassroom;

    private Student() {
    }

    public Student(int studentId, String studentName, int studentAge,
                   String studentAddress, double studentPoint, String studentClassroom) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
        this.studentPoint = studentPoint;
        this.studentClassroom = studentClassroom;
    }

    public static Student newStudent() {
        return new Student();
    }

    public int getStudentId() {
        return studentId;
    }

    public Student setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public Student setStudentAge(int studentAge) {
        this.studentAge = studentAge;
        return this;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public Student setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
        return this;
    }

    public double getStudentPoint() {
        return studentPoint;
    }

    public Student setStudentPoint(double studentPoint) {
        this.studentPoint = studentPoint;
        return this;
    }

    public String getStudentClassroom() {
        return studentClassroom;
    }

    public Student setStudentClassroom(String studentClassroom) {
        this.studentClassroom = studentClassroom;
        return this;
    }

    public Student createStudent() {
        return new Student(studentId, studentName, studentAge,
                studentAddress, studentPoint, studentClassroom);
    }

    @Override
    public String toString() {
        return "Student {" +
                "studentId = " + studentId +
                ", studentName = '" + studentName + '\'' +
                ", studentAge = " + studentAge +
                ", studentAddress = '" + studentAddress + '\'' +
                ", studentPoint = " + studentPoint +
                ", studentClassroom = '" + studentClassroom + '\'' +
                '}';
    }
}
///////////////////////////////////


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    List<Student> createLstStudent() {
        List<Student> lstStudents = new ArrayList<>();
        Student student1 = Student.newStudent().setStudentId(1).setStudentName("Zata").setStudentAge(21)
                .setStudentAddress("Thap quang minh").setStudentPoint(9.0).setStudentClassroom("MidLane").createStudent();
        Student student2 = Student.newStudent().setStudentId(2).setStudentName("Volkath").setStudentAge(22)
                .setStudentAddress("Vuc hon mang").setStudentPoint(10).setStudentClassroom("Jungle").createStudent();
        Student student3 = Student.newStudent().setStudentId(3).setStudentName("Lauriel").setStudentAge(19)
                .setStudentAddress("Cung dien anh sang").setStudentPoint(9.0).setStudentClassroom("MidLane").createStudent();
        Student student4 = Student.newStudent().setStudentId(4).setStudentName("Helen").setStudentAge(18)
                .setStudentAddress("Rung nguyen sinh").setStudentPoint(10).setStudentClassroom("Support").createStudent();
        Student student5 = Student.newStudent().setStudentId(5).setStudentName("Dirak").setStudentAge(21)
                .setStudentAddress("Hoc vien phap thuat").setStudentPoint(8.5).setStudentClassroom("MidLane").createStudent();
        lstStudents.add(student1);
        lstStudents.add(student2);
        lstStudents.add(student3);
        lstStudents.add(student4);
        lstStudents.add(student5);
        return lstStudents;
    }

    int checkNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so!");
            scn.next();
        }
        return scn.nextInt();
    }

    void printStudentArr(List<Student> lstStudents) {
        for (Student student :
                lstStudents) {
            System.out.println(student.toString());
        }
    }

    void addNewStudent(List<Student> lstStudents, Scanner scanner) {
        System.out.println("Nhap cac thong tin de them sinh vien moi:");
        //id, name, age, address, point, classroom
        System.out.println("ID:");
        int studentId = checkNumber(scanner);
        scanner.nextLine();
        System.out.println("Ten:");
        String studentName = scanner.nextLine();
        System.out.println("Tuoi:");
        int studentAge = checkNumber(scanner);
        scanner.nextLine();
        System.out.println("Dia chi:");
        String studentAddress = scanner.nextLine();
        System.out.println("Diem thi:");
        double studentPoint = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Lop hoc:");
        String studentClassroom = scanner.nextLine();
        Student student = Student.newStudent().setStudentId(studentId).setStudentName(studentName)
                .setStudentAge(studentAge).setStudentAddress(studentAddress).setStudentPoint(studentPoint)
                .setStudentClassroom(studentClassroom).createStudent();
        lstStudents.add(student);
    }

    void updateStudentPoint(List<Student> lstStudents, Scanner scn) {
        System.out.println("Nhap ID sinh vien can cap nhat diem:");
        int studentId = checkNumber(scn);

    }
}
