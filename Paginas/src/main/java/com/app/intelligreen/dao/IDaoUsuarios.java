/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.dao;

import com.app.intelligreen.paginas.entity.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Admin
 */
public interface IDaoUsuarios {
    public List<Usuarios> findAll(EntityManager em);
    public Usuarios findByCorreo(EntityManager em,String correo);
    public void altas(EntityManager em,Usuarios usuario);
}
