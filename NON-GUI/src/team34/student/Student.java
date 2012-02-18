package team34.student;
import java.io.Serializable;

import team34.event.*;

import sun.reflect.Reflection;
public class Student implements Organizer, Faciliator, Participant,Serializable {

<<<<<<< HEAD
	private String userID;
	private String password;
=======

>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
	private String name;
	private int age;
	private String gender;
	private String faculty;
<<<<<<< HEAD
	private EventManager eventManager;
	
	public Student(){
		userID="";
		password="";
=======
	public EventManager eventManager;
	
	public Student(){
	
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
		name="";
		age=0;
		gender="";
		faculty="";
		eventManager=new EventManager();
	}
<<<<<<< HEAD
=======
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
	
	//below is for organiser
	public void createEvent()
	{
		
	}
	public void deleteEvent(int eventID)
	{
		
	}
	
	//below is for faciliator
	public void assistEvent()
	{
		
	}
	
	//below is for participant
	public void joinEvent()
	{
		
	}
	public void quitEvent(Object o, int eventID)
	{

<<<<<<< HEAD
		/*if (o instanceof Faciliator)
=======
		if (o instanceof Faciliator)
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
		{
			eventManager.quitEventP(eventID);
			
		}else if (o instanceof Participant)
		{
			eventManager.quitEventF(eventID);
<<<<<<< HEAD
		}*/
=======
		}
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
	
	}

	
}
