package application;

public class Lock {
	
	private String roomNr;
	private String institution;
	private String type;
	private String lockID;
	private String accessLevel;
	private Key keys;
	private LockRegister lockRegister;
	
	
	//Getter and setters------------------
	public String getRoomNr() {
		return roomNr;
	}
	public void setRoomNr(String roomNr) {
		this.roomNr = roomNr;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLockID() {
		return lockID;
	}
	public void setLockID(String lockID) {
		this.lockID = lockID;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	
	public Key getKeys() {
		return keys;
	}
	public void setKeys(Key keys) {
		this.keys = keys;
	}
	public LockRegister getLockRegister() {
		return lockRegister;
	}
	public void setLockRegister(LockRegister lockRegister) {
		this.lockRegister = lockRegister;
	}
	
	

}
