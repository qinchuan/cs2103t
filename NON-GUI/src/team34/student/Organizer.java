package team34.student;
public interface Organizer extends Cloneable {

	public void createEvent();
	public void deleteEvent(int eventID);
	public Object clone();
}
