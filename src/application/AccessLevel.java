package application;

import java.util.ArrayList;

public class AccessLevel {
private String name;
private ArrayList<Lock> Access = new ArrayList<Lock>();


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Lock> getAccess() {
	return Access;
}
public void setAccess(ArrayList<Lock> access) {
	Access = access;
}
}
