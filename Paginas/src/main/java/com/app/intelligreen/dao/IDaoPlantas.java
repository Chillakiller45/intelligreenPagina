/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.dao;

import com.app.intelligreen.paginas.entity.Planta;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Admin
 */
public interface IDaoPlantas {
    public List<Planta> findAll(EntityManager em);
}
