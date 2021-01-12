import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:testjava.db");) {
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Joe',23749, 'joe@gmail.com' )");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jane',2343243, 'Jane@gmail.com' )");
//            statement.execute("UPDATE contacts SET phone=534254 WHERE name = 'Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Joe'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " "
                + results.getInt("phone") + " " + results.getString("email"));
            }
            results.close();


            statement.close();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
