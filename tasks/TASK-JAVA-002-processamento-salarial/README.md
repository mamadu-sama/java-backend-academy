# TASK-JAVA-002 — Processamento salarial

**Estado:** concluída e revista  
**Conteúdos:** cálculos, validações e condições aninhadas.

## Problema

Calcular um salário simplificado a partir de salário base, horas extraordinárias e prémio de produtividade. Os valores usam números inteiros apenas para aprendizagem. O exercício não representa a legislação laboral portuguesa.

## Regras

1. Salário base menor ou igual a zero: `ERRO: SALARIO BASE INVALIDO`.
2. Horas extraordinárias negativas: `ERRO: HORAS EXTRA INVALIDAS`.
3. Mais de 20 horas extraordinárias: `ERRO: LIMITE DE HORAS EXCEDIDO`.
4. Nos exemplos, cada hora extraordinária vale 8 EUR.
5. O prémio de 40 EUR aplica-se a partir de 10 horas extraordinárias.
6. Dados válidos: `SALARIO TOTAL: <valor> EUR`.

## Casos de referência

| Salário base | Horas extra | Esperado |
| ---: | ---: | --- |
| 920 | 0 | `SALARIO TOTAL: 920 EUR` |
| 920 | 6 | `SALARIO TOTAL: 968 EUR` |
| 920 | 10 | `SALARIO TOTAL: 1040 EUR` |
| 920 | 20 | `SALARIO TOTAL: 1120 EUR` |
| 920 | -2 | `ERRO: HORAS EXTRA INVALIDAS` |
| 920 | 21 | `ERRO: LIMITE DE HORAS EXCEDIDO` |
| 0 | 6 | `ERRO: SALARIO BASE INVALIDO` |

## Implementação

Ficheiro: [ProcessamentoSalarial.java](ProcessamentoSalarial.java)

```bash
javac ProcessamentoSalarial.java
java ProcessamentoSalarial
```

Os nomes de variáveis `horarioExtra` e `valorExtra` no código representam as horas extraordinárias e o seu valor unitário. Para testar cenários diferentes, alterar os valores no método `main`.

## O que aprendi

Separar as validações do cálculo e tratar valores limite com atenção. A condição aninhada permite aplicar o prémio sem duplicar o cálculo principal.

Os testes são manuais e o cálculo é intencionalmente simplificado.
