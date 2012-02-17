package team34.event.facility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class VenueManager {
	LinkedList<Faculty> faculties;
	LinkedList<Room> rooms;
	
	public VenueManager(){
		faculties = new LinkedList<Faculty>();
		rooms = new LinkedList<Room>();
		loadInfo();
	}
	
	//load venue information from existing files
	private void loadInfo(){
		try {
			
			File file = new File("src/venue.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()){
				
				Faculty newFac = new Faculty(sc.nextLine());  //create new faculty from input
				int numRoomType = sc.nextInt();			 	 //read in number of room types
				
				for(int i=0;i<numRoomType;i++){
					int numRoom = sc.nextInt();			  	//read number of rooms per type
					String roomType = sc.next(); 				  //read in room type name
					newFac.addType(roomType);
					
					for(int j=0;j<numRoom;j++){
						String location = sc.next();
						String capacity = sc.next();
						Room newRoom = new Room(location,roomType,capacity);
						
						newFac.addRoom(newRoom);   					//add new room in faculty list 
						rooms.add(newRoom);							//add new room in the room list database
					}
				}
				
				faculties.add(newFac);    //add new faculty to list
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
	
	//return the faculty name list
	public LinkedList<String> getFaculties(){
		LinkedList<String> facultyList = new LinkedList<String>();
		Iterator<Faculty> itr = faculties.listIterator();
		
		while(itr.hasNext()){
			facultyList.add(itr.next().getName());
		}
		
		return facultyList;
	}
	

	/*public LinkedList<Room> getRoomsByFac(String name){
		return null;
	}*/
	/*	public Faculty getFaculty(String name){
		 Iterator<Faculty> itr = faculties.listIterator();
		 while(itr.hasNext()){
			 Faculty returnFaculty = itr.next();
			 if(returnFaculty.getName().equals(name)){
				 return returnFaculty;
			 }
		 }		 
		 return null;
	}
	*/
	
	//book a venue with a time period
	public boolean bookVenue(Room room, Schedule schedule){
		return room.addSchedule(schedule);
	}
	
	public boolean bookVenue(String location, Schedule schedule){
		 Iterator<Room> itr = rooms.listIterator();
		 
		 while(itr.hasNext()){
			 Room room = itr.next();
			 if(room.getLocation().equals(location)){
				 return room.addSchedule(schedule);
			 }
		 }
		 return false;
	}
	//cancel booking the venue with time period
	public boolean cancelBooking(Room room, Schedule schedule){
		return room.deleteSchedule(schedule);
	}
	
	public boolean cancelBooking(String location, Schedule schedule){
		Iterator<Room> itr = rooms.listIterator();
		 
		 while(itr.hasNext()){
			 Room room = itr.next();
			 if(room.getLocation().equals(location)){
				 return room.deleteSchedule(schedule);
			 }
		 }
		 return false;
	}
}
