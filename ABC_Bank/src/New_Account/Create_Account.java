package New_Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Create_Account {
    public void CreateAccount(Connection con, Scanner sc) throws SQLException {
        System.out.println("*********Create Account********");
        System.out.println("Enter Account Number: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Account Holder Email Id: ");
        String Email = sc.nextLine();
        System.out.println("Enter Account Password: ");
        String Password = sc.nextLine();
        System.out.println("Enter Inintial Ammount to Deposite: ");
        int Amount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Phone Number: ");
        String Phone_Number = sc.nextLine();


        while(Password.length()>6){
            System.out.println("Password Must Be 6 Charecter");
            System.out.println("re-Enter Account Password: ");
            Password = sc.nextLine();
        }

        while(Phone_Number.length()>10){
            System.out.println("Phone Number Must Be 10 Charecter");
            System.out.println("re-Enter Your Phone Number: ");
            Phone_Number = sc.nextLine();
        }

        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?);");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,Email);
        ps.setString(4,Password);
        ps.setInt(5,Amount);
        ps.setString(6,Phone_Number);

        try{
            int i = ps.executeUpdate();

            if(i == 1){
                GetDetails gd = new GetDetails();
                System.out.println("Thank You For Creating Account...\nYour Detailse Are");
                gd.getDataofUser(con,id);
                System.out.println("Account Created Sccessfully!!!!!!");
            }
            else {
                System.out.println("Something Went Wrong.....");
            }
        }catch (Exception e){
            System.out.println("Error in DB");
        }

    }
}

//-- id, name, email, password, current balance, Phone Number

