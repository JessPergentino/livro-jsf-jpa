package br.ucsal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.ucsal.model.Automovel;
import br.ucsal.util.JPAUtil;

public class PersistidorDeAutomovel {

	public static void main(String[] args) {
		
		// Pegando uma conexão com o banco de dados
		EntityManager em = JPAUtil.getEntityManager();

		//Criando o Objeto a ser persistido
		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2018);
		auto.setModelo("Spin");
		auto.setAnoModelo(2018);
		auto.setMarca("Chevrolet");
		auto.setObservacoes("Nunca foi batido");
		
		//Iniciando a transação
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		// Fim da Transação
		
		//Fechando a Conexão
		em.close();
	}

}
