package sapp;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class student {
	public void insertupdate(char operation,Integer id,String fname,String Lname,
			                 String sex,String bdate,String phone,String address)
	{
		Connection con=MyConnection.getConnection();
		PreparedStatement ps;
		if(operation=='i')
		{
			try {
				ps=(PreparedStatement) con.prepareStatement("INSERT INTO student(first_name, last_name, sex, bithdate, phone, address) VALUES (?,?,?,?,?,?)");
				ps.setString(1,fname);
				ps.setString(2,Lname);
				ps.setString(3,sex);
				ps.setString(4,bdate);
				ps.setString(5,phone);
				ps.setString(6,address);
				if(ps.executeUpdate()>0)
				{
					JOptionPane.showMessageDialog(null,"new student add");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
