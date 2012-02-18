package team34.event;

import team34.event.facility.*;

import team34.event.registration.RegistrationManager;

import team34.event.budget.*;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;



<<<<<<< HEAD
public class Event implements Serializable {




	private int eventID;
	private String eventName;
=======
public class Event  {

	private int eventID;
	private String eventName;
	private int numParticipant;
	private int numFacilitator;
>>>>>>> 6471891b7e36e2f3dd9865fe29736b446f9cdf83

	
	private LinkedList<VenueBookingRecord> vbrList;
	private BudgetPlan budgetPlan;
	private String organiserName;
	private boolean completed;

	private RegistrationManager registration;
	private VenueManager venueManager;
	
	/*public boolean bookVenue(String location, Schedule newSchedule){
		//return 
		return true;
	}*/
	

	private boolean advertised;
<<<<<<< HEAD
=======

>>>>>>> 6471891b7e36e2f3dd9865fe29736b446f9cdf83
	
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
