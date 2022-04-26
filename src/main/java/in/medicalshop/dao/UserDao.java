package in.medicalshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.medicalshop.model.UserModel;


public class UserDao {
	
	
	public static int registrationUser(UserModel user) throws Exception {
		String query = "INSERT INTO demouser (username,PASSWORD,email,contact) VALUES(?,?,?,?)";
		
		int result = 0;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
			"rev_user", "rev_user");
	
	PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setString(1, user.getName());
		statement.setString(2, user.getPassword());
		statement.setString(3, user.getEmail());
		statement.setString(4, user.getContact());
		
		result = statement.executeUpdate();
		
		return result;
		
		}
	}

