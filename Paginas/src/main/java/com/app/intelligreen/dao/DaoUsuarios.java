/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.dao;

import com.app.intelligreen.paginas.entity.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Admin
 */
public class DaoUsuarios implements IDaoUsuarios{

    @Override
    public List<Usuarios> findAll(EntityManager em) {
        TypedQuery query = (TypedQuery)em.createNamedQuery("Usuarios.findAll");
        return query.getResultList();
    }

    @Override
    public Usuarios findByCorreo(EntityManager em, String correo) {
        TypedQuery query = (TypedQuery)em.createNamedQuery("Usuarios.findByCorreoMail");
        query.setParameter("correoMail", correo);
        return (Usuarios) query.getSingleResult();
    }

    @Override
    public void altas(EntityManager em, Usuarios usuario) {
        em.persist(usuario);
    }
    
    
    
}
