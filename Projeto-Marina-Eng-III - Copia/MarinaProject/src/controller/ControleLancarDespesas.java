package controller;

import model.Apartamento;
import model.Despesa;

public class ControleLancarDespesas {

	public void criarDespesa(String ano, String mes, float valor, String emissao, String venc, String pgto) {
		Despesa desp = new Despesa(ano, mes, valor, emissao, venc, pgto);
	}
	
	public void criarApartamento(int qtdQuartos, String numeroAp, String tpOcup) {
		Apartamento ap = new Apartamento(qtdQuartos, tpOcup, tpOcup);
		
		//Add por Lais
		
		addListaApto(Apartamento ap);
		
		
	}
	
	public List addListaApto(Apartamento ap) { //Modificado por Lais, mudei o retorno de void para List
	
		ap.addList(); //Confirmar nome certinho da lista
		return List;
	}
	
	public void consultarApartamento() {
		
	}
	
}
