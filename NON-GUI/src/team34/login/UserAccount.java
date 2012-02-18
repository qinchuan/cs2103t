package team34.login;

import java.io.Serializable;

public class UserAccount  implements Serializable  {

	private String username;
	private String password;
	private int studentID;
	
	public UserAccount()
	{
		
	}
	public String getUserName()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	public int getStudentID()
	{
		return studentID;
	}
	
	protected void setUsername(String username)
	{
		this.username=username;
	}
	protected void setPassword(String password)
	{
		this.password=password;
	}
	protected void setStudentID(int studentID)
	{
		this.studentID=studentID;
	}
	
	
	
}
