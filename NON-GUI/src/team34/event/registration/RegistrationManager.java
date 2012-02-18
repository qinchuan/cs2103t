package team34.event.registration;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class RegistrationManager {
	private Set<String> facilitatorRecord;
	private Set<String> participantRecord;
	private Set<String> choosedFacilitators;
	
	public RegistrationManager(){
		facilitatorRecord = new TreeSet<String>();
		participantRecord = new TreeSet<String>();
		choosedFacilitators = new TreeSet<String>();
	}
	//add new participant in list
	public boolean addParticipant(String id){
		return participantRecord.add(id);
	}
	//add new facilitator in list
	public boolean addFacilitator(String id){
		return facilitatorRecord.add(id);
	}
	//delete facilitator by user ID
	public boolean deleteFacilitator(String id){
		return facilitatorRecord.remove(id);
	}
	//delete a group of facilitators by passing a list of IDs
	public boolean deleteFacilitators(Set<String> idList){
		return facilitatorRecord.removeAll(idList);
	}
	public LinkedList<String> getFacilitatorList(){
		LinkedList<String> returnList = new LinkedList<String>();
		for(String curID: facilitatorRecord){
			returnList.add(curID);
		}
		return returnList;
	}
	public LinkedList<String> getParticipantList(){
		LinkedList<String> returnList = new LinkedList<String>();
		for(String curID: participantRecord){
			returnList.add(curID);
		}
		return returnList;
	}
	public LinkedList<String> getChoosedFacilitators(){
		LinkedList<String> returnList = new LinkedList<String>();
		for(String curID: choosedFaciliators){
			returnList.add(curID);
		}
		return returnList;
	}
}
