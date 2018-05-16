/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.ejb;

import com.app.intelligreen.dao.DaoUsuarios;
import com.app.intelligreen.paginas.entity.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 */
public class EjbUsuarios {
    EntityManagerFactory emf;
    EntityManager em;
    EntityTransaction et;
    
    public List<Usuarios> findAll(){
        emf = Persistence.createEntityManagerFactory("IntelligreenPU");
        em = emf.createEntityManager();
        List<Usuarios> listaUsuarios = null;
        try{
            DaoUsuarios daoUsuarios = new DaoUsuarios();
            listaUsuarios = daoUsuarios.findAll(em);
        }catch(Exception ex){
            System.out.println("Error " + ex);
            ex.printStackTrace();
        }finally{
            em.close();
            em = null;
            emf.close();
            emf = null;
        }
        return listaUsuarios;
    }
    public Usuarios findByCorreo(String correo){
        emf = Persistence.createEntityManagerFactory("IntelligreenPU");
        em = emf.createEntityManager();
        Usuarios usuario = null;
        try{
            DaoUsuarios daoUsuarios = new DaoUsuarios();
            usuario = daoUsuarios.findByCorreo(em,correo);
        }catch(Exception ex){
            System.out.println("Error " + ex);
            ex.printStackTrace();
        }finally{
            em.close();
            em = null;
            emf.close();
            emf = null;
        }
        return usuario;
    }
    public void altas(Usuarios usuario){
        emf = Persistence.createEntityManagerFactory("IntelligreenPU");
        em = emf.createEntityManager();
        et = em.getTransaction();
        try{
            DaoUsuarios daoUsuarios = new DaoUsuarios();
            et.begin();
            daoUsuarios.altas(em,usuario);
            et.commit();
        }catch(Exception ex){
            System.out.println("Error " + ex);
            ex.printStackTrace();
        }finally{
            et = null;
            em.close();
            em = null;
            emf.close();
            emf = null;
        }
    }
}
