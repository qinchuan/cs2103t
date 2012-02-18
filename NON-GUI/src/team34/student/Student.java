package team34.student;
<<<<<<< HEAD
import java.io.Serializable;

import team34.event.EventManager;
public class Student implements Organizer, Faciliator, Participant, Serializable {


=======
import sun.reflect.Reflection;
import team34.event.EventManager;

public class Student implements Organizer, Faciliator, Participant {


	private String userID;
	private String password;

>>>>>>> 6471891b7e36e2f3dd9865fe29736b446f9cdf83
	private String name;
	private int age;
	private String gender;
	private String faculty;

	private EventManager eventManager;
<<<<<<< HEAD
	
	
	public Student(){
	

=======
		
		
	
	public Student(){
	
		userID="";
		password="";
>>>>>>> 6471891b7e36e2f3dd9865fe29736b446f9cdf83
		name="";
		age=0;
		gender="";
		faculty="";
		eventManager=new EventManager();
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}

	
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
=======
		/*if (o instanceof Faciliator)
		if (o instanceof Faciliator)
>>>>>>> 6471891b7e36e2f3dd9865fe29736b446f9cdf83
		{
			eventManager.quitEventP(eventID);
			
		}else if (o instanceof Participant)
		{
			eventManager.quitEventF(eventID);

		}*/

<<<<<<< HEAD
	}

	
	

=======
		}

	
>>>>>>> 6471891b7e36e2f3dd9865fe29736b446f9cdf83
	
}
