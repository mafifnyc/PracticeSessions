public class Car {
    private String name;
    private int number;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setNumber(int number) {
        this.number = number;
        if(number <5) {
            this.number = 6;
        }
    }
    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Mazda");
        car.setNumber(1);

        System.out.println(car.getName());
        System.out.println(car.getNumber());
    }
}
