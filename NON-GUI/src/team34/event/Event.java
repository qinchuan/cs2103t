package team34.event;

import team34.event.facility.*;
import team34.event.registration.RegistrationManager;
import team34.event.budget.*;
import java.util.Date;
import java.util.LinkedList;


public class Event  {

	private int eventID;
	private String eventName;
	private int numParticipant;
	private int numFacilitator;
	
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
	
	
	public int getEventID()
	{
		return eventID;
	}
	

	
	
}
