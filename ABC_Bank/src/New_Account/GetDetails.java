package New_Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetDetails {
    public void getDataofUser(Connection con,int id) throws SQLException {
        PreparedStatement ps = con.prepareStatement("select * from user where id = ? ;");
        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();


        while (rs.next()){
            System.out.println("Account Number: "+rs.getInt(1)+"\nAccount Holder Name :"+rs.getString(2)+"\nEmail Address: "+rs.getString(3)+"\nBalance: "+rs.getInt(5)+"\nPhone Number :"+rs.getString(6));
        }
    }
}
