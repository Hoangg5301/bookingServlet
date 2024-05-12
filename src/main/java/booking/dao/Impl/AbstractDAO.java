package booking.dao.Impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import booking.dao.GenericDAO;

public abstract class AbstractDAO<T> implements GenericDAO<T>{
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/booking";
			String user = "root";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	//check connect
	public static void main(String[] args) {
		Connection a = AbstractDAO.getConnection();
		if (a == null) {
			System.out.println("chua co ket noi");
		}else {
			System.out.println("Da co ket noi");
			
			try {
				PreparedStatement pStament = a.prepareStatement("Select * From categorytourist");
				ResultSet resultSet = pStament.executeQuery();
				
				while(resultSet.next()) {
					System.out.println("ID Category" + "     "+ "Name Category");
					System.out.println(resultSet.getString(1) + "     "+ resultSet.getString(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	
}
