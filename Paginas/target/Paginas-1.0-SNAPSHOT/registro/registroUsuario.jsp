<%-- 
    Document   : registroUsuario
    Created on : 9/05/2018, 09:09:24 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="resources/css/materialize.css"/>
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/js/materialize.min.js"></script>
        <script>
            function validar(){
                
                if(textNombreUsuario.value === ''){
                    M.toast({html: 'Debes ingresar tu Nombre'},500);
                    textNombreUsuario.focus();
                    return false;
                }
                if(textCorreoElectronico.value === ''){
                    M.toast({html: 'Debes ingresar tu correo electrónico'},500);
                    textCorreoElectronico.focus();
                    return false;
                }
                if(textClave.value === ''){
                    M.toast({html: 'Debes ingresar tu clave'},500);
                    textClave.focus();
                    return false;
                }
                if(textClaveR.value !== textClave.value){
                    M.toast({html: 'Las claves deben de coincidir'},500);
                    textClaveR.focus();
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <%@include file="../templates/header.jsp" %>
        <h2 class="center">Registrar Usuario</h2>
        <div class="container">
            <form action="ServletRegistrarUsuario" onsubmit="return validar()" method="POST">
                <div class="row">
                    <div class="col s12 m6 input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input name="textNombreUsuario" id="textNombreUsuario" type="text" class="autocomplete">
                        <label for="textNombreUsuario" class="flow-text">Nombre Completo</label>
                    </div>
                    <div class="col s12 m6 input-field">
                        <i class="material-icons prefix">email</i>
                        <input name="textCorreoElectronico" id="textCorreoElectronico" type="email" class="validate autocomplete">
                        <label for="textCorreoElectronico" class="flow-text">Correo Electrónico</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12 m6 input-field">
                        <i class="material-icons prefix">lock</i>
                        <input name="textClave" id="textClave" type="password" class="autocomplete">
                        <label for="textClave" class="flow-text">Clave</label>
                    </div>
                    <div class="col s12 m6 input-field">
                        <i class="material-icons prefix">lock</i>
                        <input name="textClaveR" id="textClaveR" type="password" class="autocomplete">
                        <label for="textClaveR" class="flow-text">Confirmar Clave</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12 center-align">
                        <button type="submit" class="btn btn-large waves-green green darken-2">Registar Usuario</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
