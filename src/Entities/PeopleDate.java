package Entities;

public class PeopleData {
	private double salario;
	private double imposto;

	public PeopleData(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaImposto() {
		if(salario >= 2001 && salario <= 3000)
			return(salario*8)/100;
		if(salario >= 3001 && salario <= 4500)
			return (salario*18)/100;
		if(salario >4500)
			return (salario*28)/100;
		return 0;
	}

	public double totalSalario() {
		return getSalario() - calculaImposto();
	}
}
