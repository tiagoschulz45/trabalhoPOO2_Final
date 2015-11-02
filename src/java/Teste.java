
import dataservices.dao.JPAUtil;
import dataservices.dao.SerieDAO;
import dataservices.dao.SerieDAOJPA;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import model.Genero;
import model.Serie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
public class Teste {
        public static void main(String[] args) {
            
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        Serie s = new Serie("dr house",Genero.DRAMA,1,"Boa pacas",6);
        
        
        SerieDAOJPA dao = new SerieDAOJPA();
        dao.save(s);
        
        System.out.println("testando");
        
    }
}
