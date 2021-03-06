package team34.event.registration;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import team34.event.Event;
import team34.storage.StorageAccessManager;

public class RegistrationRecord {
	Set <String> participateEventList;
	Set <String> facilitateEventList;
	Set <String> organizedEventList;
	
	public RegistrationRecord(){
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
}
