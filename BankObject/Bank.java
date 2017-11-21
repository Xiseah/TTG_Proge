package newPackage;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<BankAccount> theLipstickList = new ArrayList<BankAccount>();
	
	public void addAccount(BankAccount ba) {
		theLipstickList.add(ba);
	}
	
	public boolean searchForAccount(String name) {
		for (BankAccount ba : theLipstickList) {
			if (ba.getName().toLowerCase() == name) {
				return true;
			}
		}
		return false;
	}

}
