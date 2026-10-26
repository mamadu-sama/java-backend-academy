# TASK-JAVA-003 — Sistema de controlo de acessos

**Estado:**  Aprovada ✅ . 
**Nível:** Iniciante II  
**Tempo sugerido:** 25–30 minutos  
**Conceitos permitidos:** variáveis, `String`, `boolean`, `int`, comparações, `if / else if / else` e condições aninhadas. Os operadores `&&` e `||` são opcionais.

## Cenário

A SecureGate Technologies necessita de decidir se um profissional de segurança privada pode entrar numa instalação de acesso restrito. O sistema considera a hora, a validade do cartão profissional, a formação obrigatória e uma possível autorização especial.

## Dados de entrada

| Variável | Tipo | Valor inicial |
| --- | --- | --- |
| `horaEntrada` | `int` | `22` |
| `cartaoValido` | `boolean` | `true` |
| `formacaoConcluida` | `boolean` | `true` |
| `autorizacaoEspecial` | `boolean` | `false` |
| `nomeProfissional` | `String` | `"Carlos"` |

A hora é um inteiro entre 0 e 23. O nome é informativo e não altera a decisão nem deve aparecer nas mensagens.

## Regras de negócio (por prioridade)

1. Hora inferior a 0 ou superior a 23 → `ERRO: HORA INVALIDA`.
2. Cartão inválido → `ACESSO NEGADO: CARTAO INVALIDO`.
3. Formação pendente → `ACESSO NEGADO: FORMACAO PENDENTE`.
4. A entrada normal é permitida entre **07:00 e 19:00**, inclusive. Fora desse intervalo, sem autorização especial → `ACESSO NEGADO: FORA DO HORARIO`.
5. Se as regras aplicáveis forem cumpridas → `ACESSO AUTORIZADO`.

A autorização especial só permite ultrapassar a restrição de horário; não substitui um cartão válido nem a formação concluída. Apresentar **uma única mensagem** em cada execução.

## Casos de aceitação

| Caso | Hora | Cartão | Formação | Especial | Resultado esperado |
| --- | ---: | :---: | :---: | :---: | --- |
| CT-01 | 10 | true | true | false | `ACESSO AUTORIZADO` |
| CT-02 | 7 | true | true | false | `ACESSO AUTORIZADO` |
| CT-03 | 19 | true | true | false | `ACESSO AUTORIZADO` |
| CT-04 | 22 | true | true | false | `ACESSO NEGADO: FORA DO HORARIO` |
| CT-05 | 22 | true | true | true | `ACESSO AUTORIZADO` |
| CT-06 | 10 | false | true | true | `ACESSO NEGADO: CARTAO INVALIDO` |
| CT-07 | 10 | true | false | true | `ACESSO NEGADO: FORMACAO PENDENTE` |
| CT-08 | 24 | true | true | true | `ERRO: HORA INVALIDA` |

Em todos os casos, `nomeProfissional = "Carlos"`.

## Restrições técnicas

Usar apenas a classe `ProcessamentoSalarial` com método `main`. Não utilizar ciclos, arrays, `Scanner`, métodos adicionais, orientação a objetos avançada, frameworks ou bibliotecas externas.

## Entrega e revisão

Quando resolver a tarefa, acrescentar o meu próprio `ProcessamentoSalarial` a esta pasta, compilar, executar os oito cenários e pedir revisão ao Tech Lead. Após a aprovação, atualizar este README com: **estado aprovado, notas de aprendizagem e eventuais correções feitas**.

**Importante:** este README contém apenas o enunciado. A solução ainda não foi escrita nem disponibilizada.
