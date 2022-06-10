package PracticeSession61022;

public class Employee extends Member{

    String specialization;

    public Employee(String name, int age, String phoneNumber, String address, String specialization) {
        super(name, age, phoneNumber, address);
        this.specialization = specialization;
    }

//    public void Employee(String name, int age, String phoneNumber, String address) {
//        System.out.println(address);
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(phoneNumber);
//    }


    @Override
    public void printSalary(int salary) {
        super.printSalary(salary);
    }

    public void printInfo() {
        System.out.println(address);
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
    }



    public static void main(String[] args) {
        Employee empInfo = new Employee("John", 28, "+1347893344", "123, Alphabet St, NY, USA", "Laziness");
        empInfo.printSalary(10000);
        empInfo.printInfo();

    }
}
