package application;
import java.util.HashMap;
import java.util.Random;

public class LockRegister {
	

	// Attributes 
	private HashMap<String, Lock> lockList = new HashMap<String, Lock>();
		
	// Getters and setters 

	public HashMap<String, Lock> getLockList() {
			return lockList;
		}

		
	public void setLockList(HashMap<String, Lock> lockList) {
			this.lockList = lockList;
		}
	
	
		
	public void addLock(Lock lock) {
		this.getLockList().put(lock.getLockID(), lock);
	}
	
	public Lock findLock(String lockID) {
		return lockList.get(lockID);
	}
	
	public void removeLock(String lockID) {
		lockList.remove(lockID);
	}


	// Returns a generated and validated student Id
		public String generateLockID() {
			Boolean duplicate = true;
			String lockID = "";
			while (duplicate == true) {
				
				Random random = new Random();

				int randInt = random.nextInt(99999);
				while (randInt <= 9999) {
					randInt = random.nextInt(99999);
				}
				
				if (findLock(lockID) == null) {
					duplicate = false;
				}
			}
			return lockID;
		}
	}
	


