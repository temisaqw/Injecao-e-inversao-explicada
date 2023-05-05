package inversao_e_injecao.service;

import inversao_e_injecao.interfaces.ImpostosService;

public class CalculadoraService {

	//private ImpostosService impostosService = new SPImpostosService(); //Forma tradicional. Classe CalculadoraService controla suas implementações.
	
	//A linha comentada é substituida a partir daqui.
	private ImpostosService impostosService; 
	
	public CalculadoraService(ImpostosService impostosService) {
		this.impostosService = impostosService; //O construtor vai implementar na CalculadoraService seja lá o que for enviado pela classe gerenciadora. 
		//Não depende mais da classe CalculadoraService controlar isso. O controle foi invertido.
	}
	//A linha comentada termina de ser substituida aqui
	
	public double calcularImpostos(double quantia) {
		quantia = quantia - impostosService.calcularImposto(quantia);
		return quantia * 0.2;
	}
}
