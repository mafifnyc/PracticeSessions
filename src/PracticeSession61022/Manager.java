package PracticeSession61022;

public class Manager extends Member {

    String department;

    public Manager(String name, int age, String phoneNumber, String address, String department) {
        super(name, age, phoneNumber, address);
        this.department = department;
    }

    @Override
    public void printSalary(int salary) {
        super.printSalary(salary);
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(address);
        System.out.println(department);
    }

    public static void main(String[] args) {
        Manager man1 = new Manager("Steve", 42, "+13472233456", "321 bca St, New York, NY-10001", "Sales");
        man1.printInfo();
        man1.printSalary(25000);
    }
}
