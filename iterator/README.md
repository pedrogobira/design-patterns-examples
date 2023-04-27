# Iterator

## Problema

Esconder a complexidade de uma coleção constituída por uma estrutura de dados complexas do cliente, permitindo que o mesmo acesse os elementos.

## Solução

Declarar uma interface para uma coleção e para um iterator. A coleção instanciará um iterator padrão para a mesma, mas isso não impede de que o cliente use um iterator especifico, porque o mesmo contém uma referência para a coleção em si, podendo iterar sobre a mesma sem a intervação de escolha da coleção. A implementação do iterator detém a lógica de busca e navegação na estrutura, podendo definir algum algoritmo específico de busca, como na iteração sobre produtos cadastrados em estoque representados por uma lista que pode retornar objetos na ordem de inserção ou não.

## Consequências

Princípio da responsabilidade única, porque separa a coleção dos algortimos de busca. Princípio aberto/fechado, porque permite a extensibilidade por meio de implementação das interfaces em vez da modificação das classes já existentes. Pode causar problemas de eficiência caso o cliente iterasse diretamente sobre a coleção.

## Diagrama

O diagrama de classes UML pode ser encontrado no repositório com o nome `diagrama.pdf`.

## Implementação

A implementação pode ser vistoriada neste repositório.
