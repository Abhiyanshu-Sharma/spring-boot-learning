package com.isrdc.repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.isrdc.bos.UserBO;

@Repository
public class UserDAO {
	
	public ArrayList<UserBO> fetchAllUsers() {
		ArrayList<UserBO> users = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdj1db?user=root&password=1234");
			
			String query = "select * from users";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				users.add(new UserBO(rs.getString("name"), rs.getInt("age")));
			}
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	
	public void saveUser(UserBO userBo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdj1db?user=root&password=1234");
			
			String query = "insert into users (name,age) values (?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, userBo.getName());
			ps.setInt(2, userBo.getAge());
			
			int rows = ps.executeUpdate();
			
			System.out.println("Query ran successfully\n" + rows + " number of rows affected");
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
