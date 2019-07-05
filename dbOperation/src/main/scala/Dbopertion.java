import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbopertion

{
    public static void main(String args[]) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "testuser", "test123");
            if (connection != null) {
                System.out.println("connection success");
            } else {
                System.out.println("connection failed");
            }
            connection.close();
        } catch (Exception c)
        {
            System.out.println(c);
        }
    }
}

       /* public void insert()
        {


            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","testuser","test123");
                Statement stmt = connection.createStatement();

                // Inserting data in database
                String q1 = "insert into user_info values('" +user_id+ "', '" +user_name+ "','"+user_name+ "')";
                int x = stmt.executeUpdate(q1);
                if (x > 0)
                    System.out.println("Successfully Inserted");
                else
                    System.out.println("Insert Failed");

                connection.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }

    public  void read()
    {



        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","testuser","test123");
            Statement stmt = connection.createStatement();
            // SELECT query
            String q1 = "select * from user_info WHERE id = '" + user_id + "'";
            ResultSet rs = stmt.executeQuery(q1);
            if (rs.next())
            {
                System.out.println("ID : " + rs.getString(1));
                System.out.println("Name :" + rs.getString(2));
                System.out.println("Age :" + rs.getString(3));
            }
            else
            {
                System.out.println("No such user id is already registered");
            }
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public  void update()
    {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","testuser","test123");
            Statement stmt = connection.createStatement();

            // Deleting from database
            System.out.println("Enter 1 to update Name and 2 to update Age");
            int choice = input.nextInt();
            if (choice==1) {
                System.out.println("Enter Name");
                String name = input.next();
                String q1 = "UPDATE user_info set Name ='" + name + "' WHERE ID = '" + user_id+ "'";

                int x = stmt.executeUpdate(q1);

                if (x > 0)
                    System.out.println("Your Name is successfully updated");
                else
                    System.out.println("ERROR OCCURED :(");
            }
            else if(choice==2) {
                System.out.println("Enter Age");
                int age = input.nextInt();
                String q1 = "UPDATE user_info set Age ='" + age + "' WHERE ID = '" + ID + "'";

                int x = stmt.executeUpdate(q1);

                if (x > 0)
                    System.out.println("Your Age is successfully updated");
                else
                    System.out.println("ERROR OCCURED :(");
            }
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void delete()
    {



        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","testuser","test123");
            Statement stmt = connection.createStatement();

            // Deleting from database
            String q1 = "DELETE from user_info WHERE ID = '" + user_id +"'";

            int x = stmt.executeUpdate(q1);

            if (x > 0)
                System.out.println("One User Successfully Deleted");
            else
                System.out.println("ERROR OCCURED :(");

            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    */
