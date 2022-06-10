import java.io.FileReader;
import java.io.IOException;


public class FIleDemo {
    public static void main(String[] args) {

    }

    public void readFile() {
        FileReader fileReader;
        String filePath = System.getProperty("user.dir") + "/data/data.txt";
        try {
            fileReader = new FileReader(filePath);
            while (fileReader.read() !=-1) {
                fileReader.read();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

