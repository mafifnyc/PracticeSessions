package inheritanceDemo;

public class Rectangle extends Shape{

    String color;
    public Rectangle(int l, int w, String c) {
        super(l,w);
        color = c;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Color is " + color);
    }

    @Override
    public void area() {
        super.area();
        int answer = length*width;
        System.out.println("Area is " + answer);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,15, "Black");
        rec.print();
        rec.area();
    }
}
