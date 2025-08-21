# 🎮 Jogo da Forca em Java

Este projeto é uma implementação simples do **jogo da forca** em Java,
utilizando conceitos de **POO, enums e tratamento de exceções**.

## 📌 Estrutura do Projeto

-   **Main** → Classe principal com o menu interativo via console.\
-   **HangmanChar** → Representa cada caractere da palavra, controlando
    visibilidade e posição.\
-   **HangmanGame** → Contém a lógica do jogo (erros, acertos, desenho
    da forca e status).\
-   **HangmanGameStatus (enum)** → Define os estados possíveis do jogo:
    `PENDING`, `WIN`, `LOSE`.\
-   **Exceções personalizadas**
    -   `LetterAlreadyInputtedException` → Evita repetição de letras.\
    -   `GameIsFinishedException` → Impede jogadas após o término da
        partida.

## 🚀 Como funciona

1.  O usuário inicia o jogo informando as letras da palavra secreta
    (passadas como argumento).\
2.  O programa exibe o desenho da forca e as opções do menu.\
3.  A cada tentativa:
    -   Se a letra existe, é revelada na palavra.\
    -   Se não existe, o desenho da forca é atualizado e a tentativa é
        contabilizada.\
4.  O jogo termina quando:
    -   O jogador descobre todas as letras (**vitória**).\
    -   O número de tentativas falhas chega ao limite (**derrota**).

## 🎯 Objetivo

A proposta é exercitar conceitos de **Java orientado a objetos**, uso de
**coleções, enums, exceções personalizadas e manipulação de strings**,
além de criar uma aplicação interativa no console.
