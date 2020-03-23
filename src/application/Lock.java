package application;

public class Lock {
	
	private String roomNr;
	private String type;

	
	
	//Getter and setters------------------

	public String getRoomNr() {
		return roomNr;
	}
	public void setRoomNr(String roomNr) {
		this.roomNr = roomNr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

// Constructor --------
	public Lock(String roomNr, String type) {
		setRoomNr(roomNr);
		setType(type);
	}
}
