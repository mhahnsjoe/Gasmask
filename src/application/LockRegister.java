package application;
import java.util.HashMap;
import java.util.Random;

public class LockRegister {
	

	// Attributes 
	private HashMap<String, Lock> lockList = new HashMap<String, Lock>();
		
	private HashMap<String, AccessLevel> AccessLevels = new HashMap<String, AccessLevel>();
	// Getters and setters 

	public HashMap<String, AccessLevel> getAccessLevels() {
		return AccessLevels;
	}


	public void setAccessLevels(HashMap<String, AccessLevel> accessLevels) {
		AccessLevels = accessLevels;
	}


	public HashMap<String, Lock> getLockList() {
			return lockList;
		}

		
	public void setLockList(HashMap<String, Lock> lockList) {
			this.lockList = lockList;
		}
	
	
		
	public void addLock(Lock lock) {
		this.getLockList().put(lock.getRoomNr(), lock);
	}
	
	public Lock findLock(String lockID) {
		return lockList.get(lockID);
	}
	
	public void removeLock(String lockID) {
		lockList.remove(lockID);
	}



	}
	


