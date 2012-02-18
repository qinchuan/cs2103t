package team34.event;
<<<<<<< HEAD
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import team34.storage.StorageAccessManager;
public class EventManager {

	Set <String> participateEventList;
	Set <String> facilitateEventList;
	Set <String> organizedEventList;
	
	public EventManager(){
		participateEventList = new TreeSet<String>();
		facilitateEventList = new TreeSet<String>();
		organizedEventList = new TreeSet<String>();
	}
	
	public boolean addParticipateEvent(String eventId){
		return participateEventList.add(eventId);
	}
	public boolean addFacilitateEvent(String eventId){
		return facilitateEventList.add(eventId);
	}
	public boolean addOrganizeEvent(String eventId){
		return organizedEventList.add(eventId);
	}
	public boolean removeParticipateEvent(String eventId){
		return participateEventList.remove(eventId);
	}
	public boolean removeFacilitateEvent(String eventId){
		return facilitateEventList.remove(eventId);
	}
	public boolean removeOrganizeEvent(String eventId){
		return organizedEventList.remove(eventId);
	}
	public LinkedList<String> getParticipateEventList(){
		LinkedList<String> returnList = new LinkedList<String>();
		for(String curEventID: participateEventList){
			returnList.add(curEventID);
		}
		return returnList;
	}
	public LinkedList<String> getFacilitateEventList(){
		LinkedList<String> returnList = new LinkedList<String>();
		for(String curEventID: facilitateEventList){
			returnList.add(curEventID);
		}
		return returnList;
	}
	public LinkedList<String> getOrganizeEventList(){
		LinkedList<String> returnList = new LinkedList<String>();
		for(String curEventID: organizedEventList){
			returnList.add(curEventID);
		}
		return returnList;	
	}
	
	public Event getEvent(int id){
		return StorageAccessManager.getEvent(id);
	}
=======
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
	
	
	
	

>>>>>>> 702cfae6a50d599766001a73b0473c591ab40e27
}
