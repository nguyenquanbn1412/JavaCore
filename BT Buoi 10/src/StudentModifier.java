import java.util.List;

public interface StudentModifier {
    void addNewStudent(List<Student> lstStudents);

    void updateStudentPoint(List<Student> lstStudents);

    void deleteStudent(List<Student> lstStudents);

}
