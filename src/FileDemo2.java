import java.io.FileReader;

public class FileDemo2 {

        public static void main(String args[])throws Exception{
            FileReader fr=new FileReader("/data/data.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
//            System.out.println(fr);
        }
    }

