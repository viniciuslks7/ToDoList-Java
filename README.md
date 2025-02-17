# ToDo List em Java

Uma aplicação simples de lista de tarefas (**ToDo List**) desenvolvida em **Java**, com interface gráfica usando **Java Swing**. O projeto permite adicionar, remover, editar e marcar tarefas como concluídas.

## 📌 Funcionalidades

- ✅ **Adicionar Tarefa**: Insira uma nova tarefa na lista.
- 📋 **Listar Tarefas**: Visualize todas as tarefas cadastradas.
- ✔️ **Marcar como Concluída**: Marque uma tarefa como concluída.
- ❌ **Remover Tarefa**: Remova uma tarefa da lista.
- ✏️ **Editar Tarefa**: Altere a descrição de uma tarefa existente.

## 🔧 Tecnologias Utilizadas

- **Java JDK**: Versão 11 ou superior.
- **Java Swing**: Biblioteca para criação de interfaces gráficas.
- **Git**: Controle de versão do projeto.

## 🚀 Como Executar o Projeto

### 📌 Pré-requisitos

1. **JDK**: Certifique-se de ter o Java Development Kit (JDK) instalado. Você pode verificar a instalação com o comando:
   ```bash
   java -version
   ```
   Se não estiver instalado, baixe e instale o JDK [aqui](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Git**: Para clonar e gerenciar o projeto. Verifique a instalação com:
   ```bash
   git --version
   ```
   Se necessário, instale o Git [aqui](https://git-scm.com/downloads).

### 📌 Passos para Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/viniciuslks7/ToDoList-Java.git
   cd ToDoList-Java
   ```

2. **Compile o projeto:**
   ```bash
   javac ToDoListGUI.java
   ```

3. **Execute o projeto:**
   ```bash
   java ToDoListGUI
   ```

4. **Use a interface:**
   - Adicione, edite, remova ou marque tarefas como concluídas diretamente na interface gráfica.

## 📂 Estrutura do Projeto
```
ToDoList-Java/
│
├── Task.java           # Classe que representa uma tarefa.
├── TaskManager.java    # Classe que gerencia a lista de tarefas.
├── ToDoListGUI.java    # Classe principal com a interface gráfica.
├── README.md           # Este arquivo.
```

## 🤝 Como Contribuir

1. **Faça um fork do projeto.**
2. **Crie uma branch para sua feature:**
   ```bash
   git checkout -b feature/nova-feature
   ```
3. **Commit suas mudanças:**
   ```bash
   git commit -m 'Adicionando nova feature'
   ```
4. **Push para a branch:**
   ```bash
   git push origin feature/nova-feature
   ```
5. **Abra um Pull Request.**
