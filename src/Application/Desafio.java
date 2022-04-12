package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.PeopleData;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		PeopleData[] individuo = new PeopleData[12];
		String nome = "";
		String profissao = "";
		char opc;
		System.out.println("Bem-vindo ao sistema de cadastro.");
		while(true) {
			System.out.println("Selecione uma op��o:");
			System.out.println();
			System.out.println("C - cadastrar um novo usu�rio\n");
			System.out.println("I - mostrar informa��es");
			System.out.println("S - sair");
			opc = leia.next().charAt(0);
			switch(opc) {
			case 'c':
				System.out.println("Digite o nome do individuo:");
				leia.nextLine();
				nome = leia.nextLine();
				
				System.out.println("Digite a profissao:");
		profissao = leia.nextLine();
				for(int i = 0; i <= 11; i++) {
					System.out.println("Digite o " +(i+1)+"� sal�rio:");
					double salario = leia.nextDouble();
					individuo[i] = new PeopleData(salario);
				}
					break;
			case 'i':
				System.out.println("Apresentando as informa��es:");
				System.out.println();
				System.out.println("Nome: " +nome);
				System.out.println();
				System.out.println("Profissao: " +profissao);
		for(int i = 0; i <= 11; i++) {
			System.out.println();
					System.out.println("Sal�rio: " +String.format("%.2f", individuo[i].getSalario()));
					System.out.println("");
					System.out.println("Imposto: " +String.format("%.2f", individuo[i].calculaImposto()));
					System.out.println("Total sal�rio do m�s: " +String.format("%.2f", individuo[i].totalSalario()));
				}
			break;
			case 's':
				System.out.println("Obrigada, tchau!");
				System.exit(0);
				break;
			default:
				System.out.println("Op��o inv�lida.");
				break;
			}
		}
	}
}
