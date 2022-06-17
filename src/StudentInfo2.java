import java.util.ArrayList;

public class StudentInfo2 {
    String[] students = new String[5];

    public static void main(String[] args) {
        StudentInfo2 studenInfo = new StudentInfo2();
        studenInfo.copyArrayToArrayList();
    }

    public String[] getStudents() {
        students[0] = "John";
        students[1] = "Steve";
        students[2] = "Mark";
        students[3] = "Ricky";
        students[4] = "Frank";
        return students;
    }

    public ArrayList<String> createDynamicArray() {
        int a =4;

        ArrayList<String> studentList = new ArrayList<>();

        for(int i=0; i<studentList.size(); i++) {
//            System.out.println(studentList.get(i));
        }
        return studentList;
    }

    public void copyArrayToArrayList() {
        System.out.println(students.length);
        getStudents();
        ArrayList<String> newStudentList = new ArrayList<>();

        for(int i=0; i<students.length; i++) {
            String student = students[i];
            newStudentList.add(student);
        }

//        for (String s: newStudentList) {
//            System.out.println(s);
//        }

        newStudentList.forEach(str -> System.out.println(str));
    }
}
