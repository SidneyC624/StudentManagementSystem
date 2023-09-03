package student;

import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.ResultSet;

public class Student {
	Connection con = MyConnection.getConnection();
	PreparedStatement ps;
	
	//get table max row
	public int getMax() {
		int id = 0;
		Statement statement;
		try {
			statement = con.createStatement();
			ResultSet result = statement.executeQuery("Select max(id) from student");
			while(result.next()) {
				id = result.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id + 1;
	}
	
	//insert data into student table
	public void insert(int id, String sname, String date, String gender, String email,
			String phone, String father, String mother, String address1, String address2, String imagePath) {
		String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, sname);
			ps.setString(3, date);
			ps.setString(4, gender);
			ps.setString(5, email);
			ps.setString(6, phone);
			ps.setString(7, father);
			ps.setString(8, mother);
			ps.setString(9, address1);
			ps.setString(10, address2);
			ps.setString(11, imagePath);
			
			if(ps.executeUpdate() > 0) {
				JOptionPane.showMessageDialog(null, "New Student added successfully");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
