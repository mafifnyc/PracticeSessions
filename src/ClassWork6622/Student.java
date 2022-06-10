package ClassWork6622;

public class Student {
    String email;
    String password;
    public Student(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public static void viewGrade(int mark) {
        if((mark>=91) && (mark<=100)) {
            char grade = 'A';
            System.out.println(grade);
        }
        else if((mark>=81) && (mark<=90)) {
            char grade = 'B';
            System.out.println(grade);
        }
        else if((mark>=71) && (mark<=80)) {
            char grade = 'C';
            System.out.println(grade);

        }
        else if((mark>=61) && (mark<=70)) {
            char grade = 'D';
            System.out.println(grade);

        }
        else {
            char grade = 'F';
            System.out.println(grade);
        }

    }
}
