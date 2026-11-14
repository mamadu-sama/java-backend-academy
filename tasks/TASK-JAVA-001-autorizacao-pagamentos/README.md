# TASK-JAVA-001 — Autorização de pagamentos

**Estado:** concluída e revista  
**Conteúdos:** variáveis, `int`, `boolean`, comparações e `if / else if / else`.

## Problema

Uma fintech precisa de decidir se um pagamento pode ser autorizado. O programa considera saldo, valor do pagamento, conta bloqueada e limite diário. Em cada execução deve ser apresentada apenas uma mensagem.

## Regras por ordem de prioridade

1. Pagamento menor ou igual a zero: `VALOR INVALIDO`.
2. Conta bloqueada: `CONTA BLOQUEADA`.
3. Pagamento superior ao saldo: `SALDO INSUFICIENTE`.
4. Pagamento superior ao limite diário: `LIMITE EXCEDIDO`.
5. Caso contrário: `PAGAMENTO AUTORIZADO`.

## Casos de referência

| Saldo | Pagamento | Bloqueada | Limite | Esperado |
| ---: | ---: | :---: | ---: | --- |
| 500 | 150 | false | 300 | `PAGAMENTO AUTORIZADO` |
| 100 | 150 | false | 300 | `SALDO INSUFICIENTE` |
| 500 | 150 | true | 300 | `CONTA BLOQUEADA` |
| 500 | 0 | false | 300 | `VALOR INVALIDO` |
| 500 | 350 | false | 300 | `LIMITE EXCEDIDO` |
| 100 | 150 | true | 300 | `CONTA BLOQUEADA` |

## Implementação

Ficheiro: [AutorizacaoPagamento.java](AutorizacaoPagamento.java)

```bash
javac AutorizacaoPagamento.java
java AutorizacaoPagamento
```

Para verificar os cenários, alterar os valores no início do `main` e executar novamente.

## O que aprendi

A ordem das condições define qual regra se aplica primeiro. A cadeia `if / else if / else` permite apresentar apenas a mensagem correspondente ao primeiro caso verdadeiro.

É um exercício de lógica com valores inteiros, não um sistema de pagamentos reais. Não há testes automatizados.
