package atividade1;

import java.util.Scanner;

public class Person extends Object {
	String name;
	String cpf;
	String rg;
	int age;
	int year;
	Scanner anw = new Scanner(System.in);
	
	@Override
    public String toString() {
        return "Nome: " + name + "\n" + "cpf: " + cpf + "\n" + "Ano: " + year + "\n" + "Idade: " + age;
    }
	
	Person(String name, String cpf, int year) {
		this.year = year;
		this.cpf = cpf;
		this.name = name;
		calculateAge();
		
		System.out.println(toString());
		System.out.println();
	}
	
	Person(String name, int year) {
		cpf = "123.129.293-23";
		this.name = name;
		this.year = year;
		calculateAge();
		
		System.out.println(toString());
		System.out.println();
	}
	
	Person(String name, String cpf, String rg, int year) {
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.year = year;
		calculateAge();
	}
	
	void addPersonToConsole(Person person) {
		System.out.print(person);
	}
	
	Person addAndReturnPrintToConsole(Person person) {
		addPersonToConsole(person);
		return person;
	}
	
	
	int calculateAge() {
		age = 2021 - year;
		return age;
	}
}
