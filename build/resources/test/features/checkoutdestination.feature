Feature: Pagina para realizar checkout del destino
  Como usuario
  Necesito realizar el checkout del destino seleccionado

  Scenario Outline: Realizar checkout del destino correctamente
    Given que el usuario desea realizar el checkout de su destino
    When ingrese a la aplicacion con un username <username> y password <password>
    And seleccione un destination
    And busque un launch madan y planet color
    And ingrese la informacion de name <name> email address <emailAddress> social security number <securityNumber> phone number <phoneNumber> y promo code <promoCode>
    Then usuario debe ver el total <total> confirmando la orden

    Examples:
      | username      | password    | name             | emailAddress       |   securityNumber | phoneNumber | promoCode     | total      |
      |manuelaa       | manuela12   |Manuela Acevedo   | manua07@gmail.com  |  234-23-2323     | 3122455643  | Manuela       | $2,028.79  |
      |manuelaacevedo | manuelaa1   |Manuela Acevedo   | manuela@gmail.com  |  987-12-8762     | 3122009643  | Manuela12     | $2,103.93  |


  Scenario Outline: Realizar checkout del destino correctamente
    Given que el usuario desea realizar el checkout de su destino
    When ingrese a la aplicacion con un username <username> y password <password>
    And seleccione un destination
    And busque un launch Shenji y planet color
    And ingrese la informacion de name <name> email address <emailAddress> social security number <securityNumber> phone number <phoneNumber> y promo code <promoCode>
    Then usuario debe ver el total <total> confirmando la orden

    Examples:
      | username     | password    | name             | emailAddress         |   securityNumber | phoneNumber | promoCode     | total      |
      |andrea        | andream     |Andrea Muñoz      | andrea123@gmail.com  |  098-32-1234     | 3127665677  | Andreades     | $1,936.12  |
