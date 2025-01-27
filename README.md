# Busca Binária - Algoritmo

> Este repositório contém a implementação do algoritmo de Busca Binária, conforme apresentado no livro *Entendendo Algoritmos*. O projeto tem como objetivo servir de base para estudo e referência, podendo ser expandido para outros algoritmos descritos no livro. A busca binária é uma técnica eficiente para encontrar um elemento em uma lista ordenada, reduzindo o número de comparações pela metade a cada iteração.

## 💻 Pré-requisitos

Para executar este projeto, certifique-se de ter as seguintes ferramentas configuradas no seu ambiente:

- **Java 21** ou superior;
- **Apache Maven** para gerenciamento de dependências e build do projeto;
- Editor ou IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🚀 Sobre o projeto

O projeto utiliza uma abordagem simples com Java para implementar o algoritmo de busca binária. Ele foi criado com o propósito de aplicar, estudar e compreender algoritmos fundamentais descritos no livro *Entendendo Algoritmos*. Além disso, foi estruturado de forma modular para facilitar a reutilização e adaptação do código para diferentes cenários.

### ✨ Funcionalidades

- Implementação do algoritmo de busca binária;
- Testes simples para validar a lógica do algoritmo;
- Entrada customizável para arrays ordenados e valores de busca.

### 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto;
- **Apache Maven**: Ferramenta de build e gerenciamento de dependências;
- **Java Simple**: Estilo direto e simplificado para a implementação dos algoritmos.

## 📚 Como Funciona o Algoritmo

A busca binária funciona dividindo repetidamente uma lista ordenada ao meio e comparando o valor buscado com o elemento central da lista:

1. Verifica se a lista está vazia. Se sim, o elemento não foi encontrado.
2. Encontra o elemento do meio da lista.
3. Compara o valor buscado com o elemento do meio:
   - Se forem iguais, o valor foi encontrado.
   - Se o valor for menor, a busca continua na metade inferior.
   - Se o valor for maior, a busca continua na metade superior.
4. O processo se repete até que o valor seja encontrado ou que a lista esteja vazia.

A complexidade da busca binária é **O(log n)**.

## 🛠️ Configuração e Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/busca-binaria.git
