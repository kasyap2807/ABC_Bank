package Trascations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BalanceEnquary {
    public void balanceenq(Connection con, Scanner sc,int id) throws SQLException {
        PreparedStatement ps = con.prepareStatement("select * from user where id = ?;");
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        System.out.println("***********************************");
        while(rs.next()){
            System.out.println("Current Balance :"+rs.getInt(5));
        }
        System.out.println("***********************************");
    }
}
