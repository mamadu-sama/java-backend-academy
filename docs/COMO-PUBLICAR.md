# Como publicar os próximos exercícios e projetos

A ideia é manter o GitHub organizado sem complicar o estudo de Java.

## Onde publicar

- **Exercício curto:** criar uma pasta em `tasks/` com o código e um `README.md`.
- **Projeto autónomo:** criar um repositório próprio com nome claro, por exemplo `java-gestao-produtos`.
- **Projeto incompleto:** pode ficar localmente até haver uma versão executável; se for publicado antes, indicar `Em desenvolvimento`.

## Antes de publicar

1. Confirmar que o código compila e executa.
2. Verificar um caso válido, um inválido e um limite, quando aplicável.
3. Excluir ficheiros gerados (`.class`, `out/`, `target/`).
4. Nunca publicar senhas, tokens, ficheiros `.env` ou dados pessoais de terceiros.
5. Documentar o problema, o que já funciona, como executar e as limitações.
6. Não marcar uma funcionalidade como concluída antes de a testar.
7. Rever `git status` e `git diff`.

## Git no dia a dia

Dentro do repositório:

```bash
git status
git add .
git diff --cached
git commit -m "feat: adicionar exercicio de pesquisa"
git push origin main
```

O último comando pressupõe que a branch se chama `main` e que o remoto `origin` já está configurado. Para criar e publicar uma branch nova:

```bash
git switch -c feat/novo-exercicio
git push -u origin feat/novo-exercicio
```

No fim, abrir o repositório no navegador e verificar se os links e comandos do README estão corretos.

## Manter o portefólio honesto

- Destacar no perfil apenas trabalho publicado e que consegues explicar.
- Distinguir **Concluído**, **Em desenvolvimento** e **Planeado**.
- Atualizar o README principal quando um exercício novo for publicado.
- Evitar badges, métricas e descrições que não correspondem ao trabalho atual.

Podes começar pelo [modelo de README](MODELO-README.md).
