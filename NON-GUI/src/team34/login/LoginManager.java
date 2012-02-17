package team34.login;

import java.util.Hashtable;

public class LoginManager {

	private Hashtable<String, UserAccount> userList;

	public LoginManager()
	{
		userList=new Hashtable<String, UserAccount>();


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
