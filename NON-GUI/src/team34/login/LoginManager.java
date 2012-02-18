package team34.login;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import team34.storage.StorageAccessManager;

public class LoginManager {

	private  Hashtable<String, UserAccount> userList;

	public LoginManager()
	{
		userList=Initiliaze();
		System.out.println(userList.size());

	}
	public boolean save()
	
	{ 	
		if (StorageAccessManager.saveUserAccount(userList, "database/UserAccounts"))
		{
			return true;
		}
		return false;
	}
	
	private Hashtable<String, UserAccount> Initiliaze()
	{
		Hashtable<String, UserAccount> temp=StorageAccessManager.InitializeUserAccount("database/UserAccounts");
		if (temp==null || temp.size()==0)
		{
			return null;
		}
		else 
		{
			
			
			return temp;
		}
	
		
	}
	public void createAccount(String username, String password, int studentID)
	{
		UserAccount temp=new UserAccount();
		temp.setUsername(username);
		temp.setPassword(password);
		temp.setStudentID(studentID);
		userList.put(username, temp);
	}
	public boolean verifyPassword(String username, String password)
	{	
		if (userList.containsKey(username))
		{
			UserAccount temp=userList.get(username);

			if (temp.getPassword().equals(password))
			{
				return true;
			}
		return false;
		}

		else return false;
	}
	
	//return 0 if there is no such username
	public int getStudentID(String username)
	{   if (userList.contains(username))
		{
			return userList.get(username).getStudentID();
		}
		
		return 0;
	}
}
