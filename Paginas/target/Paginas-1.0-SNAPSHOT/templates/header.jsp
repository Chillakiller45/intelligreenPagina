<header>
    <nav>
        <div class="nav-wrapper green darken-2">
            <a href="#" data-target="sidebarnav" class="left sidenav-trigger"><i class="material-icons">menu</i></a>
            <a href="#" class=" brand-logo"><img class="responsive-img" alt="Logo" /></a>
            <ul class="right hide-on-med-and-down">
                <li><a href="ServletIndex" class="flow-text">Inicio</a></li>
                <li><a href="" class="flow-text">Productos</a></li>
                <li><a href="" class="flow-text">Contacto</a></li>
                <li><a href="ServletInicioSesion" class="flow-text">Iniciar Sesión</a></li>
            </ul>
        </div>
    </nav>
    
    <ul class="sidenav" id="sidebarnav">
        <li><a href="ServletIndex" class="flow-text"><h5>Inicio</h5></a></li>
        <li><a href="#" class="flow-text"><h5>Productos</h5></a></li>
        <li><a href="#" class="flow-text"><h5>Contacto</h5></a></li>
        <li><a href="ServletInicioSesion" class="flow-text"><h5>Iniciar Sesión</h5></a></li>    
    </ul>
</header>
<script>
    $(document).ready(function(){
        $('.sidenav').sidenav();
    });
</script>