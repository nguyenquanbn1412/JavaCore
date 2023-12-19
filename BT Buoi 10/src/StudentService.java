import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentService extends StudentViewList implements StudentModifier, StudentSorter {
    @Override
    void viewListStudent(List<Student> lstStudents, String studentClassroom) {
        if (studentClassroom == null || studentClassroom.isEmpty()) {
            for (Student student : lstStudents) {
                System.out.println(student.toString());
            }
        } else {
            for (Student student : lstStudents) {
                if (student.getStudentClassroom().equals(studentClassroom)) {
                    System.out.println(student.toString());
                }
            }
        }
    }

    @Override
    public void addNewStudent(List<Student> lstStudents) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten cua sinh vien:");
        String studentName = scanner.nextLine();
        System.out.println("Nhap vao dia chi cua sinh vien:");
        String studentAddress = scanner.nextLine();
        System.out.println("Nhap vao lop hoc cua sinh vien:");
        String studentClassroom = scanner.nextLine();
        System.out.println("Nhap vao ID cua sinh vien:");
        int studentId = checkIntNumber(scanner);
        System.out.println("Nhap vao tuoi cua sinh vien:");
        int studentAge = checkIntNumber(scanner);
        System.out.println("Nhap vao diem cua sinh vien:");
        double studentPoint = checkDoubleNumber(scanner);
        Student student = Student.newStudent().setStudentId(studentId).setStudentName(studentName).setStudentAge(studentAge)
                .setStudentAddress(studentAddress).setStudentPoint(studentPoint).setStudentClassroom(studentClassroom).createStudent();
        lstStudents.add(student);
        System.out.println("Them sinh vien thanh cong!");
        System.out.println("Danh sach sinh vien sau khi them:");
        viewListStudent(lstStudents, null);
    }

    @Override
    public void updateStudentPoint(List<Student> lstStudents) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ID cua sinh vien ban muon cap nhat diem:");
        int studentId = checkIntNumber(scanner);
        for (Student student : lstStudents) {
            if (student.getStudentId() == studentId) {
                System.out.println("Nhap vao so diem ban muon cap nhat:");
                double newPoint = checkDoubleNumber(scanner);
                student.setStudentPoint(newPoint);
                System.out.println("Cap nhat diem thanh cong!");
                System.out.println("Sinh vien " + student.getStudentName() + " sau khi cap nhat diem:");
                System.out.println(student.toString());
                return;
            }
        }
    }

    @Override
    public void deleteStudent(List<Student> lstStudents) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ID cua sinh vien ban muon xoa:");
        int studentId = checkIntNumber(scanner);
        for (Student student : lstStudents) {
            if (student.getStudentId() == studentId) {
                lstStudents.remove(student);
                System.out.println("Xoa thanh cong!");
                System.out.println("Danh sach sinh vien sau khi xoa:");
                viewListStudent(lstStudents, null);
                return;
            }
        }
    }

    @Override
    public void sortListStudent(List<Student> lstStudents) {
        Scanner scanner = new Scanner(System.in);
        int optionSort = 0;
        while (optionSort != 4) {
            System.out.println("Chon kieu sap xep ma ban muon:");
            System.out.println("1. Sap xep theo ten");
            System.out.println("2. Sap xep theo tuoi");
            System.out.println("3. Sap xep theo diem");
            System.out.println("4. Thoat");
            optionSort = checkIntNumber(scanner);
            System.out.println("Danh sach sinh vien sau khi sap xep:");
            switch (optionSort) {
                case 1:
                    lstStudents.sort(Comparator.comparing(Student::getStudentName));
                    viewListStudent(lstStudents, null);
                    break;
                case 2:
                    lstStudents.sort(Comparator.comparing(Student::getStudentAge));
                    viewListStudent(lstStudents, null);
                    break;
                case 3:
                    lstStudents.sort(Comparator.comparing(Student::getStudentPoint));
                    viewListStudent(lstStudents, null);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Khong co kieu sap xep khac!");
                    break;
            }
        }
        viewListStudent(lstStudents, null);
    }
}
