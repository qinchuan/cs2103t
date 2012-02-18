package team34.event.facility;

public class Schedule implements Cloneable {
	private String date;
	private int startTime;
	private int endTime;
	
	//default constructor
	public Schedule(){
		date = null;
		startTime = 0;
		endTime = 0;
	}
	//constructor: create new schedule based on date, start/end time
	public Schedule(String date,int startTime, int endTime){
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	//get date
	public String getDate(){
		return date;
	}
	//get start time
	public int getStartTime(){
		return startTime;
	}
	//get end time
	public int getEndTime(){
		return endTime;
	}
	public Schedule clone(){
		try{ 
		   return (Schedule) super.clone();  
		   } catch( CloneNotSupportedException e ){
			   return null;          
			   }
		
	}
	//return schedule information to string, format eg: 12:00 ~ 14:00, date
	public String toString(){
		return (startTime+":00 ~ "+endTime+":00, "+date);
	}
}
