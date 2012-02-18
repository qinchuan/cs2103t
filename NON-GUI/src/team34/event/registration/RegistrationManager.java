package team34.event.registration;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class RegistrationManager {
	private Set<String> notChoosedFs;
	private Set<String> participantRecord;
	private Set<String> choosedFs;
	private int partCapacity;
	
	public RegistrationManager(){
		notChoosedFs = new TreeSet<String>();
		participantRecord = new TreeSet<String>();
		choosedFs = new TreeSet<String>();
		partCapacity = 0;
	}
	
	public void setParticipantNum(int number){
		partCapacity = number;
	}
	//add new participant in list
	public boolean addParticipant(String id){
		if(participantRecord.size()<partCapacity){
			return participantRecord.add(id);
		}
		return false;
	}
	//add new facilitator in list
	public boolean addFacilitator(String id){
		return notChoosedFs.add(id);
	}
	//delete facilitator by user ID
	public boolean removeFacilitator(String id){
		return notChoosedFs.remove(id);
	}
	//delete a group of facilitators by passing a list of IDs
	public boolean removeFacilitatorAll(Set<String> idList){
		return notChoosedFs.removeAll(idList);
	}
	
	public boolean addChoosedF(String id){
		notChoosedFs.remove(id);
		return choosedFs.add(id);
		
	}
	public boolean addChoosedAllF(Set<String> idList){
		notChoosedFs.removeAll(idList);
		return choosedFs.addAll(idList);
	}
	public boolean removeChoosedF(String id){
		choosedFs.remove(id);
		return notChoosedFs.add(id);
	}
	public boolean removeChoosedAllF(Set<String> idList){
		choosedFs.removeAll(idList);
		return notChoosedFs.addAll(idList);
	}
	
	public LinkedList<String> getFacilitatorList(){
		LinkedList<String> returnList = new LinkedList<String>();
		for(String curID: notChoosedFs){
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
		for(String curID: choosedFs){
			returnList.add(curID);
		}
		return returnList;
	}
}
