package application;

public class Test {
	private KeyRegister keyReg = new KeyRegister();
	private EmployeeRegister employeeReg = new EmployeeRegister();
	private LockRegister lockReg = new LockRegister();
	public KeyRegister getKeyReg() {
		return keyReg;
	}
	public void setKeyReg(KeyRegister keyReg) {
		this.keyReg = keyReg;
	}
	public EmployeeRegister getEmployeeReg() {
		return employeeReg;
	}
	public void setEmployeeReg(EmployeeRegister employeeReg) {
		this.employeeReg = employeeReg;
	}
	public LockRegister getLockReg() {
		return lockReg;
	}
	public void setLockReg(LockRegister lockReg) {
		this.lockReg = lockReg;
	}

	
	
public void addTestValues() {
Lock door1 = new Lock("Room 1", "Lecture");
Lock door2 = new Lock("Room 13", "Lecture");
Lock door3 = new Lock("Room 2", "Lecture");
Lock door4 = new Lock("Room 164", "Conference");
Lock door5 = new Lock("Room 66", "Office");
Lock door6 = new Lock("Room 59", "Office");
lockReg.addLock(door1);
lockReg.addLock(door2);
lockReg.addLock(door3);
lockReg.addLock(door4);
lockReg.addLock(door5);
lockReg.addLock(door6);

AccessLevel a1 = new AccessLevel();
a1.setName("Lecture");
a1.getAccess().add(door1);
a1.getAccess().add(door2);
a1.getAccess().add(door3);
lockReg.getAccessLevels().put(a1.getName(),a1);

AccessLevel a2 = new AccessLevel();
a2.setName("Office");
a2.getAccess().add(door5);
a2.getAccess().add(door6);
lockReg.getAccessLevels().put(a2.getName(),a2);


}
}
