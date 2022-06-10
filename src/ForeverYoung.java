public class ForeverYoung {
    private String name;
    private int age;
    private String message;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getName() {
        return name;
    }

    public void getAge() {
        if(age>18) {
            System.out.println("Age is Just a Number");
        }
        else {
            System.out.println(age);
        }
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        ForeverYoung young = new ForeverYoung();
        young.setName("John");
        young.setAge(15);
        young.setMessage("I honestly don't know");

        System.out.println(young.getName());
        young.getAge();
        System.out.println(young.getMessage());

    }
}
