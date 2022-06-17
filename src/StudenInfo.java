import java.util.ArrayList;

public class StudenInfo {
    // Declare an empty array with length 5
    // Length is Static - Fixed
    String[] students = new String[5];

    public static void main(String[] args) {
        StudenInfo studentsInfo = new StudenInfo();
        //studentsInfo.getStudentsInfo();
        // studentsInfo.createDynamicArray();
        studentsInfo.copyArrayToArrayList();
    }

    public String[] getStudentsInfo(){
        students[0] = "John";
        students[1] = "Don";
        students[2] = "Mon";
        students[3] = "Kon";
        students[4] = "KiKi";

//        for (int i = 0; i < students.length; i++){
//            System.out.println(students[i]);
//        }

        return students;

    }
    public ArrayList<String> createDynamicArray(){

        int a  = 4; // What is a here?  Isn't it an object?

        // We created a dynamic array container, which can hold
        // String type of Object
        ArrayList< String > studentList = new ArrayList<>();

        studentList.add("John");
        studentList.add("Don");
        studentList.add("Mon");


        for (int i = 0; i< studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        return studentList;

    }

    public void copyArrayToArrayList(){
        System.out.println(students.length);
        getStudentsInfo();
        ArrayList<String>  newStudentList = new ArrayList<>();

//        for (int i = 0; i < students.length; i++){
//            String student = students[i]; //
//            newStudentList.add(student);
//        }


//        for( String s  : newStudentList ){    // s = John, Don, Mon, Kon, Kiki
//            // Iterating using foreach loop
//            System.out.println(s);
//        }

        newStudentList.forEach( str  -> System.out.println(" Iterating using foreach() method " + str));

    }

}
