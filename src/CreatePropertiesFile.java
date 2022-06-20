import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.put("Year", "2016");
        prop.put("Make", "Honda");
        prop.put("Model", "Accord");
        prop.put("Trim", "Ex");
        String path = "E:\\myProperties.properties";
        FileOutputStream fip = new FileOutputStream(path);
        prop.store(fip, "this is a sample");
        System.out.println("File Created");

    }
}
