package team34.event;

import team34.event.facility.*;
import team34.event.budget.*;
import java.util.Date;
import java.util.LinkedList;


public class Event {

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
	protected void setEventID(int eventID)
	{
		this.eventID=eventID;
	}
	
	public String getEventName()
	{
		return this.eventName;
	}
	protected void setEventName(String eventName)
	{
		this.eventName=eventName;
	}
	public Event()
	{
		
	}
	
	

	
	
}
