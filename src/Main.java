import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:testjava.db");) {
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");
            statement.execute("INSERT INTO contacts (name, phone, email)" +
                    "VALUES('Tim',734897, 'tim@gmail.com' )");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
