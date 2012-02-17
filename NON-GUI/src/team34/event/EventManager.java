package team34.event;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class EventManager implements Cloneable{

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
		Hashtable<Integer,Event> temp=new Hashtable<Integer,Event>();
		
		Set<Integer> set = organisedEvents.keySet();
		Iterator<Integer> itr = set.iterator();
	    while (itr.hasNext()) 
	    {
	    	int key=itr.next();
	    	Event e=(Event)organisedEvents.clone();
	    	temp.put(key, e);
	    	
	    }
	    return temp;
		
	
	}
	public Hashtable<Integer,Event> getFaciliatedEvents()
	{

		Hashtable<Integer,Event> temp=new Hashtable<Integer,Event>();
		
		Set<Integer> set = faciliatedEvents.keySet();
		Iterator<Integer> itr = set.iterator();
	    while (itr.hasNext()) 
	    {
	    	int key=itr.next();
	    	Event e=(Event)faciliatedEvents.clone();
	    	temp.put(key, e);
	    	
	    }
	    return temp;
	}
	public Hashtable<Integer,Event> getParticipantEvents()
	{
		Hashtable<Integer,Event> temp=new Hashtable<Integer,Event>();
		
		Set<Integer> set = participatedEvents.keySet();
		Iterator<Integer> itr = set.iterator();
	    while (itr.hasNext()) 
	    {
	    	int key=itr.next();
	    	Event e=(Event)participatedEvents.clone();
	    	temp.put(key, e);
	    	
	    }
	    return temp;
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
