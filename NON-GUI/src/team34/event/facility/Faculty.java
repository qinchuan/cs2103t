package team34.event.facility;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faculty {

	private Hashtable<String,Room> roomTable;
	private String name;
	
	public Faculty(String name){
		roomTable = new Hashtable<String,Room>();
		this.name = name;
		//departments = 
	}
	public void addRoom(Room newRoom){
		//rooms.add(newRoom);
		String roomLocation = newRoom.getLocation();
		roomTable.put(roomLocation, newRoom);
	}
	public String getName(){
		return name;
	}
	
	public LinkedList<Room> getRooms(){
		LinkedList<Room> roomList = new LinkedList<Room>();
		Iterator<Map.Entry<String,Room>> itr = roomTable.entrySet().iterator();
		
		while(itr.hasNext()){
			roomList.add(itr.next().getValue().clone());
		}
		return roomList;
	}
	
	//return department by specifying the name
	public Room getRoom(String location){
		/* Iterator<Room> itr = rooms.listIterator();
		 while(itr.hasNext()){
			 Room returnRoom = itr.next();
			 if(returnRoom.getLocation().equals(location)){
				 return returnRoom;
			 }
		 }		 
		 return null;
	*/	
		return roomTable.get(location).clone();
	}
	
	//return a list of room types
	public Set<String> getTypes(){
		Set<String> typeList = new TreeSet<String>();
		
		Iterator<Map.Entry<String, Room>> itr = roomTable.entrySet().iterator();
		while(itr.hasNext()){
			typeList.add(itr.next().getValue().getType());
			}
		
		return typeList;
	}
	
	//get a list of rooms of a certain type
	public LinkedList<Room> getRoomsByType(String type){
		LinkedList<Room> roomList = new LinkedList<Room>();
			
		Iterator<Map.Entry<String,Room>> itr = roomTable.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, Room> curRoom = itr.next();
			if(curRoom.getKey().equals(type)){
					roomList.add(curRoom.getValue().clone());
				}
			}
			
		return roomList;
	}
	
	//book venue with new schedule
	public boolean bookVenue(String location,Schedule newSchedule){
		return roomTable.get(location).addSchedule(newSchedule);
	}
	
	//cancel booking for a venue
	public boolean cancelBooking(String location,Schedule newSchedule){
		return roomTable.get(location).deleteSchedule(newSchedule);
	}
	
}
