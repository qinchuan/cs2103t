package team34.event.facility;

import java.util.Iterator;
import java.util.LinkedList;

public class Faculty {

	private LinkedList<Room> rooms;
	private LinkedList<String> roomTypes;
	private String name;
	
	public Faculty(String name){
		rooms = new LinkedList<Room>();
		roomTypes = new LinkedList<String>();
		this.name = name;
		//departments = 
	}
	public void addRoom(Room newRoom){
		rooms.add(newRoom);
	}
	public String getName(){
		return name;
	}
	
	//clone
	public LinkedList<Room> getRooms(){
		return rooms;
	}
	
	//return department by specifying the name
	public Room getRoom(String location){
		 Iterator<Room> itr = rooms.listIterator();
		 while(itr.hasNext()){
			 Room returnRoom = itr.next();
			 if(returnRoom.getLocation().equals(location)){
				 return returnRoom;
			 }
		 }		 
		 return null;
	}
	
	public void addType(String type){
		roomTypes.add(type);
	}
	
	//return a list of room types
	public LinkedList<String> getTypes(){
		return roomTypes;
	}
	
	//get a list of rooms of a certain type
	public LinkedList<Room> getRoomsByType(String type){
		LinkedList<Room> roomList = new LinkedList<Room>();
		Iterator<Room> itr = rooms.listIterator();
		
		while(itr.hasNext()){
			Room nextRoom = itr.next();
			if(nextRoom.getType().equals(type)){
				roomList.add(nextRoom);
			}
		}
		return roomList;
	}
	
}
