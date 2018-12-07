package br.ucsal.exemplos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.ucsal.model.Automovel;
import br.ucsal.util.JPAUtil;

public class ExcluidorDeAutomovel {
	public static void main(String[] args) {

		// Pegando uma conex�o com o banco de dados
		EntityManager em = JPAUtil.getEntityManager();

		// Iniciando a transa��o - Remo��o - Delete
		EntityTransaction tx = em.getTransaction();
		Automovel auto = em.getReference(Automovel.class, 1L);
		tx.begin();
		em.remove(auto);
		tx.commit();
		// Fim da Transa��o

		// Fechando a Conex�o
		em.close();
	}
}
