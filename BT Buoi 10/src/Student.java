public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentAddress;
    private double studentPoint;
    private String studentClassroom;

    private Student() {
    }
    public Student(int studentId, String studentName, int studentAge, String studentAddress, double studentPoint, String studentClassroom) {
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
        return new Student(studentId, studentName, studentAge, studentAddress, studentPoint, studentClassroom);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentPoint=" + studentPoint +
                ", studentClassroom='" + studentClassroom + '\'' +
                '}';
    }
}
