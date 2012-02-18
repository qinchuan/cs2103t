package team34;

import java.util.LinkedList;

import java.util.Set;

import team34.event.facility.*;

import team34.student.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 VenueManager mang = new VenueManager();
	 
	 mang.bookVenue("Science", "LT33", new Schedule("18 Feb",12,14));
	 mang.bookVenue("Science", "LT33", new Schedule("18 Feb",13,15));
	 mang.bookVenue("Science", "LT33", new Schedule("18 Feb",10,12));
	 mang.bookVenue("Science", "LT33", new Schedule("18 Feb",14,16));
	 mang.bookVenue("Science", "LT33", new Schedule("18 Feb",16,18));
	 
	Set<String> typeList = mang.getTypeListOf("Science");
	 for(String cur:typeList){
		 System.out.println(cur);
	 }
	 
	 System.out.println();
	 
	 mang.cancelBooking("Science", "LT33",new Schedule("18 Feb",14,16));
	 
	 LinkedList<Schedule> changed = mang.getRoom("Science", "LT33").getSchedules();
	 for(Schedule cur:changed){
		 System.out.println(cur.toString());
	 }		
		
		
	}

}
