package application;

import java.util.ArrayList;
import java.util.Date;

public class Key {
	
	private String accessLevel;
	private String owner;
	private Date validTo;
	private String keyID;
	private Employee employee;
	private String employeeID = employee.getpNbr();
	private ArrayList<Lock> specAccess = new ArrayList<Lock>();
	private String specialAccess=(specAccess.size()+" Rooms");

	
	
	
	//Getters and setters---------------
	public String getEmployeeID() {
		return employeeID;
	}
	public String getSpecialAccess() {
		return specialAccess;
	}
	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = (specAccess.size()+" Rooms");
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
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
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employees) {
		this.employee = employees;
	}
	
	public ArrayList<Lock> getLocksList() {
		return specAccess;
	}
	public void setLocksList(ArrayList<Lock> specAccess) {
		this.specAccess = specAccess;
	}
	public KeyRegister getKeyRegister() {
		return keyRegister;
	}
	public void setKeyRegister(KeyRegister keyRegister) {
		this.keyRegister = keyRegister;
	}
	
	
	

}
