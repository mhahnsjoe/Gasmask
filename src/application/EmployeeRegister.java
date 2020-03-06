package application;

import java.util.HashMap;

public class EmployeeRegister {
	
	private HashMap<String, Employee> employeeList = new HashMap<String, Employee>();

	//Getters and setters

	public HashMap<String, Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(HashMap<String, Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void addEmployee(Employee employee) {
		this.getEmployeeList().put(employee.getpNbr(), employee);
	}
	
	public Employee  findEmployee(String pNbr) {
		return employeeList.get(pNbr);
	}
	
	public void removeEmployee(String pNbr) {
		employeeList.remove(pNbr);
	}

}
