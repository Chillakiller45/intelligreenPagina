/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.servicios;

import com.app.intelligreen.ejb.EjbUsuarios;
import com.app.intelligreen.paginas.entity.Usuarios;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("servicioUsuario")
public class UsuariosResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuariosResource
     */
    public UsuariosResource() {
    }

    /**
     * Retrieves representation of an instance of com.app.intelligreen.servicios.UsuariosResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        //TODO return proper representation object
        EjbUsuarios ejbUsuarios = new EjbUsuarios();
        List<Usuarios> usuarios = ejbUsuarios.findAll();
        String json = new Gson().toJson(usuarios);
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }
    
    @GET
    @Path("findByCorreo")
    @Produces(MediaType.APPLICATION_JSON)
    @QueryParam("correo")
    public Response findByCorreo(@QueryParam("correo")String correo){
        //TODO return proper representation object
        EjbUsuarios ejbUsuarios = new EjbUsuarios();
        Usuarios usuarios = ejbUsuarios.findByCorreo(correo);
        String json = new Gson().toJson(usuarios);
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }
    
    
    
    /**
     * PUT method for updating or creating an instance of UsuariosResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
