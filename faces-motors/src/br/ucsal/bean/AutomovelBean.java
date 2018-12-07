package br.ucsal.bean;

import javax.faces.bean.ManagedBean;

import br.ucsal.model.Automovel;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	
	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public void salva(Automovel automovel) {
		
	}
}
