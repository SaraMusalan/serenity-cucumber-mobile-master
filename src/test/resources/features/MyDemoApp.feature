Feature: Quiero realizar automatizacion en la app My Demo App

    @LoginExitoso
    Scenario: Incio de sesion con credenciales validas

      Given "actor" abre la app My Demo App
      When ingresa con las credenciales "bod@example.com" y "10203040"
      Then inicia sesion exitosamente

      @FlujoCompleto
      Scenario: Flujo completo de compra

        Given "actor" se encuentra logeado en la app My Demo App
        When selecciona productos
        Then finaliza la compra exitosa

