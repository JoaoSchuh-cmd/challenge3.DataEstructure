package atividade3;

public class Person {
	String name;
	String cpf;
	String rg;
	double totalValue;
	
	@Override
	public String toString() {
        return "Nome: " + name + "\n" + "cpf: " + cpf + "\n" + "Total Value: " + totalValue + "\n";
    }
}
