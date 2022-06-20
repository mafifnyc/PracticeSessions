package extraclasswork062022;

public class Car extends Vehicle{
    String brand, model;


    @Override
    public void numberOfWheels() {
        System.out.println("The Car has 4 Wheels");
    }

    @Override
    public void color() {
        System.out.println("It's blue");
    }

    public void myInfo() {
        System.out.println(brand = "Honda");
        System.out.println(model = "Accord");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.numberOfWheels();
        myCar.color();
        myCar.myInfo();
        myCar.info();
    }
}
