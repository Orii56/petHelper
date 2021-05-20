function select(option) {


    let x = document.getElementById('rCol');

    switch (option) {
        case 'mascota':
            x.innerHTML =
                "<nav aria-label='breadcrumb'><ol class='breadcrumb'><li class='breadcrumb-item'>" + //breadcrumb
                "<a href='#'>Home</a></li><li class='breadcrumb-item active' aria-current='page'>Mascotas</li></ol></nav>" + //breadcrumb




                "<div class='subMenuButton row align-items-center'><img class='buttonIcon' src='img/dog.png'>" +
                "<div class='buttonText'><h4>Maya</h4></div></div>" +
                "<div class='subMenuButton row align-items-center'><img class='buttonIcon' src='img/cat.png'>" +
                "<div class='buttonText'><h4>Kira</h4></div></div>" +
                "<button type='button' class='btn pmd-btn-fab btn-success btn-floating'><i class='fa fa-plus fa-lg'></i></button>";

            break;

        case 'lugares':
            x.innerHTML =
                "<nav aria-label='breadcrumb'><ol class='breadcrumb'><li class='breadcrumb-item'><a href='#'>Home</a></li>" +
                "<li class='breadcrumb-item active' aria-current='page'>Lugares de Interes</li></ol></nav>" +
                "<iframe src='https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d48599.583888185!2d-3.722380445144422!3d40.42050210149158!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x7ad28996a635b60d!2sEl%20Perro%20y%20La%20Galleta%20Retiro!5e0!3m2!1ses-419!2ses!4v1619712787230!5m2!1ses-419!2ses' width='450' height='320' style='border:0;' allowfullscreen='' loading='lazy'></iframe>" +
                "<br><h4 class='text-center'>CP 28009</h4>"


            break;

        case 'ajustes':
            x.innerHTML =
                "<nav aria-label='breadcrumb'><ol class='breadcrumb'><li class='breadcrumb-item'><a href='#'>Home</a></li><li class='breadcrumb-item active' aria-current='page'>Ajustes</li>" +
                "</ol></nav><form><div class='form-group'><label for='formPassword'>Nueva Contraseña</label>" +
                "<input type='password' class='form-control' id='formPassword' placeholder='Contraseña'></div><div class='form-group'>" +
                "<label for='formPasswordR'>Repetir Contraseña</label> <input type='password' class='form-control' id='formPasswordR' placeholder='Contraseña'>" +
                "</div><div class='form-group'><label for='formEmail'>Cambiar Correo electronico</label><input type='email' class='form-control' id='formEmail' placeholder='email@email.com'>" +
                "</div><div class='form-group'><label for='formAddress'>Direccion</label> <input type='email' class='form-control' id='formAddress' placeholder='Nombre'></div>" +
                "<div class='form-group'><label for='formPC'>Codigo Postal</label> <input type='email' class='form-control' id='formPC' placeholder='CP'></div>" +
                "<div class='form-group'><label for='formCity'>Ciudad</label> <input type='email' class='form-control' id='formCity' placeholder='Ciudad'></div>" +
                "<div class='form-group'><label for='formCountry'>Pais</label><input type='email' class='form-control' id='formCountry' placeholder='Pais'></div>" +
                "<button type='submit' class='btn btn-success btn-block'>Submit</button></form>";

            break;
    }
}