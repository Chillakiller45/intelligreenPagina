/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.intelligreen.servicios;

import com.app.intelligreen.correo.Correo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("servicioCorreo")
public class correoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of correoResource
     */
    public correoResource() {
    }

    /**
     * Retrieves representation of an instance of com.app.intelligreen.servicios.correoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.WILDCARD)
    @Path("mandarCorreo")
    public String mandarCorreo() {
        //TODO return proper representation object
        Correo correo = new Correo();
        correo.mandaMAil("miguelmorgado678@gmail.com", "Chilakiller45", "alsd");
        return "Exito";
    }

    /**
     * PUT method for updating or creating an instance of correoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
