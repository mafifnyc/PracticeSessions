import java.sql.*;
import static java.lang.Class.forName;

public class ConnectDB {
    public static void main (String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        String url = "jdbc:mysql://localhost5432/dvdrental";
        String userName = "postgres";
        String password = "postgres";
        String query = "";
        //Load and register driver
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        //Establish Connection
        Connection connection = DriverManager.getConnection(url, userName, password);
        //Create Statement
        Statement statement = connection.createStatement();
        //Execute query
        ResultSet resultSet = statement.executeQuery(query);
        //Process Results
        resultSet.next();
        String name = resultSet.getString("username");
        System.out.println(name);
        //CLose
        statement.close();
        connection.close();
    }
}
