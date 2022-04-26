package in.medicalshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;

public class ConnectionUtil {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println(connection);
	}
	

	
	public static Connection getConnection() throws DBException  {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://101.53.133.88:3306/revature_training_db",
					"rev_user", "rev_user");
		} 
		catch(CommunicationsException e) {
			throw new DBException("Unable to connect the database server",e);
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DBException(e);
		}
		return connection;
	}
}
