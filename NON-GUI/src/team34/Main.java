package team34;

import java.util.LinkedList;

import team34.student.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		
		Organizer org=stu;
		
		((Student)org).setName("aaa");
		
		Organizer org2=(Organizer)org.clone();
		
		((Student)org2).setName("bbb");
		
		
		
		
		
		
	
		
	}

}
