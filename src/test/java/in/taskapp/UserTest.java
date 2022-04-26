package in.taskapp;
import java.util.Scanner;

import in.medicalshop.dao.UserDao;
import in.medicalshop.model.UserModel;

//import org.apache.logging.log4j.core.lookup.MainMapLookup;



public class UserTest {
	
	public static void main (String[] args) throws Exception { 
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	
	String Name = sc.next();
	System.out.println("Enter email");
	String email = sc.next();
	System.out.println("Enter contact");
	String contact = sc.next();
	System.out.println("enter password");
	String password = sc.next();
	
	UserModel obj = new UserModel();
//	
	obj.setName(Name);
	obj.setEmail(email);
	obj.setContact(contact);
	obj.setPassword(password);
	
	
	//UserDao obj1 = new UserDao();

	//obj1.registrationUser(obj);
	
	int n = UserDao.registrationUser(obj);
	if(n==1) {
		System.out.println("Success");
	}
	else {
		System.out.println("Failed");
		
	}
	sc.close();
}
	
}