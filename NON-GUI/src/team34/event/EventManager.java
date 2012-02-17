package team34.event;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class EventManager {

	private Hashtable<Integer,Event> organisedEvents;
	private Hashtable<Integer,Event> faciliatedEvents;
	private Hashtable<Integer,Event> participatedEvents;
	
	public EventManager()
	{
		organisedEvents=new Hashtable<Integer, Event>();
		faciliatedEvents=new Hashtable<Integer, Event>();
		participatedEvents=new Hashtable<Integer, Event>();
		
	}
	
	public void deleteEvent(int eventID)
	{
		if (organisedEvents.containsKey(eventID))
		{	
			organisedEvents.remove(eventID);
		}
		
	}
	public void quitEventF(int eventID)
	{	
		if (faciliatedEvents.contains(eventID))
		{
			faciliatedEvents.remove(eventID);
		}
	}
	public void quitEventP(int eventID)
	{
	
		if (participatedEvents.containsKey(eventID))
		{
			participatedEvents.remove(eventID);
		}
	}
	
	public Hashtable<Integer, Event> getOrganisedEvents()
	{
		Hashtable<Integer,Event> temp=new Hashtable<Integer,Event>(organisedEvents);
		
		
	    return temp;
		
	
	}
	public Hashtable<Integer,Event> getFaciliatedEvents()
	{

		Hashtable<Integer,Event> temp=new Hashtable<Integer,Event>(faciliatedEvents);
		
		
	    return temp;
	}
	public Hashtable<Integer,Event> getParticipantEvents()
	{
		Hashtable<Integer,Event> temp=new Hashtable<Integer,Event>(participatedEvents);
		
		
	    return temp;
	}
	
	
	
	

}
