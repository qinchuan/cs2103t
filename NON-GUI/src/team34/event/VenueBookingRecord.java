package team34.event;

public class VenueBookingRecord implements Cloneable {
	public Object clone()
	{
		try {
			return super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
		System.out.println("Cloning not allowed."); 
			return null;
		}
	}

}
