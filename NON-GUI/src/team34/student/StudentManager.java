package team34.student;

import java.util.Hashtable;

public class StudentManager {
	
	Hashtable<Integer, Student> studentList;
	
	public StudentManager()
	{
		studentList=new Hashtable<Integer, Student>();
	}
	
	private boolean verifyStudentID(int studentID)
	{
		if (studentList.containsKey(studentID))
		{
			return true;
		} 
		return false;
	}
	public Student getStudent(int studentID)
	{
		if (verifyStudentID(studentID))
		{	
			Student stu=(Student)studentList.get(studentID).clone();
			return stu;
		}
		else return null;
	}
	
	

}
