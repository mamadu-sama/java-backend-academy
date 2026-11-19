# TASK-M04-INT-004: Notificações multicanal

**Estado:** Em desenvolvimento  
**Tecnologia:** Java puro  
**Conceitos:** interfaces, polimorfismo, `List<Notificador>`, injeção de dependências por construtor

## O exercício

Um serviço bancário deve conseguir enviar o mesmo aviso por email e SMS sem conhecer os detalhes de cada canal.

O objetivo é criar uma implementação de `Notificador` que reúna outros notificadores e permita enviar a mensagem através de todos eles com uma única chamada.

O [enunciado completo está aqui](DESAFIO.md).

## Ficheiros previstos

- `Notificador.java`
- `NotificadorEmail.java`
- `NotificadorSms.java`
- `NotificadorMultiplo.java`
- `ServicoBancario.java`
- `TesteNotificacoes.java`

Os ficheiros Java ainda vão ser implementados. O envio será simulado no terminal, sem email ou SMS reais.

## Como executar

Depois de implementar os ficheiros, compilar e executar com o JDK instalado. Os comandos exatos e o resultado observado serão registados aqui após os testes.

## Testes manuais

| Cenário | Esperado | Observado |
| --- | --- | --- |
| Email e SMS na lista | A mesma mensagem aparece nos dois canais | Concluído |
| Apenas um canal na lista | A mensagem aparece uma vez | Concluído |
| Lista vazia | Comportamento definido e documentado | Concluído |
| Dependência nula | Comportamento definido e documentado | Concluído |

## O que aprendi

Neste desafio, pratiquei interfaces, polimorfismo, Collections e injeção de dependências por construtor.

No início, tive dificuldades em perceber como ligar a lista de notificadores ao `NotificadorMultiplo` e depois ao `ServicoBancario`.

Durante a implementação, aprendi que:

- `List<Notificador>` permite guardar diferentes objetos que implementam a mesma interface.
- Uma lista de notificadores não é a mesma coisa que um objeto do tipo `Notificador`.
- O `NotificadorMultiplo` pode implementar a interface `Notificador` e utilizar internamente outros notificadores.
- Com o ciclo `for-each`, consigo percorrer a lista e chamar o método `enviar()` de cada objeto.
- O `ServicoBancario` não precisa de conhecer as classes concretas dos notificadores. Basta receber um objeto que implemente a interface.

Depois de corrigir os erros, consegui compilar e executar o programa, enviando a mesma mensagem para os canais Email e SMS através de uma única chamada ao serviço.

Este exercício ajudou-me a compreender melhor como diferentes classes podem trabalhar em conjunto sem depender diretamente umas das outras.
