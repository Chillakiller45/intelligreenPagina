/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.ejb;

import com.app.intelligreen.dao.DaoPlantas;
import com.app.intelligreen.paginas.entity.Planta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 */
public class EjbPlanta {
    EntityManagerFactory emf;
    EntityManager em;
    EntityTransaction et;
    
    public List<Planta> findAll(){
        emf = Persistence.createEntityManagerFactory("IntelligreenPU");
        em = emf.createEntityManager();
        List<Planta> listaPlantas = null;
        try{
            DaoPlantas daoPlantas = new DaoPlantas();
            listaPlantas = daoPlantas.findAll(em);
        }catch(Exception ex){
            System.out.println("Error " + ex);
            ex.printStackTrace();
        }finally{
            em.close();
            em = null;
            emf.close();
            emf = null;
        }
        return listaPlantas;
    }
}
