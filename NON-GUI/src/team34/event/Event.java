package team34.event;

import team34.event.facility.*;
<<<<<<< HEAD
import team34.event.registration.RegistrationManager;
=======
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
import team34.event.budget.*;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;


<<<<<<< HEAD
public class Event implements Serializable {
=======
<<<<<<< HEAD
public class Event  {

	private int eventID;
	private String eventName;
	private int numParticipant;
	private int numFacilitator;
=======
public class Event {
>>>>>>> 254c5da76b0a2ee30a249a00c126134e65645338

	private int eventID;
	private String eventName;
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
	
	private LinkedList<VenueBookingRecord> vbrList;
	private BudgetPlan budgetPlan;
	private String organiserName;
	private boolean completed;
<<<<<<< HEAD
	private RegistrationManager registration;
	private VenueManager venueManager;
	
	/*public boolean bookVenue(String location, Schedule newSchedule){
		//return 
		return true;
	}*/
	
=======
	private boolean advertised;
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
	
	public int getEventID()
	{
		return eventID;
	}
<<<<<<< HEAD
=======
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
	
>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
	

	
	
}
