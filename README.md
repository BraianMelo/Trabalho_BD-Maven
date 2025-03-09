# Sistema de Gerenciamento de Banco de Dados - Criptozoologia

Este projeto é um sistema de gerenciamento de banco de dados com interface gráfica desenvolvido em **Java** utilizando **JavaFX** e **JDBC**. Ele permite a administração de informações relacionadas à **criptozoologia**, incluindo registros de avistamentos, pesquisadores, testemunhas e criptídeos confirmados.

## 📁 Estrutura do Projeto

```
Trabalho_BD/
├── src/
│   ├── main/
│   │   ├── java/      # Código-fonte do projeto
│   │   │   ├── app/           # Ponto de entrada da aplicação
│   │   │   ├── controle/      # Controladores da interface
│   │   │   ├── visao/         # Interface gráfica
│   │   │   ├── modelo/        # Dados e regras de negócio
│   │   │   └── persistencia/  # Acesso a dados (JDBC, DAOs)
│   │   └── resources/
│   │       ├── database/      # Scripts do banco de dados
│   │       └── visao/         # Interface gráfica (FXMLs)
├── target/             # Arquivos compilados (gerado pelo Maven)
├── pom.xml             # Arquivo de configuração do Maven
├── README.md           # Documentação do projeto
└── .gitignore          # Arquivos ignorados pelo Git
```

## 🛠️ Tecnologias Utilizadas

- **Java (JDK 21+)**
- **JavaFX** (Interface gráfica)
- **JDBC** (Conexão com o banco de dados)
- **MySQL** (Banco de dados relacional)
- **Maven** (Gerenciador de dependências)

## 🚀 Configuração do Ambiente

### 1. **Instalar o JDK**
   - Certifique-se de que o **JDK 21+** está instalado em seu sistema. Caso não tenha, [baixe e instale o JDK 21](https://adoptopenjdk.net/).
   - Verifique se o JDK está corretamente configurado no seu PATH. No terminal, execute o seguinte comando para verificar a versão instalada:

```
     java -version
```

### 2. **Instalar o JavaFX SDK**
   - Baixe o [JavaFX SDK](https://openjfx.io/) compatível com o JDK que você está utilizando.
   - Extraia o JavaFX SDK para um diretório de sua preferência.
   - No arquivo `pom.xml`, certifique-se de que as dependências do JavaFX estejam configuradas corretamente. Caso não tenha feito isso, você pode adicionar a dependência no Maven para garantir que o JavaFX seja corretamente utilizado:

```
     xml
     <dependencies>
         <dependency>
             <groupId>org.openjfx</groupId>
             <artifactId>javafx-controls</artifactId>
             <version>21</version> <!-- Ou a versão correspondente ao seu JDK -->
         </dependency>
     </dependencies>
```

### 3. **Configuração do Banco de Dados**
   - **Instalar MySQL**: Certifique-se de que o **MySQL** está instalado e rodando em seu sistema. Caso ainda não tenha, [baixe e instale o MySQL](https://dev.mysql.com/downloads/installer/).
   - **Configurar Banco de Dados**:
     - Importe os scripts contidos na pasta `database/` para criar o banco de dados. Você pode usar o terminal do MySQL ou qualquer cliente de sua preferência para executar os comandos SQL.
     - O arquivo `src/main/resources/BD.properties` contém as configurações de conexão do banco de dados. Edite este arquivo com as informações corretas de conexão (usuário, senha, URL, etc.):

```
       properties
       db.url=jdbc:mysql://localhost:3306/criptozoologia
       db.username=root
       db.password=sua_senha
```


### 4. **Instalar o Maven (Caso não tenha)**
   - O Maven é utilizado para gerenciamento de dependências e execução do projeto. Se você ainda não tem o Maven instalado, [baixe e instale o Maven](https://maven.apache.org/download.cgi).
   - Verifique se o Maven está corretamente instalado com o comando:
```
     mvn -version
```

## ▶️ Como Executar

### 📌 Compilar o Projeto
Execute o seguinte comando no terminal:
```bash
mvn compile
```

### 📌 Executar o Projeto
Após a compilação, rode:
```bash
mvn javafx:run
```

### 📌 Limpar Arquivos Compilados
Para remover os arquivos gerados na compilação:
```bash
mvn clean
```

## 👥 Autores

- **Braian Melo**: [GitHub](https://github.com/BraianMelo)
- **Gustavo Henrique**: [GitHub](https://github.com/GustavoH-C)
- **Yuri Drumond**: [GitHub](https://github.com/YuriDrumond)
- **Repositório do Projeto**: [GitHub](https://github.com/BraianMelo/Trabalho_BD)

---
📌 *Este projeto foi desenvolvido para fins acadêmicos e de aprendizado.* 🎓
