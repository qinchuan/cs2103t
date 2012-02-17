package team34.event.facility;

import java.util.Iterator;
import java.util.LinkedList;

public class Room {
	private LinkedList<Schedule> roomSchedules;
	private String location;
	private String type;
	private String capacity;
	
	public Room(String location, String type, String capacity){
		roomSchedules = new LinkedList<Schedule>();
		this.location = location;
		this.type = type;
		this.capacity = capacity;
	}

	/*return true, if new schedule is added in successfully
	 * tested @zhangxi
	 */
	public boolean addSchedule(Schedule newSchedule){
		Iterator <Schedule> itr= roomSchedules.listIterator();
		
		while(itr.hasNext()){
			Schedule temp = itr.next();
			//check date, start/end time
			if(temp.getDate().equals(newSchedule.getDate())){
				//check if newSchedule falls in existing schedule
				if(temp.getStartTime()<newSchedule.getStartTime()&&temp.getEndTime()>newSchedule.getStartTime()){
					return false;
				}
				if(temp.getStartTime()<newSchedule.getEndTime()&&temp.getEndTime()>newSchedule.getEndTime()){
					return false;
				}
				if(temp.getStartTime()==newSchedule.getStartTime()&&temp.getEndTime()==newSchedule.getEndTime()){
					return false;
				}
				if(newSchedule.getStartTime()<temp.getStartTime()&&newSchedule.getEndTime()>temp.getStartTime()){
					return false;
				}
				if(newSchedule.getStartTime()<temp.getEndTime()&&newSchedule.getEndTime()>temp.getEndTime()){
					return false;
				}
				
			}
		}
		return roomSchedules.add(newSchedule);
	}
	/*return true, if schedule is removed successfully, otherwise if the schedule is not in list return false
	* tested @zhangxi
	*/
	//set schedules for the room
	public void setSchedules(LinkedList<Schedule> scheduleList){
		roomSchedules = scheduleList;
	}
	public boolean deleteSchedule(Schedule newSchedule){
		Iterator <Schedule> itr= roomSchedules.listIterator();
		
		while(itr.hasNext()){
			Schedule temp = itr.next();
			//check date, start/end time
			if(temp.getDate().equals(newSchedule.getDate())){
				if(temp.getStartTime()==newSchedule.getStartTime()&&temp.getEndTime()==newSchedule.getEndTime()){
					itr.remove();
					return true;
				}
			}
		}
		return false;
	}
	
	public LinkedList<Schedule> getSchedules(){
		LinkedList<Schedule> returnSchedules = new LinkedList<Schedule>();
		Iterator<Schedule> itr = roomSchedules.listIterator();
		
		while(itr.hasNext()){
			returnSchedules.add(itr.next());
		}
		return returnSchedules;
	}
	
	public String getLocation(){
		return location;
	}
	
	public String getType(){
		return type;
	}
	
	public String getCapacity(){
		return capacity;
	}
	
	public Room clone(){
		//create new room
		Room returnRoom = new Room(this.getLocation(),this.getType(),this.getCapacity());
		returnRoom.setSchedules(this.getSchedules());
		return returnRoom;
	}
}
