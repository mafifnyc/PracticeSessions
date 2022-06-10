import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {

            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            System.out.println("Enter Name: ");

            String name = br.readLine();
            System.out.println(name);
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }
}
