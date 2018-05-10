<%-- 
    Document   : inicioSesion
    Created on : 24/04/2018, 09:24:13 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesión</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="resources/css/materialize.css"/>
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/js/materialize.js"></script>
    </head>
    <body>
        <%@include file="../templates/header.jsp" %>
        <h2 class="center">Inicio de Sesión</h2>
        <div class="container">
            <form action="ServletInicioSesion" method="POST">
                <div class="row">
                    <div class="col s12">
                        <div class="input-field col s12">
                            <i class="material-icons prefix">account_circle</i>
                            <input name="textNombreUsuario" id="textNombreUsuario" type="text" class="autocomplete">
                            <label for="textNombreUsuario">Nombre de Usuario:</label>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <div class="input-field col s12">
                            <i class="material-icons prefix">lock</i>
                            <input class="validate" name="textClaveUsuario" id="textClaveUsuario" type="password">
                            <label for="textClaveUsuario">Clave de Usuario:</label>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <div class="input-field col s12 center-align">
                            <button class="waves-effect waves-green btn btn-large green darken-2" type="submit">Iniciar Sesión</button>
                        </div>
                    </div>
                    <div class="col s12 center">
                        <br>
                        <a href="ServletRegistrarUsuario" class="center-align">¿No tienes una cuenta? Crea una!!!</a>
                    </div>
                </div>
            </form>
            <div class="container">
                
            </div>
            
        </div>
    </body>
</html>
