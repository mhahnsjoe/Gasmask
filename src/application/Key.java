package application;

import java.util.ArrayList;
import java.util.Date;

public class Key {
	
	private String accessLevel;
	private String specAccess;
	private String owner;
	private Date validFrom;
	private Date validTo;
	private String keyID;
	private Employee employees;
	private ArrayList<Lock> locksList = new ArrayList<Lock>();
	private KeyRegister keyRegister;
	
	
	//Getters and setters---------------
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	public String getSpecAccess() {
		return specAccess;
	}
	public void setSpecAccess(String specAccess) {
		this.specAccess = specAccess;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTo() {
		return validTo;
	}
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
	public String getKeyID() {
		return keyID;
	}
	public void setKeyID(String keyID) {
		this.keyID = keyID;
	}
	
	public Employee getEmployees() {
		return employees;
	}
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	
	public ArrayList<Lock> getLocksList() {
		return locksList;
	}
	public void setLocksList(ArrayList<Lock> locksList) {
		this.locksList = locksList;
	}
	public KeyRegister getKeyRegister() {
		return keyRegister;
	}
	public void setKeyRegister(KeyRegister keyRegister) {
		this.keyRegister = keyRegister;
	}
	
	
	

}
