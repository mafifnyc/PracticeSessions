import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class TimeConversion {
    public void twelveTo24(String time) {
        int h2 = (int)time.charAt(0) - '0';
        int h1 = (int)time.charAt(1) - '0';
        int hh = ((h2*10) + (h1%10));

        if(time.charAt(8) == 'A') {
            if(hh==12) {
                System.out.print("00");
                for(int i=2; i<=7; i++) {
                    System.out.print(time.charAt(i));
                }
                }
            else {
                for(int i=0; i<=7; i++) {
                    System.out.print(time.charAt(i));
                }
            }
        }
        else {
            if(hh==12) {
                System.out.print("12");
                for(int i=2; i<=7; i++) {
                    System.out.print(time.charAt(i));
                }
            }
            else{
                hh = hh + 12;
                System.out.print(hh);
                for (int i=2; i<=7; i++) {
                    System.out.print(time.charAt(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        TimeConversion timeConv = new TimeConversion();
       String time = "02:00:15PM";
       timeConv.twelveTo24(time);
    }
}
