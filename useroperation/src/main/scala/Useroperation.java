
import java.sql.SQLException;
import java.util.Scanner;

public class Useroperation

{

    public void userOperation()
    {
        Scanner input = new Scanner(System.in);
        Dboperation dboperationobj = new Dboperation();

        while(true)
        {
            System.out.println("User management operation");
            System.out.println("1. For Insert");
            System.out.println("2. For Read");
            System.out.println("3. For Update");
            System.out.println("4. For Delete");
            System.out.println("5. For Exit");
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    dboperationobj.insert();
                    break;
                case 2:
                    dboperationobj.read();
                    break;
                case 3:
                    dboperationobj.update();
                    break;
                case 4:
                    dboperationobj.delete();
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("your choice is invalid");
                    break;
            }


        }
    }
}





//This is the final project
