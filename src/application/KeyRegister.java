package application;

import java.util.HashMap;

public class KeyRegister {
	
	private HashMap<String, Key> keyList = new HashMap<String, Key>();
	
	//Getters and setters

	public HashMap<String, Key> getKeyList() {
		return keyList;
	}

	public void setKeyList(HashMap<String, Key> keyList) {
		this.keyList = keyList;
	}

	public void addKey(Key key) {
		this.getKeyList().put(key.getKeyID(), key);
	}
	
	public Key findKey(String keyID) {
		return keyList.get(keyID);
	}
	
	public void removeKey(String keyID) {
		keyList.remove(keyID);
	}

	
}
