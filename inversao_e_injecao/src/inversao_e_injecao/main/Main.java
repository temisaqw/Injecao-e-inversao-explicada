package inversao_e_injecao.main;

import inversao_e_injecao.service.*;

public class Main {

	public static void main(String[] args) {
		
	//	CalculadoraService calculadoraService = new CalculadoraService(); //Forma tradicional. Classe CalculadoraService implementa o que precisa lá.
		
		CalculadoraService calculadoraService = new CalculadoraService(new RJImpostosService()); //Codigo que substitui a linha comentada.Se voce trocar RJImpostosService por SPImpostosService, o programa roda sem problemas e a soma é alterada.
		//main se tornou uma classe gerenciadora das dependencias.  
		//Imagine que quando você precisar mudar uma classe antiga por uma nova, ao inves de ter que procurar por todo o código
		//onde deve substitui-la, ter apenas uma classe gerenciando todas as dependencias.
		
		double salario = 1000;
		double impostos = calculadoraService.calcularImpostos(salario);
		
		System.out.println("impostos: " + impostos);
	}

}
