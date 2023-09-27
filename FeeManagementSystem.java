
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Welcome!! to the Deen Dayal Upadhyaya Gorakhpur University Fee Management System...");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display student fee report");
            System.out.println("3 - Pay fees");
            System.out.println("0 - Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    displayStudentReport(students);
                    break;
                case 3:
                    payFees(scanner, students);
                    break;
                case 0:
                    System.out.println("Thank You! for being a valued user of the management system. ");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice X.......  Please choose a valid option.");
            }
        }
    }

    private static void addStudent(Scanner scanner, List<Student> students) {
        System.out.println("Enter student's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter student's last name:");
        String lastName = scanner.nextLine();
        students.add(new Student(firstName, lastName));
        System.out.println("Student added successfully!");
    }

    private static void displayStudentReport(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
        } else {
            System.out.println("\nStudent Fee Report:");
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                System.out.println("Student Roll no. : " + (i + 1));
                System.out.println("Student Name : " + student.getFullName());
                System.out.println("Total Fee : " + Student.getTotalFees());
                System.out.println("Paid Fee : " + student.getPaidFees());
                System.out.println("Fee Balance : " + student.getRemainingFees());
                System.out.println();
            }
        }
    }

    private static void payFees(Scanner scanner, List<Student> students) {
        System.out.println("Enter the student's first name whose fee is to be paid:");
        String firstName = scanner.nextLine();
        boolean found = false;

        for (Student student : students) {
            if (firstName.equalsIgnoreCase(student.getFirstName())) {
                System.out.println("Enter the amount of fees paid:");
                int fee = scanner.nextInt();
                student.payFees(fee);
                System.out.println("Fees paid successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry!! student name not found in the records.");
        }
    }
}

class Student {
    private static final int TOTAL_FEES = 50000;

    private String firstName;
    private String lastName;
    private int paidFees;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getPaidFees() {
        return paidFees;
    }

    public int getRemainingFees() {
        return TOTAL_FEES - paidFees;
    }

    public static int getTotalFees() {
        return TOTAL_FEES;
    }

    public void payFees(int amount) {
        if (amount > 0) {
            paidFees += amount;
        }
    }
}
