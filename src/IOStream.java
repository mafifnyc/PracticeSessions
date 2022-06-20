import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IOStream {
    public static void main(String[] args) throws IOException {
    InputStream input = new FileInputStream("E:/input.txt");
    int data = input.read();
        while(data != -1){
            data = input.read();
        }
        Reader inputStreamReader = new InputStreamReader(input);
        ArrayList<List> listArray = new ArrayList<List>((Collection<? extends List>) inputStreamReader);
    }
}
