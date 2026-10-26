# TASK-JAVA-002 — Processamento salarial

**Estado:** ✅ Aprovada  
**Nível:** Iniciante II  
**Conceitos:** cálculos com inteiros, validação, condições aninhadas e cálculo sem duplicação.

## Contexto

A WorkPay Technologies pretende automatizar um cálculo salarial simplificado com salário base, remuneração de horas extraordinárias e prémio de produtividade. Os números são **inteiros em euros**, exclusivamente para aprendizagem; **não representam legislação laboral nem um processamento salarial real**.

## Dados de entrada

| Variável do enunciado | Tipo | Valor de referência |
| --- | --- | ---: |
| `salarioBase` | `int` | 920 |
| `horasExtra` | `int` | 6 |
| `valorHoraExtra` | `int` | 8 |
| `premioProdutividade` | `int` | 40 |

**Nota:** na minha implementação usei os nomes `horarioExtra` e `valorExtra` para algumas variáveis, mantendo a mesma finalidade.

## Regras de negócio (por prioridade)

1. `salarioBase` menor ou igual a zero → `ERRO: SALARIO BASE INVALIDO`.
2. Horas extraordinárias negativas → `ERRO: HORAS EXTRA INVALIDAS`.
3. Mais de 20 horas extraordinárias → `ERRO: LIMITE DE HORAS EXCEDIDO`.
4. Cada hora extraordinária é remunerada ao valor indicado.
5. O prémio de 40 EUR aplica-se apenas com **10 ou mais horas extraordinárias**.
6. Em caso válido, apresentar `SALARIO TOTAL: <valor> EUR`; caso contrário, apresentar somente o primeiro erro.

## Casos de aceitação

| Caso | Salário base | Horas extra | Resultado esperado |
| --- | ---: | ---: | --- |
| CT-01 | 920 | 0 | `SALARIO TOTAL: 920 EUR` |
| CT-02 | 920 | 6 | `SALARIO TOTAL: 968 EUR` |
| CT-03 | 920 | 10 | `SALARIO TOTAL: 1040 EUR` |
| CT-04 | 920 | 20 | `SALARIO TOTAL: 1120 EUR` |
| CT-05 | 920 | -2 | `ERRO: HORAS EXTRA INVALIDAS` |
| CT-06 | 920 | 21 | `ERRO: LIMITE DE HORAS EXCEDIDO` |
| CT-07 | 0 | 6 | `ERRO: SALARIO BASE INVALIDO` |

Nos testes, o valor da hora extra é 8 EUR e o prémio possível é 40 EUR.

## A minha implementação

Consultar [`ProcessamentoSalarial`](ControloAcesso.java). O ficheiro contém a versão que submeti depois das revisões, com os textos de saída corrigidos. Para cada teste, alterar os valores iniciais, compilar e executar.

## O que aprendi

- Separar validação dos dados e processamento do salário.
- Utilizar uma condição aninhada para determinar o prémio sem repetir o cálculo salarial.
- Dar atenção aos limites (`0`, `10`, `20`) e às mensagens exatas.
- Rever o fluxo do programa em cenários com entradas inválidas.

## Resultado da revisão

Aprovada após correções de fluxo e formato da saída. Os valores e erros dos sete cenários foram apresentados ao longo das revisões; a versão final foi demonstrada no terminal com o cenário CT-02.
