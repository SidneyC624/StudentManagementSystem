package student;

import db.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
	
	//checks if student email already exists
	public boolean isEmailExist(String email) {
		try {
			ps = con.prepareStatement("select * from student where email = ?");
			ps.setString(1, email);
			ResultSet result = ps.executeQuery();
			if(result.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isPhoneExist(String phone) {
		try {
			ps = con.prepareStatement("select * from student where phone = ?");
			ps.setString(1, phone);
			ResultSet result = ps.executeQuery();
			if(result.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//get all the student values from database student table
	public void getStudentValue(JTable table, String searchValue) {
		String sql = "select * from student where concat(id,name,email,phone) like ? order by id desc";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, "%"+searchValue+"%");
			ResultSet result = ps.executeQuery();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			Object[] row;
			while(result.next()) {
				row = new Object[11];
				row[0] = result.getInt(1);
				row[1] = result.getString(2);
				row[2] = result.getString(3);
				row[3] = result.getString(4);
				row[4] = result.getString(5);
				row[5] = result.getString(6);
				row[6] = result.getString(7);
				row[7] = result.getString(8);
				row[8] = result.getString(9);
				row[9] = result.getString(10);
				row[10] = result.getString(11);
				model.addRow(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
