//public class Test {
//    public static void main(String[] args) {
//        Circle myCircle = new Circle("Red", 5.0);
//        System.out.println("Color: " + myCircle.getColor());
//        System.out.println("Area: " + myCircle.calculateArea());
//    }
//}
//
//abstract class Shape {
//    private String color;
//
//    public Shape() {
//
//    }
//
//    // Constructor của abstract class
//    public Shape(String color) {
//        this.color = color;
//    }
//
//    // Phương thức abstract (cần được cài đặt bởi các subclass)
//    public abstract double calculateArea();
//
//    // Getter method
//    public String getColor() {
//        return color;
//    }
//}
//
//class Circle extends Shape {
//    private double radius;
//
//    public Circle() {
//
//    }
//
//    Shape shape = new Circle();
//
//    // Constructor của subclass Circle
//    public Circle(String color, double radius) {
//        super(color); // Gọi constructor của abstract class bằng super()
//        this.radius = radius;
//    }
//
//    // Implement abstract method
//    public double calculateArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
public class Student {
    private int id;
    private String name;
    private int age;
    private String email;

    public Student() {
    }

    public Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
