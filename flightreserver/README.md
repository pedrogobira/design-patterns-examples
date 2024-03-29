# Interpreter e Mediator em um cenário fictício de reserva de voos

## Contextualização

O presente trabalho tem como objetivo apresentar o aprendizado e aplicação dos padrões de projeto Mediator e Interpreter em um contexto fictício de um sistema de reservas de voos. O problema real que serviu de inspiração para este estudo é a necessidade de desenvolver um sistema eficiente para coordenação e interpretação de consultas em um cenário de reservas de voos em uma agência de turismo. A ideia do sistema de reservas de voos surgiu considerando o cenário atual do setor de turismo e viagens, onde plataformas como 123Milhas e Decolar.com oferecem serviços de reservas online que simplificam a busca e aquisição de passagens aéreas.

Neste trabalho, utilizaremos o contexto do sistema de reservas de voos como um plano de fundo para explorar os padrões de projeto comportamentais Mediator e Interpreter.

O padrão Mediator será aplicado para lidar com a coordenação entre diferentes componentes do sistema de reservas de voos. A classe Mediator atuará como um intermediário, facilitando a comunicação e o gerenciamento das interações entre os diversos objetos envolvidos. Essa abordagem permitirá uma melhor organização e manutenção do sistema, além de promover o baixo acoplamento entre os componentes e um melhor gerenciamento de dependências.

Já o padrão Interpreter será utilizado para interpretar consultas realizadas pelos usuários do sistema. O objetivo é criar uma estrutura que seja capaz de analisar e processar consultas em linguagem natural, transcrevendo as mesmas para ações no sistema, tomando como inspiração as inteligências artificias conversacionais.

Neste trabalho, apresentamos o modelo UML que representa a estrutura de classes do exemplo em questão, destacando as relações entre os componentes e a aplicação dos padrões Mediator e Interpreter. Além disso, fornecemos uma solução implementada em Java.

## Diagrama UML de classes

No modelo UML apresentado, inicialmente temos três classes: `QueryInterpreter`, `AvailabilityInterpreter` e `ReservationInterpreter`. A classe `QueryInterpreter` possui um método `interpret(query: String)` que é implementado pelas subclasses `AvailabilityInterpreter` e `ReservationInterpreter`. Essas subclasses possuem uma associação (agregação) com a classe `FlightMediator` através do atributo `mediator`.

A classe `FlightMediator` é responsável por coordenar a interação entre os intérpretes e os voos. Ela mantém uma lista de voos disponíveis no atributo `flights` e fornece os métodos `registerFlight(flight: Flight)`, `getAvailability()` e `makeReservation(flightNumber: long)` para registrar voos, verificar a disponibilidade e fazer reservas de assentos, respectivamente.

A classe `Flight` representa um voo específico e contém o atributo `flightNumber` para identificá-lo. Ela fornece os métodos `getAvailability()`, `reserveSeat()` e `getFlightNumber()` para verificar a disponibilidade, fazer reservas de assentos do voo e recuperar o número do voo, respectivamente.
