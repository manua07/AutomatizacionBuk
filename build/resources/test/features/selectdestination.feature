Feature: Pagina seleccionar destino
  Como usuario
  Necesito seleccionar el proximo destino


  Scenario Outline: Seleccionar proximo destino correctamente
    Given que el usuario desea seleccionar proximo destino
    When ingrese a la aplicacion con un username <username> y password <password>
    And seleccione un destination
    And busque un launch madan y planet color
    Then usuario debe ver lauch buscado <launch>

    Examples:
      |  username        | password    |launch        |
      |manuela           | manuela123  |Madan         |

  Scenario Outline: Seleccionar proximo destino correctamente
    Given que el usuario desea seleccionar proximo destino
    When ingrese a la aplicacion con un username <username> y password <password>
    And seleccione un destination
    And busque un launch Shenji y planet color
    Then usuario debe ver lauch buscado <launch>

    Examples:
      |  username        | password    |launch        |
      |manuela           | manuela123  |Shenji        |