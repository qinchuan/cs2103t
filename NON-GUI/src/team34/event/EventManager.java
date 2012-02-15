package team34.event;
import java.util.Iterator;
import java.util.LinkedList;
public class EventManager {

	private LinkedList<Event> organisedEvents;
	private LinkedList<Event> faciliatedEvents;
	private LinkedList<Event> participatedEvents;
	
	public EventManager()
	{
		organisedEvents=new LinkedList<Event>();
		faciliatedEvents=new LinkedList<Event>();
		participatedEvents=new LinkedList<Event>();
		
	}
	
	public void deleteEvents(int eventID)
	{
		Iterator<Event> itr=organisedEvents.iterator();
		while (itr.hasNext())
		{
			Event temp=itr.next();
			if (temp.getEventID()==eventID)
			{
				itr.remove();
			}
		}
	}
	public void quitEventF(int eventID)
	{
		Iterator<Event> itr=faciliatedEvents.iterator();
		while (itr.hasNext())
		{
			Event temp=itr.next();
			if (temp.getEventID()==eventID)
			{
				itr.remove();
			}
		}
	}
	public void quitEventP(int eventID)
	{
	
		Iterator<Event> itr=participatedEvents.iterator();
		while (itr.hasNext())
		{
			Event temp=itr.next();
			if (temp.getEventID()==eventID)
			{
				itr.remove();
			}
		}
	}
}
