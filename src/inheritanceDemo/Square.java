package inheritanceDemo;

public class Square extends Shape{

    String nickName;

    public Square(int l, int w, String n) {
        super(l, w);
        nickName=n;

    }

    @Override
    public void print() {
        System.out.println("Name is " + nickName);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    @Override
    public void area() {
        int area = length*width;
        if(length!=width) {
            System.out.println("Cannot be Square!!!");
        }
        else{
        System.out.println("Area is: " + area);
        }
    }

    public static void main(String[] args) {
        Square sq = new Square(10,10,"Blah");
        sq.print();
        sq.area();

    }
}
