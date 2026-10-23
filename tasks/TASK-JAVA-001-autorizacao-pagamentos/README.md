# TASK-JAVA-001 — Sistema de autorização de pagamentos

**Estado:** ✅ Aprovada  
**Nível:** Iniciante  
**Conceitos:** variáveis, `int`, `boolean`, comparações e `if / else if / else`.

## Contexto

Uma fintech precisa de decidir se um pagamento pode ser autorizado. O programa recebe um saldo, o valor de pagamento, um indicador de conta bloqueada e um limite diário. Apenas **uma mensagem** deve ser apresentada por execução.

## Dados de entrada

| Variável | Tipo | Exemplo |
| --- | --- | ---: |
| `saldo` | `int` | 500 |
| `valorPagamento` | `int` | 150 |
| `contaBloqueada` | `boolean` | false |
| `limiteDiario` | `int` | 300 |

## Regras de negócio (por prioridade)

1. Valor de pagamento menor ou igual a zero → `VALOR INVALIDO`.
2. Conta bloqueada → `CONTA BLOQUEADA`.
3. Pagamento superior ao saldo → `SALDO INSUFICIENTE`.
4. Pagamento superior ao limite diário → `LIMITE EXCEDIDO`.
5. Caso contrário → `PAGAMENTO AUTORIZADO`.

## Casos de aceitação

| Saldo | Pagamento | Bloqueada | Limite | Esperado |
| ---: | ---: | :---: | ---: | --- |
| 500 | 150 | false | 300 | `PAGAMENTO AUTORIZADO` |
| 100 | 150 | false | 300 | `SALDO INSUFICIENTE` |
| 500 | 150 | true | 300 | `CONTA BLOQUEADA` |
| 500 | 0 | false | 300 | `VALOR INVALIDO` |
| 500 | 350 | false | 300 | `LIMITE EXCEDIDO` |
| 100 | 150 | true | 300 | `CONTA BLOQUEADA` |

## A minha implementação

Consultar [`Main.java`](Main.java). Para testar outros casos, alterar os valores no início do método `main` e executar `javac Main.java` e `java Main`.

## O que aprendi

- Uma cadeia de `if / else if / else` respeita a prioridade e executa apenas o primeiro ramo verdadeiro.
- `if` independentes podem executar vários blocos na mesma passagem.
- Mensagens de saída fazem parte do contrato: pontuação e espaços também importam.

## Resultado da revisão

Aprovada após corrigir o formato das mensagens, validar os cenários e explicar a diferença entre `if` independentes e `if / else if`.
