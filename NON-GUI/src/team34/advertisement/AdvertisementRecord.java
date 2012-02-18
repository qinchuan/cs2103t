package team34.advertisement;

public class AdvertisementRecord {

	private String name;
	private String location;
	private String organizer;
	private String description;
	
	public AdvertisementRecord()
	{
		name="";
		location="";
		organizer="";
		description="";
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
}
