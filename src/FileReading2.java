import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/data/testout.txt");
            BufferedReader bfr = new BufferedReader(fr);
            int i;
            while ((i = bfr.read()) != (-1)) {
                System.out.print((char) i);
//                bfr.close();
//                fr.close();
            }
//            bfr.close();
//            fr.close();
        }
        catch (FileNotFoundException f) {
            System.out.println("File not found " + f);
        }
        catch (IOException i) {
            System.out.println("IO exception " + i);
        }
    }
}
