# TASK-JAVA-003 — Controlo de acessos

**Estado:** concluída e revista  
**Conteúdos:** condições combinadas e operadores `&&`, `||` e `!`.

## Problema

Decidir se um profissional de segurança privada pode entrar numa instalação de acesso restrito. A decisão depende da hora, validade do cartão, formação e autorização especial.

## Dados no código publicado

| Variável | Valor inicial |
| --- | --- |
| `horaEntrada` | `22` |
| `cartaoValido` | `true` |
| `formacaoConcluida` | `true` |
| `autorizacaoEspecial` | `true` |
| `nomeProfissional` | `"Carlos"` |

O nome é informativo e não interfere na decisão.

## Regras, pela ordem aplicada

1. Hora fora do intervalo de 0 a 23: `ERRO: HORA INVALIDA`.
2. Cartão inválido: `ACESSO NEGADO: CARTAO INVALIDO`.
3. Formação pendente: `ACESSO NEGADO: FORMACAO PENDENTE`.
4. Fora do horário normal (07:00 a 19:00, inclusive), sem autorização especial: `ACESSO NEGADO: FORA DO HORARIO`.
5. Caso contrário: `ACESSO AUTORIZADO`.

A autorização especial só permite ultrapassar o horário. Não dispensa o cartão válido nem a formação.

## Casos de referência

| Hora | Cartão | Formação | Especial | Esperado |
| ---: | :---: | :---: | :---: | --- |
| 10 | true | true | false | `ACESSO AUTORIZADO` |
| 7 | true | true | false | `ACESSO AUTORIZADO` |
| 19 | true | true | false | `ACESSO AUTORIZADO` |
| 22 | true | true | false | `ACESSO NEGADO: FORA DO HORARIO` |
| 22 | true | true | true | `ACESSO AUTORIZADO` |
| 10 | false | true | true | `ACESSO NEGADO: CARTAO INVALIDO` |
| 10 | true | false | true | `ACESSO NEGADO: FORMACAO PENDENTE` |
| 24 | true | true | true | `ERRO: HORA INVALIDA` |

## Implementação

Ficheiro: [ControloAcesso.java](ControloAcesso.java)

```bash
javac ControloAcesso.java
java ControloAcesso
```

Para testar outros cenários, alterar as variáveis no `main`, compilar e executar novamente.

## O que aprendi

A ordem de validação evita decisões contraditórias. Uma autorização especial não deve anular as restantes verificações.

Este é um exercício didático de consola, não um sistema de segurança de produção. Os testes são manuais.
