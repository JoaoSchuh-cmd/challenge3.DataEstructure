package atividade3;

public class CurrentAccount {
	private String accountName;
	private double accountBalance;
	private int currentMonth;
	
	void withdraw(Person p, double value) {
		if (validator(p, value) == 1) {System.out.println("Sorry, but you don't have all this money avaiable to this operation :("); return;}
		p.totalValue -= value;
//		System.out.println(p.name + ", you're withdrawing " + value + "\n");
//		System.out.println("Your Current Balance is: ");
//		System.out.println(p.totalValue -= value);
	}
	
	void deposite(Person p, double value) {
		p.totalValue += value;
//		System.out.println(p.name + ", your account has received the value of " + value + "\n");
//		System.out.println("Your Current Balance is: ");
//		System.out.println(p.totalValue += value);
	}
	
	void transfer(Person originAccount, Person destinationAccount, double value) {
		if (validator(originAccount, value) == 1) {System.out.println("Sorry, but you don't have all this money avaiable to this operation :("); return;}
//		System.out.println(originAccount.name + ", you're transfering the amount of " + value + " to " + destinationAccount.name + "\n");
//		System.out.println("Your Current Balance is: ");
//		System.out.println(originAccount.totalValue -= value);
		originAccount.totalValue -= value;
		destinationAccount.totalValue += value;
//		System.out.println(destinationAccount.name + ", your account has received the value of " + value + " from " + originAccount.name + "\n");
//		System.out.println("Your Current Balance is: ");
//		System.out.println(destinationAccount.totalValue += value);
	}
	
	double getMonthExtract(Person p, int month) {
		return p.totalValue;
	}
	
	int validator(Person p, double value) {
		if (p.totalValue < value) {return 1;} else {return 0;}
	}

	public int getCurrentMonth() {
		return currentMonth;
	}

	public void setCurrentMonth(int currentMonth) {
		this.currentMonth = currentMonth;
	}	
}
