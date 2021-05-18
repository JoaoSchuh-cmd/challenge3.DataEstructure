package atividade1;

public class Activity1Main {
	
	public static void main(String[] args) {
		Person harry = new Person("Harry", "811.213.825-58", 1965);
		
		Person garry = new Person("Garry", 1956);
		
		Person leila = new Person("Leila", "811.123.285-34", "10.234.182-01", 1989);
		Person person = leila.addAndReturnPrintToConsole(leila);
	}
}
