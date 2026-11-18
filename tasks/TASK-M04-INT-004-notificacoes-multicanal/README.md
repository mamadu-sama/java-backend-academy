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
| Email e SMS na lista | A mesma mensagem aparece nos dois canais | Pendente |
| Apenas um canal na lista | A mensagem aparece uma vez | Pendente |
| Lista vazia | Comportamento definido e documentado | Pendente |
| Dependência nula | Comportamento definido e documentado | Pendente |

## O que aprendi

A preencher depois de implementar e rever a tarefa.
