package Trascations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class WithDraw {
    public void withDraw(Connection con, Scanner sc, int id) throws SQLException {
        System.out.println("Enter Withdrawal Amount");
        int reqamounnt = sc.nextInt();
        int curbalance = curbal(id,con);

        if(curbalance>=reqamounnt+500){
            PreparedStatement ps = con.prepareStatement("update user set CurrentBalance = ? where id = ?;");
            ps.setInt(1,curbalance-reqamounnt);
            ps.setInt(2,id);

            int op = ps.executeUpdate();

            if(op==1){
                System.out.println("Take Your Amount");
            }
            else {
                System.out.println("Something Went Wrong");
            }
        }
        else{
            System.out.println("Not Enough Money in Your Account \nYour Current Balance is :"+curbalance+"\nYou must maintain 500 min balance");
        }

    }

    public int curbal(int id, Connection con) throws SQLException {
        PreparedStatement ps = con.prepareStatement("select * from user where id = ?;");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        int curbalance = 0;
        while (rs.next()) {
            curbalance = rs.getInt(5);
        }

        return curbalance;
    }
}
