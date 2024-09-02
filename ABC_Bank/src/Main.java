import New_Account.Create_Account;
import Existing_Account.SubMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ABC_Bank","root","123456");
        if(con != null){
            System.out.println("Database Connected");
        }

        System.out.println("*************Welcome to ABC Bank*************");
        System.out.println("Press 1 -> Login \nPress 2-> Creating Account\nPress Other -> Exit");
        int select = sc.nextInt();

        while(select<3 && select>=1){
            if(select == 1){
                SubMain sm = new SubMain();
                sm.submains(con,sc);

                System.out.println("Press 1 -> Login \nPress 2-> Creating Account\nPress Other -> Exit");
                select = sc.nextInt();
            }
            else{
                Create_Account ca = new Create_Account();
                ca.CreateAccount(con,sc);

                System.out.println("Press 1 -> Login \nPress 2-> Creating Account\nPress Other -> Exit");
                select = sc.nextInt();
            }
        }




    }
}

//get the connection
//prepare or create the query
//execte the query
//get the result and iterate it