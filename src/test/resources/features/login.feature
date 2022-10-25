Feature: Pagina login
  Como usuario
  Necesito ingresar a la aplicacion de Space & beyond

  Scenario Outline: Ingresar al sistema a traves de login
    Given el usuario desea entrar a la aplicación
    When ingrese a la aplicacion con un username <username> y password <password>
    Then el usuario ve el mensaje <message> de bienvenida


    Examples:
      |username    | password       |  message      |
      |manuela     |    manuela123  |HELLO, JOHN    |










