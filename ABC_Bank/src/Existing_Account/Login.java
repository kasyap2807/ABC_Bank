package Existing_Account;

import New_Account.Create_Account;
import New_Account.GetDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    public Boolean Logins(Connection con, Scanner sc,int id, String Password) throws SQLException {


        PreparedStatement ps = con.prepareStatement("Select * from user where id = ?;");
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            if(rs.getString(4).equals(Password)){
                return true;
            }
            else {
                System.out.println("Wrong Password!!!");
                return false;
            }
        }

        System.out.println("Check Account Id!!!!");

//        System.out.println("Press 1 to create Account or press others to try again....");
//        int ch = sc.nextInt();
//
//        if(ch==1){
//            Create_Account ca = Create_Account(con,sc);
//        }

        return false;

    }
}
