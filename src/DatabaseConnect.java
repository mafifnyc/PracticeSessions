import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class DatabaseConnect {

    String username = "postgres";
    String password = "postgres";


    public String getUrl1() {
       String url;
       Scanner sc = new Scanner(System.in);
       url = "jdbc:postgresql://localhost:5432/dvdrental";
       return url;
    }

    public String getUrl2() {
        String url;
        Scanner sc = new Scanner(System.in);
        url = "jdbc:postgresql://localhost:5432/practice";
        return url;
    }

    public Connection connectDB() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url1 = getUrl1();
        String url2 = getUrl2();


//        Connection connection = DriverManager.getConnection(url1,username,password);
        Connection connection2 = DriverManager.getConnection(url2,username,password);
        System.out.println("Connection Successful");
        return connection2;
    }

    public static Properties readProperties() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("/users/QAAEB2201/IdeaProjects/PracticeWeek1/src/main/resources/app.properties");
        properties.load(inputStream);
        return properties;
    }
    // From File
//    public static Connection connectDB() throws ClassNotFoundException, SQLException, IOException {
//        Properties properties = readProperties();
//        String userName = properties.getProperty("userName");
//        String password = properties.getProperty("password");
//        String url = properties.getProperty("url");
//        Connection connection = DriverManager.getConnection(url, userName, password);
//        System.out.println("Connected");
//        return connection;
//    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseConnect db = new DatabaseConnect();
        db.getUrl1();
        db.getUrl2();
        db.connectDB();
    }


    }


