package team34.advertisement;

import java.io.Serializable;

public class AdvertisementRecord implements Serializable {

	private String name;
	private String location;
	private String organizer;
	private String description;
	private String date;
	private int startTime;
	private int endTime;
	
	public AdvertisementRecord()
	{
		name="";
		location="";
		organizer="";
		description="";
		date="";
		startTime=0;
		endTime=0;
	}
	protected void setName(String name)
	{
		this.name=name;
	}
	protected void setLocation(String location)
	{
		this.location=location;
	}
	protected void setOrganizer(String organizer)
	{
		this.organizer=organizer;
	}
	protected void setDescription(String description)
	{
		this.description=description;
	}
	
	protected void setDate(String date)
	{
		this.date=date;
	}
	protected void setStartTime(int time)
	{
		if (time>=0 && time <=24)
		{
			startTime=time;
		}
	}
	protected void setEndTime(int time)
	{
		if (time>=0 && time <=24)
		{
			endTime=time;
		}
		
	}
	public String getName()
	{
		return this.name;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	public String getOrganizer()
	{
		return this.organizer;
	}
	public String getDescription()
	{
		return this.description;
	}
	public String getDate()
	{
		return this.date;
	}
	public int getStartTime()
	{
		return this.startTime;
	}
	public int getEndTime()
	{
		return this.endTime;
	}
}
