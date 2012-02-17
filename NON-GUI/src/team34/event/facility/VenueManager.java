package team34.event.facility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VenueManager {
	private Hashtable<String,Faculty> facultyTable;
	
	public VenueManager(){
		facultyTable = new Hashtable<String,Faculty>();
		loadInfo();
	}
	
	//load venue information from existing files which can be changed if there is dummy data
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
					
					for(int j=0;j<numRoom;j++){
						String location = sc.next();
						String capacity = sc.next();
						Room newRoom = new Room(location,roomType,capacity);
						
						newFac.addRoom(newRoom);   					//add new room in faculty list 
					}
				}
				
				//faculties.add(newFac);    //add new faculty to list
				facultyTable.put(newFac.getName(), newFac);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
	
	//return the faculty name list
	public LinkedList<String> getFaculties(){
		LinkedList<String> facultyList = new LinkedList<String>();
		Iterator<Map.Entry<String, Faculty>> itr = facultyTable.entrySet().iterator();
		
		while(itr.hasNext()){
			facultyList.add(itr.next().getKey());
		}
		
		return facultyList;
	}
	
	public Room getRoom(String faculty,String location){
		return facultyTable.get(faculty).getRoom(location);
	}
	//get a list of all rooms of faculty
	public LinkedList<Room> getRoomsBy(String faculty){
		return facultyTable.get(faculty).getRooms();
	}

	//get a list of rooms of a certain type under Faculty
	public LinkedList<Room> getRoomsBy(String faculty, String type){
		return facultyTable.get(faculty).getRoomsByType(type);
	}
	
	public Set<String> getTypeListOf(String faculty){
		return facultyTable.get(faculty).getTypes();
	}
	//book a venue with schedule
	public boolean bookVenue(String faculty, String location, Schedule newSchedule){
		return facultyTable.get(faculty).bookVenue(location, newSchedule);
	}

	//cancel booking the venue with time period
	public boolean cancelBooking(String faculty, String location, Schedule deleSchedule){
		return facultyTable.get(faculty).cancelBooking(location, deleSchedule);
	}
		

}
