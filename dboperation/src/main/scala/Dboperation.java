import java.sql.*;
import java.util.Scanner;
public class Dboperation {

    public void insert() {
        Scanner input = new Scanner(System.in);
        Entity entity = new Entity();

        System.out.print("Enter an your id: ");
        int user_id = input.nextInt();
        entity.setId(user_id);
        System.out.print("Enter an your name: ");
        String user_name = input.next();
        entity.setName(user_name);
        System.out.print("Enter an your age: ");
        int user_age = input.nextInt();
        entity.setAge(user_age);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "testuser", "test123");
            Statement stmt = connection.createStatement();

            // Inserting data in database
            String q1 = "insert into user_info values('" + entity.getId() + "', '" + entity.getName() + "','" + entity.getAge() + "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0)
                System.out.println("Successfully Inserted");
            else
                System.out.println("Insert Failed");

            connection.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void read()
    {

        Scanner input = new Scanner(System.in);
        Entity entity = new Entity();


        System.out.print("Enter an your id: ");
        int user_id = input.nextInt();
        entity.setId(user_id);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","testuser","test123");
            Statement stmt = connection.createStatement();
            // SELECT query
            String q1 = "select * from user_info WHERE user_id = '" + entity.getId() + "'";
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
        Scanner input = new Scanner(System.in);
        Entity entity= new Entity();

        System.out.print("Enter an your id: ");
        int user_id = input.nextInt();
        entity.setId(user_id);
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
                String user_name = input.next();
                entity.setName(user_name);
                String q1 = "UPDATE user_info set user_name ='" + entity.getName() + "' WHERE user_id = '" + entity.getId() + "'";

                int x = stmt.executeUpdate(q1);

                if (x > 0)
                    System.out.println("Your Name is successfully updated");
                else
                    System.out.println("ERROR OCCURED :(");
            }
            else if(choice==2) {
                System.out.println("Enter Age");
                int user_age = input.nextInt();
                String q1 = "UPDATE user_info set user_age ='" + entity.getAge()+ "' WHERE user_id = '" + entity.getId() + "'";

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
        Scanner input = new Scanner(System.in);
        Entity entity= new Entity();
        System.out.print("Enter an your id: ");
        int user_id = input.nextInt();
        entity.setId(user_id);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","testuser","test123");
            Statement stmt = connection.createStatement();

            // Deleting from database
            String q1 = "DELETE from user_info WHERE user_id = '" + entity.getId() +"'";

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
}







