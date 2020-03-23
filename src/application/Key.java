package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Key {
	
	private String accessLevel;
	private String institution;
	private String holder;
	private LocalDate validTo;
	private String keyID;
	private String employeeID;
	private String comment;
	
	private ArrayList<Lock> specAccess = new ArrayList<Lock>();
	private ArrayList<AccessLevel> AccessLevels = new ArrayList<AccessLevel>();

	private String specialAccess;
	

	
	// Constructor-----------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public Key(String aLvl, String inst, String kID, String employeeID, LocalDate validTo, ArrayList<Lock> specAccess, ArrayList<AccessLevel> accessLevels, String comment, String holder) {
		setAccessLevel(aLvl);
		setInstitution(inst);
		setKeyID(kID);
		setEmployeeID(employeeID);
		setValidTo(validTo);
		setSpecAccess(specAccess);
		setAccessLevels(AccessLevels);
		setComment(comment);
		setHolder(holder);
	}
	
	


	//Getters and setters-------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String getComment() {
		return comment;
	}




	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public ArrayList<AccessLevel> getAccessLevels() {
		return AccessLevels;
	}
	public void setAccessLevels(ArrayList<AccessLevel> accessLevels) {
		AccessLevels = accessLevels;
	}
	public String getSpecialAccess() {
		return specialAccess;
	}
	public void setSpecialAccess(Integer access) {
		this.specialAccess = access +" Rooms";
	}
	
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getHolder() {
		return holder;
	}
	public void setOwner(String holder) {
		this.holder = holder;
	}
	public LocalDate getValidTo() {
		return validTo;
	}
	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getKeyID() {
		return keyID;
	}
	public void setKeyID(String keyID) {
		this.keyID = keyID;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public ArrayList<Lock> getSpecAccess() {
		return specAccess;
	}
    public void setSpecAccess(ArrayList<Lock> specAccess) {
		this.specAccess = specAccess;
	}

	
	
	

}
