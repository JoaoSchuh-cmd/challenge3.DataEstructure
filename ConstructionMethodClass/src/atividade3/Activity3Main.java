package atividade3;

public class Activity3Main {
	public static void main(String[] args) {
		Person mathew = new Person();
		Person pedro = new Person();
		
		mathew.name = "Mathew";
		mathew.totalValue = 110.0;
		
		pedro.name = "Pedro";
		pedro.totalValue = 100.0;
		
		CurrentAccount operation = new CurrentAccount();
		
		operation.setCurrentMonth(1);
		operation.withdraw(mathew, 10.0);
		operation.deposite(pedro, 900.0);
		operation.transfer(mathew, pedro, 50.0);
		System.out.println(operation.getMonthExtract(mathew, 1));
		System.out.println(operation.getMonthExtract(pedro, 1));
		
		operation.setCurrentMonth(2);
		operation.deposite(pedro, 3000.0);
		operation.deposite(mathew, 2500.0);
		operation.transfer(mathew, pedro, 500.0);
		operation.withdraw(mathew, 500);
		System.out.println(operation.getMonthExtract(mathew, 2));
		System.out.println(operation.getMonthExtract(pedro, 2));
		
		
		
	}
}
