package Existing_Account;

import New_Account.GetDetails;
import Trascations.BalanceEnquary;
import Trascations.WithDraw;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class SubMain {
    public void submains(Connection con, Scanner sc) throws SQLException {
        Boolean Login = false;
        int id = 0;
        String Password = "";

        while (!Login){
            System.out.println("*******************Welecome to Login Page*******************");
            System.out.println("Enter Your Account Number: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Your Password: ");
            Password = sc.nextLine();
            Login lo = new Login();
            Login = lo.Logins(con,sc,id,Password);
        }

        System.out.println("Login Succssful!!!!");

        GetDetails gd = new GetDetails();
        gd.getDataofUser(con,id);

        System.out.println("Enter 1-> Balance Enquery\nPress 2-> WithFraw Amount\nPress 3-> Deposite Amount\nPress Others-> Logout");
        int select = sc.nextInt();

        while(select<4 && select>0){
            switch (select){
                case 1:{
                    BalanceEnquary be = new BalanceEnquary();
                    be.balanceenq(con,sc,id);
                    System.out.println("Enter 1-> Balance Enquery\nPress 2-> WithFraw Amount\nPress 3-> Deposite Amount\nPress Others-> Logout");
                    select = sc.nextInt();
                    break;
                }
                case 2:{
                    WithDraw wd = new WithDraw();
                    wd.withDraw(con,sc,id);
                    System.out.println("Enter 1-> Balance Enquery\nPress 2-> WithFraw Amount\nPress 3-> Deposite Amount\nPress Others-> Logout");
                    select = sc.nextInt();
                    break;
                }
                case 3:{
                    System.out.println("Enter 1-> Balance Enquery\nPress 2-> WithFraw Amount\nPress 3-> Deposite Amount\nPress Others-> Logout");
                    select = sc.nextInt();
                    break;
                }
            }
        }


    }
}
