package PracticeSession61022;

public class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    public Member(String name, int age, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void printSalary(int salary) {
        this.salary = salary;
        System.out.println("Salary is : "+ salary);
    }
}
