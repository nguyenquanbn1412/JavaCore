// Lớp cha
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Lớp bệnh nhân kế thừa từ lớp Person
class Patient extends Person {
    int patientId;
    String admissionDate;

    public Patient(String name, int age, int patientId, String admissionDate) {
        super(name, age);
        this.patientId = patientId;
        this.admissionDate = admissionDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Patient ID: " + patientId);
        System.out.println("Admission Date: " + admissionDate);
    }
}

// Lớp bác sĩ kế thừa từ lớp Person
class Doctor extends Person {
    String specialization;
    int workingHours;

    public Doctor(String name, int age, String specialization, int workingHours) {
        super(name, age);
        this.specialization = specialization;
        this.workingHours = workingHours;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Working Hours: " + workingHours);
    }
}

// Lớp quản lý bệnh viện
class ManageHospital {
    public static void main(String[] args) {
        // Tạo một bệnh nhân và hiển thị thông tin
        Patient patient1 = new Patient("John Doe", 35, 1001, "2024-02-06");
        System.out.println("Patient Details:");
        patient1.displayDetails();
        System.out.println();

        // Tạo một bác sĩ và hiển thị thông tin
        Doctor doctor1 = new Doctor("Dr. Smith", 45, "Cardiologist", 40);
        System.out.println("Doctor Details:");
        doctor1.displayDetails();
    }
}
