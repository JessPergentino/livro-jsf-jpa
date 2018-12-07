package br.ucsal.exemplos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.ucsal.model.Automovel;
import br.ucsal.util.JPAUtil;

public class BuscadorDeAutomovel {
	public static void main(String[] args) {

		// Pegando uma conexão com o banco de dados
		EntityManager em = JPAUtil.getEntityManager();
	
		// Iniciando a transação - Busca - Select
		Query q = em.createQuery("select a from Automovel a", Automovel.class);
		List<Automovel> autos = q.getResultList();
		// Fim da Transação

		// Fechando a Conexão
		em.close();
		
		//Mostrando o Resultado da Consulta
		for (Automovel automovel : autos) {
			System.out.println(automovel.getModelo());
		}
	}
}
