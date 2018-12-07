package br.ucsal.exemplos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.ucsal.model.Automovel;
import br.ucsal.util.JPAUtil;

public class ExcluidorDeAutomovel {
	public static void main(String[] args) {

		// Pegando uma conexão com o banco de dados
		EntityManager em = JPAUtil.getEntityManager();

		// Iniciando a transação - Remoção - Delete
		EntityTransaction tx = em.getTransaction();
		Automovel auto = em.getReference(Automovel.class, 1L);
		tx.begin();
		em.remove(auto);
		tx.commit();
		// Fim da Transação

		// Fechando a Conexão
		em.close();
	}
}
