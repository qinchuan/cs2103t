package team34.storage;

import java.util.Map;
import java.util.TreeMap;

import team34.event.Event;

public class StorageAccessManager {
	private static Map<Integer, Event> eventDatabase;
	
	public StorageAccessManager(){
		eventDatabase = new TreeMap<Integer,Event>();
	}
	public static Event getEvent(int eventId){
		return eventDatabase.get(eventId);
	}
	public static void addEvent(Event newEvent){
		eventDatabase.put(newEvent.getEventID(), newEvent);
	}
}
