package team34.login;

public class UserAccount implements Cloneable {

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
	public Object clone()
	{
		try {
			return super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
		System.out.println("Cloning not allowed."); 
			return null;
		}
	}
}
