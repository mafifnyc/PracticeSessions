package ClassWork6622;

import java.util.Scanner;

public class Employee {
    String email;
    String password;
    public Employee(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public void watchClassVideo(int classNumber) {
        System.out.println(classNumber);

    }
    public void submitAssignment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Assignment Number: ");
        int assignmentNumber = sc.nextInt();
        System.out.println(assignmentNumber);
    }

}
