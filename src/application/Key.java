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
	private Employee employee;
	private String employeeID = employee.getpNbr();
	private ArrayList<Lock> specAccess = new ArrayList<Lock>();
	private ArrayList<ArrayList<Lock>> AccessLevels = new ArrayList<ArrayList<Lock>>();

	private String specialAccess=(specAccess.size()+" Rooms");
	

	
	// Constructor
	
	public Key(String aLvl, String inst, String kID, Employee employee, LocalDate validTo, ArrayList<Lock> specAccess, ArrayList<ArrayList<Lock>> accessLevels) {
		setAccessLevel(aLvl);
		setInstitution(inst);
		setKeyID(kID);
		setEmployee(employee);
		setValidTo(validTo);
		setSpecAccess(specAccess);
		setAccessLevels(accessLevels);
		setHolder(employee.getName());
	}
	
	


	//Getters and setters---------------
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public ArrayList<ArrayList<Lock>> getAccessLevels() {
		return AccessLevels;
	}
	public void setAccessLevels(ArrayList<ArrayList<Lock>> accessLevels) {
		AccessLevels = accessLevels;
	}
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
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employees) {
		this.employee = employees;
	}

	public ArrayList<Lock> getSpecAccess() {
		return specAccess;
	}
    public void setSpecAccess(ArrayList<Lock> specAccess) {
		this.specAccess = specAccess;
	}

	
	
	

}
