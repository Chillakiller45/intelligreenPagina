<header>
    <nav>
        <div class="nav-wrapper green darken-2">
            <a href="#" data-target="sidebarnav" class="left sidenav-trigger"><i class="material-icons">menu</i></a>
            <a href="#" class=" brand-logo"><img class="responsive-img" alt="Logo" /></a>
            <ul class="right hide-on-med-and-down">
                <li><a href="ServletIndex">Inicio</a></li>
                <li><a href="">Productos</a></li>
                <li><a href="">Contacto</a></li>
                <li><a href="ServletInicioSesion">Iniciar Sesión</a></li>
            </ul>
        </div>
    </nav>
    
    <ul class="sidenav" id="sidebarnav">
        <li><a href="ServletIndex">Inicio</a></li>
        <li><a href="#">Productos</a></li>
        <li><a href="#">Contacto</a></li>
        <li><a href="ServletInicioSesion">Iniciar Sesión</a></li>    
    </ul>
</header>
<script>
    $(document).ready(function(){
        $('.sidenav').sidenav();
    });
</script>