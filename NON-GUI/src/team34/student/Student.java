package team34.student;
import sun.reflect.Reflection;
import team34.event.EventManager;

public class Student implements Organizer, Faciliator, Participant {


	private String userID;
	private String password;

	private String name;
	private int age;
	private String gender;
	private String faculty;

	private EventManager eventManager;
		
		
	
	public Student(){
	
		userID="";
		password="";
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


		/*if (o instanceof Faciliator)
		if (o instanceof Faciliator)
		{
			eventManager.quitEventP(eventID);
			
		}else if (o instanceof Participant)
		{
			eventManager.quitEventF(eventID);

		}*/

		}

	
	
}