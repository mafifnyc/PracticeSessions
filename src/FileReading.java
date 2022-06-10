import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
        public static void main(String[] args) {
            try {
                File myObj = new File("src/data/testout.txt");
                Scanner scan = new Scanner(myObj);
                while(scan.hasNext()) {
                    System.out.print(scan.nextLine());
                }

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (Exception error) {
                System.out.println("Exception!!!!");
                System.out.println(error);
            }
            finally {
                System.out.println("end");
            }
        }

}
