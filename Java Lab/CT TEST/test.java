interface Person {
    void printDetails();
    int getPersonalId();
    String getEmail();
    int getPhone();
}

class Employee implements Person {
    private int personalId;
    private String name;
    private String email;
    private int phoneNo;

    Employee(int personalId, String name, String email, int phoneNo) {
        this.personalId = personalId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Personal ID: " + getPersonalId());
        System.out.println("Name: " + name);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println();
    }

    public int getPersonalId() { return personalId; }
    public String getEmail() { return email; }
    public int getPhone() { return phoneNo; }
}

class Student implements Person {
    private int personalId;
    private String name;
    private String email;
    private int phoneNo;

    Student(int personalId, String name, String email, int phoneNo) {
        this.personalId = personalId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Personal ID: " + getPersonalId());
        System.out.println("Name: " + name);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println();
    }

    public int getPersonalId() { return personalId; }
    public String getEmail() { return email; }
    public int getPhone() { return phoneNo; }
}

public class test {
    public static void main(String[] args) {
        Person p1 = new Employee(1001, "Alice", "alice@company.com", 12345);
        Person p2 = new Student(2001, "Bob", "bob@student.com", 67890);

        p1.printDetails();
        p2.printDetails();
    }
}

