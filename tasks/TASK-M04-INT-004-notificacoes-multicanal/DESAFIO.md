# TASK-M04-INT-004: Notificações multicanal

## Contexto

O serviço bancário já consegue enviar uma mensagem através de um objeto que implementa a interface `Notificador`. Neste desafio, o banco quer enviar o mesmo aviso por email e SMS com uma única chamada a `avisarCliente()`.

O envio continua a ser simulado no terminal. Não é preciso integrar serviços externos.

## Objetivo

Criar `NotificadorMultiplo`, uma implementação de `Notificador` que recebe vários notificadores e encaminha a mensagem para cada um.

O desafio é fazer isso sem alterar a interface `Notificador` nem a classe `ServicoBancario`.

## Requisitos

1. Manter a interface `Notificador` com o método `enviar(String mensagem)`.
2. Manter duas implementações: `NotificadorEmail` e `NotificadorSms`.
3. Criar uma classe `NotificadorMultiplo` que implemente `Notificador`.
4. Guardar os canais num atributo privado do tipo `List<Notificador>`.
5. Receber essa lista pelo construtor.
6. Implementar `enviar(String mensagem)` de modo a percorrer a lista e chamar `enviar()` em cada notificador.
7. No `main()`, criar uma lista com um notificador de email e outro de SMS.
8. Criar um `NotificadorMultiplo` com essa lista e fornecê-lo ao construtor de `ServicoBancario`.
9. Chamar `avisarCliente()` uma única vez. Os dois canais devem apresentar a mensagem.

## Restrições

- Usar Java puro. Não é necessário Spring Boot, Maven, base de dados ou bibliotecas externas.
- Não modificar o contrato `Notificador` nem a implementação de `ServicoBancario` que já desenvolveste.
- O código de `ServicoBancario` não deve conhecer `NotificadorEmail`, `NotificadorSms` ou `NotificadorMultiplo` como tipos concretos.
- Não usar condições para identificar o tipo do notificador.

## Verificações antes de concluir

- A mesma mensagem aparece nos dois canais depois de uma única chamada ao serviço.
- Cada canal mantém o prefixo esperado, `EMAIL:` ou `SMS:`.
- O envio respeita a ordem dos canais na lista.
- Pensa no comportamento de uma lista vazia e de uma dependência `null`. Decide como tratar estes casos e explica a decisão no README.
- Confirma que o programa compila e executa.

## Para pensares durante a implementação

- Porque é que `NotificadorMultiplo` pode implementar `Notificador` e, ao mesmo tempo, guardar uma lista de `Notificador`?
- O que aconteceria se a lista recebida no construtor fosse modificada por outra parte do programa depois de o objeto ser criado?
- Como poderias acrescentar um terceiro canal sem modificar `ServicoBancario`?

Estas perguntas são para a revisão. Não precisas de antecipar funcionalidades que não foram pedidas.

## Entrega

Coloca os ficheiros Java nesta pasta, ao lado do `README.md` e deste enunciado. Depois de testares, atualiza o README com os resultados observados e as dificuldades que encontraste.

Não há código de solução neste enunciado. A implementação é tua.
