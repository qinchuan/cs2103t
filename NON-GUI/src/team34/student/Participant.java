package team34.student;
public interface Participant extends Cloneable {
	
	public void joinEvent();
	public void quitEvent(Object o,int eventID);
	public Object clone();

}
