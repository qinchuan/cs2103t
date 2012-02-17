package team34.event;

import team34.event.facility.*;
import team34.event.budget.*;
import java.util.Date;
import java.util.LinkedList;


public class Event  implements Cloneable{

	private int eventID;
	private String eventName;
	
	private LinkedList<VenueBookingRecord> vbrList;
	private BudgetPlan budgetPlan;
	private String organiserName;
	private boolean completed;
	
	public int getEventID()
	{
		return eventID;
	}
	public Event()
	{
		
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
