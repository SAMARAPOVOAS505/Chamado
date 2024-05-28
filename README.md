# Chamado

## Sobre o Projeto
 Sistema foi desenvolvido para à empresa ter uma comunicação facilitada entre os funcionarios com o suporte de Ti.


## Tecnologia Ultilizada 
- Java: Liguagem ultilizada para o projeto
- MySQL: Banco de Dados 
- Spring Boot: API ultilizada para facilitar a criação, execulção e implantação.
- Insomnia: framework ultilizado para desenvolvimento teste de APIs 
- Visual Studio: editor de código fonte ultilizado

## Estrutura de Pastas

  /src                                                                 # Código fonte principal da aplicação
    /main
       /java\com\chamado\Servidor
                              /Controller                              # Funções de COntroler
                                      /ServidorController.java
                              /Model                                   # Modelos de Dados
                                  /Servidor.java
                              /Repository                              # Gerenciamento dos Dados
                                      /ServicosRepository.java
                                      /ServidorRepository.java

## Funcionalidades

- **Cria Chamado**: Permite a criação do chamado passando informações com detalhamento como nome, data do chamado, categoria(resetar senha, erro no sistema, maquina desligou e entre outros), descrição (informa com mais detalhes do problema que esta tendo) e o ip da maquina que esta abrindo o chamado
-  **Lista o Chamado**: Mostra todos os chamados que estão em aberto para quem tem o login da Ti
-  **Atualiza o Chamado**: Quem estiver login da Ti pode atualizar o chamado informando se esta aberto, em andamento ou se foi resolvido
-  **Deletar o Chamado**: Quando a equipe de Ti atualiza como concluido, o chamado é excluido.
