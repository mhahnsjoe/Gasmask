package application;
import java.util.Date;

public class Employee {
	
	private String pNbr;
	private String adress;
	private String comment;
	private Date endDate;
	private Key keys;
	private EmployeeRegister employeeRegister;
	private String name;
	
	
	//Getters and setters-----------
	public String getpNbr() {
		return pNbr;
	}
	public void setpNbr(String pNbr) {
		this.pNbr = pNbr;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Key getKeys() {
		return keys;
	}
	public void setKeys(Key keys) {
		this.keys = keys;
	}
	public EmployeeRegister getEmployeeRegister() {
		return employeeRegister;
	}
	public void setEmployeeRegister(EmployeeRegister employeeRegister) {
		this.employeeRegister = employeeRegister;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
