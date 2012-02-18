package team34.advertisement;

import java.util.LinkedList;

public class AdvertisementManager {

	private LinkedList<AdvertisementRecord> eventList;
	
	public AdvertisementManager()
	{
		
	}
	
	public LinkedList<AdvertisementRecord>  getAdvertisedEvents()
	{
		LinkedList<AdvertisementRecord>  temp= new LinkedList<AdvertisementRecord> (eventList);
		return temp;
	}
	
	
	public void addAdvertisedEvent(String name, String description, String organizer,String location, int date, int time)
	{
		AdvertisementRecord temp=new AdvertisementRecord();
		temp.setName(name);
		temp.setDescription(description);
		temp.setOrganizer(organizer);
		temp.setLocation(location);
		
	}
}
