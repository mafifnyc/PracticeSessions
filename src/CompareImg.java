import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;

/**********************************************
******************Doesn't Work*****************
***********************************************/

public class CompareImg {
    public static void main(String aa[]) throws IOException {
        try{
    File file1 = new File("E://881373.jpg");
    File file2 = new File("E://881374.jpg");

    BufferedImage b1 = ImageIO.read(file1);
    BufferedImage b2 = ImageIO.read(file2);
        int file1_height = b1.getHeight();
        int file2_height = b2.getHeight();
        int file1_width = b1.getWidth();
        int file2_width = b2.getWidth();

    if(file1_height==file2_height && file1_width==file2_width) {
        int i, j;
        for(i=1; i<=file1_height; i++) {
            for(j=1; j<=file1_width; i++) {
                if(b1.getRGB(i,j)!= b2.getRGB(i,j)){
                    System.out.println("images are not same");
                    break;
                }
            }
        }
        System.out.println("Image dimensions are the same");
    }

    }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        }


}
