package inversao_e_injecao.service;

import inversao_e_injecao.interfaces.ImpostosService;

public class SPImpostosService implements ImpostosService{

	double taxaEstadual = 0.12;
	
	@Override
	public double calcularImposto(double quantia) {
		return quantia * taxaEstadual;
	}

}
