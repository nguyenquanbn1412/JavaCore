import java.util.*;

// Lớp Student đại diện cho một học sinh
class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classroom;

    public Student(int id, String name, int age, String address, double point, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        this.classroom = classroom;
    }

    // Getters và setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getPoint() {
        return point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    // Phương thức hiển thị thông tin học sinh
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Point: " + point);
        System.out.println("Classroom: " + classroom);
    }
}

// Lớp quản lý học sinh
public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    // Thêm học sinh mới
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Cập nhật điểm học sinh
    public void updatePoint(int id, double newPoint) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setPoint(newPoint);
                System.out.println("Điểm của học sinh " + student.getName() + " đã được cập nhật thành " + newPoint);
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID là " + id);
    }

    // Xóa học sinh
    public void removeStudent(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                System.out.println("Học sinh " + student.getName() + " đã được xóa khỏi danh sách");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID là " + id);
    }

    // Xem danh sách học sinh
    public void displayStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
            return;
        }
        for (Student student : studentList) {
            student.displayDetails();
            System.out.println();
        }
    }

    // Xem danh sách học sinh theo lớp
    public void displayStudentsByClassroom(String classroom) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getClassroom().equalsIgnoreCase(classroom)) {
                student.displayDetails();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh trong lớp " + classroom);
        }
    }

    // Sắp xếp danh sách học sinh theo tên
    public void sortByName() {
        Collections.sort(studentList, Comparator.comparing(Student::getName));
    }

    // Sắp xếp danh sách học sinh theo tuổi
    public void sortByAge() {
        Collections.sort(studentList, Comparator.comparingInt(Student::getAge));
    }

    // Sắp xếp danh sách học sinh theo điểm tu cao xuong thap
    public void sortByPoint() {
        Collections.sort(studentList, Comparator.comparingDouble(Student::getPoint).reversed());
    }

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        // Thêm một số học sinh vào danh sách
        management.addStudent(new Student(1, "John", 18, "123 Street, City", 8.5, "A1"));
        management.addStudent(new Student(2, "Alice", 17, "456 Avenue, Town", 7.8, "A1"));
        management.addStudent(new Student(3, "Bob", 18, "789 Road, Village", 9.2, "A2"));
        management.addStudent(new Student(4, "Emily", 17, "321 Lane, County", 8.9, "A2"));

        System.out.println("Danh sách học sinh ban đầu:");
        management.displayStudentList();
        System.out.println();

        // Cập nhật điểm của một học sinh
        management.updatePoint(2, 8.2);
        System.out.println();

        // Xóa một học sinh khỏi danh sách
        management.removeStudent(3);
        System.out.println();

        // Xem danh sách học sinh sau khi cập nhật và xóa
        System.out.println("Danh sách học sinh sau khi cập nhật và xóa:");
        management.displayStudentList();
        System.out.println();

        // Xem danh sách học sinh theo lớp
        System.out.println("Danh sách học sinh trong lớp A1:");
        management.displayStudentsByClassroom("A1");
        System.out.println();

        // Sắp xếp danh sách học sinh theo tên và hiển thị
        System.out.println("Danh sách học sinh sau khi sắp xếp theo tên:");
        management.sortByName();
        management.displayStudentList();
        System.out.println();

        // Sắp xếp danh sách học sinh theo tuổi và hiển thị
        System.out.println("Danh sách học sinh sau khi sắp xếp theo tuổi:");
        management.sortByAge();
        management.displayStudentList();
        System.out.println();

        // Sắp xếp danh sách học sinh theo điểm và hiển thị
        System.out.println("Danh sách học sinh sau khi sắp xếp theo điểm:");
        management.sortByPoint();
        management.displayStudentList();
    }
}
