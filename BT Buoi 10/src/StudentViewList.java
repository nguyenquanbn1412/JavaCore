import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class StudentViewList {


    int checkIntNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    double checkDoubleNumber(Scanner scn) {
        while (!scn.hasNextDouble()) {
            System.out.println("Ban can nhap vao 1 so thuc!");
            scn.next();
        }
        return scn.nextDouble();
    }

    List<Student> createListStudent() {
        List<Student> lstStudents = new ArrayList<>();
        Student student1 = Student.newStudent().setStudentId(1).setStudentName("Dirak").setStudentAge(35).setStudentAddress("Hoc vien phap thuat")
                .setStudentPoint(10.0).setStudentClassroom("Mid").createStudent();
        Student student2 = Student.newStudent().setStudentId(2).setStudentName("Zuka").setStudentAge(27).setStudentAddress("Rung nguyen sinh")
                .setStudentPoint(9.5).setStudentClassroom("Jungle").createStudent();
        Student student3 = Student.newStudent().setStudentId(3).setStudentName("Violet").setStudentAge(20).setStudentAddress("Rung nguyen sinh")
                .setStudentPoint(8.0).setStudentClassroom("AD").createStudent();
        Student student4 = Student.newStudent().setStudentId(4).setStudentName("Kahlii").setStudentAge(22).setStudentAddress("Vuc hon mang")
                .setStudentPoint(8.5).setStudentClassroom("Mid").createStudent();
        Student student5 = Student.newStudent().setStudentId(5).setStudentName("Zata").setStudentAge(24).setStudentAddress("Cung dien anh sang")
                .setStudentPoint(9.5).setStudentClassroom("Mid").createStudent();
        Student student6 = Student.newStudent().setStudentId(6).setStudentName("Richter").setStudentAge(37).setStudentAddress("Thap quang minh")
                .setStudentPoint(9.0).setStudentClassroom("Top").createStudent();
        Student student7 = Student.newStudent().setStudentId(7).setStudentName("Thane").setStudentAge(40).setStudentAddress("Thap quang minh")
                .setStudentPoint(9.0).setStudentClassroom("Support").createStudent();
        lstStudents.add(student1);
        lstStudents.add(student2);
        lstStudents.add(student3);
        lstStudents.add(student4);
        lstStudents.add(student5);
        lstStudents.add(student6);
        lstStudents.add(student7);
        return lstStudents;
    }

    abstract void viewListStudent(List<Student> lstStudents, String studentClassroom);

}
