# Java Backend Academy

Este é o meu repositório de prática de Java. Cada tarefa parte de um enunciado, é resolvida por mim e fica acompanhada da implementação e de notas de aprendizagem.

**Objetivo:** consolidar lógica e Java antes de avançar para desenvolvimento backend. Os cenários e os dados são fictícios e simplificados.

## Exercícios publicados

| Tarefa | Exercício | Conceitos | Estado |
| --- | --- | --- | --- |
| [TASK-JAVA-001](tasks/TASK-JAVA-001-autorizacao-pagamentos/) | Autorização de pagamentos | Condicionais e prioridades | Concluída |
| [TASK-JAVA-002](tasks/TASK-JAVA-002-processamento-salarial/) | Processamento salarial | Cálculos e validações | Concluída |
| [TASK-JAVA-003](tasks/TASK-JAVA-003-controlo-acessos/) | Controlo de acessos | Operadores lógicos | Concluída |

Estes são os exercícios atualmente publicados. Outros laboratórios de Java e POO estão em desenvolvimento e serão adicionados depois de concluídos e testados.

## Estrutura

```text
java-backend-academy/
├── README.md
├── .gitignore
├── docs/
│   ├── COMO-PUBLICAR.md
│   └── MODELO-README.md
└── tasks/
    ├── TASK-JAVA-001-autorizacao-pagamentos/
    │   ├── AutorizacaoPagamento.java
    │   └── README.md
    ├── TASK-JAVA-002-processamento-salarial/
    │   ├── ProcessamentoSalarial.java
    │   └── README.md
    └── TASK-JAVA-003-controlo-acessos/
        ├── ControloAcesso.java
        └── README.md
```

## Executar

É necessário um JDK instalado. Cada tarefa é independente e usa apenas Java, sem bibliotecas externas.

```bash
cd tasks/TASK-JAVA-001-autorizacao-pagamentos
javac AutorizacaoPagamento.java
java AutorizacaoPagamento
```

Para as outras tarefas, entrar na pasta respetiva e usar `ProcessamentoSalarial` ou `ControloAcesso` como nome de classe. Para experimentar outro cenário, alterar os valores iniciais no método `main` e compilar novamente.

## Método de aprendizagem

1. Ler os requisitos e identificar as regras.
2. Pensar na solução e, quando necessário, escrevê-la no caderno.
3. Implementar e testar diferentes cenários.
4. Rever os erros e documentar o resultado.

As verificações destas tarefas são manuais. O estado «Concluída» indica a revisão dos exercícios de aprendizagem, não uma certificação externa.

## Próximas publicações

Criei um [guia simples de publicação](docs/COMO-PUBLICAR.md) e um [modelo de README](docs/MODELO-README.md) para manter consistência quando acrescentar novos exercícios e projetos.
