package inversao_e_injecao.service;

import inversao_e_injecao.interfaces.ImpostosService;

public class RJImpostosService implements ImpostosService{

	double taxaEstadual = 0.1;
	
	@Override
	public double calcularImposto(double quantia) {
		return quantia * taxaEstadual;
	}

}
