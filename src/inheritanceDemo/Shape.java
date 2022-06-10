package inheritanceDemo;

public class Shape {
    int length;
    int width;
    public Shape(int l, int w) {
        length = l;
        width = w;
    }
    public void area() {
        System.out.println("Calculating Area");
    }
    public void print() {
        System.out.println("Length is " + length);
        System.out.println("Width is " + width);
    }
}
