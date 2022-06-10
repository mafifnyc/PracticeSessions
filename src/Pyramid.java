import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {

        for(int i=1; i<=4; ++i) {
        for (int j = 1; j<=i; ++j) {
            System.out.print("*");
        }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println("blah!");
    }
}
