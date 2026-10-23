# Java Backend Academy ☕

Repositório de aprendizagem prática de **Java**, organizado em tickets de desenvolvimento. Cada tarefa parte de requisitos de negócio, é implementada por mim e passa por uma revisão técnica antes de ser considerada concluída.

**Objetivo:** construir bases sólidas de Java e evoluir gradualmente para desenvolvimento backend. O código deste repositório é educativo, com dados fictícios e regras simplificadas.

## Evolução

| Ticket | Projeto | Conteúdos praticados | Estado |
| --- | --- | --- | --- |
| [TASK-JAVA-001](tasks/TASK-JAVA-001-autorizacao-pagamentos/README.md) | Autorização de pagamentos | Variáveis, comparações, condições e prioridades | ✅ Aprovada |
| [TASK-JAVA-002](tasks/TASK-JAVA-002-processamento-salarial/README.md) | Processamento salarial | Cálculos, validações, condições aninhadas e reutilização de lógica | ✅ Aprovada |
| [TASK-JAVA-003](tasks/TASK-JAVA-003-controlo-acessos/README.md) | Controlo de acessos | Condições combinadas, limites e exceções de negócio |  Aprovada ✅ |

## Organização

```text
java-backend-academy/
├── README.md
├── .gitignore
└── tasks/
    ├── TASK-JAVA-001-autorizacao-pagamentos/
    │   ├── README.md
    │   └── Main.java
    ├── TASK-JAVA-002-processamento-salarial/
    │   ├── README.md
    │   └── Main.java
    └── TASK-JAVA-003-controlo-acessos/
        ├── README.md
        └── Main.java   # adicionar depois de resolver
```

Cada pasta contém o enunciado e os critérios de aceitação. O ficheiro `Main.java` contém a minha própria implementação **quando a tarefa estiver resolvida**. Os nomes das pastas são permanentes para preservar o histórico.

## Como executar uma tarefa concluída

É necessário ter o JDK instalado. Entrar na pasta da tarefa e executar:

```bash
javac Main.java
java Main
```

Para experimentar outros casos de teste, alterar os valores das variáveis no início do método `main`, compilar novamente e executar. Nesta fase ainda não se utilizam bibliotecas de testes nem frameworks.

## Método de aprendizagem

**Ticket → tentativa individual → testes manuais → code review → correções → aprovação.**

Os exercícios são implementados por mim; o Tech Lead simulado orienta e revê, sem entregar soluções prontas. As tarefas concluídas documentam o que consegui fazer e as lições aprendidas. As tarefas abertas preservam apenas o enunciado até existir implementação própria.

## Próximos passos

Consolidar Java fundamental antes de avançar para ciclos, métodos, orientação a objetos, testes automatizados e, mais tarde, Java backend e Spring Boot.
