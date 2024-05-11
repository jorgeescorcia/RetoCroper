# language: es

  Característica: Proceso de Inicio de Sesion en DXHotel

    Escenario:  Login Exitoso en DXHotels
      Dado que el usuario se encuentra en la pagina de inicio de sesion
      Cuando el usuario ingresa un nombre de usuario y una contrasena validos
      Entonces el usuario debe tener acceso a la pagina de inicio
      Y si el usuario ingresa los datos incorrectos
      Entonces no debe ingresar a la web



