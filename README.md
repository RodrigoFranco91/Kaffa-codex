# Neste repositório encontra-se os desafios técnicos da empresa Codex:

## As questões (desafios) estão [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/Teste-Kaffa-1.10.pdf)

</br>

## Tecnologias utilizadas:

- Linguagem de Programação: Java 11
- IDE: IntelliJ
- Frameworks: Alguns módulos do Spring Boot foram utilizados nos desafios: 4, 5 e 6.
- Banco de Dados: No desafio 4 foi utilizado o banco H2 (Banco de dados em memória que é acessado através de  http://localhost:8080/h2-console)

</br>

## Preparando o ambiente para rodar os desafios:

1. Faça o download do jdk 11 e instale em sua máquina;
2. Crie/configure a variável de ambiente JAVA_HOME em seu sistema operacional.
3. Opcionalmente você pode instalar uma IDE Java (Eclipse, IntelliJ, NetBeans), baixar o código fonte e executar os programas - Executar as classes que possuem o método Main().

</br>

## Como executar os programas?

- A seguir havéra uma explicação detalhada para cada desafio (questão), mas resumidamente podemos dizer que há duas maneiras de executar os programas:

1. Uma maneira é baixar o código fonte de cada projeto, abri-lo na sua IDE de preferência e executar a classe Principal. A classe principal é sempre a classe que possui o método main().

2. Outra maneira é baixar o arquivo JAR de cada projeto e executá-lo via terminal com o comando: java -jar NOME_DO_ARQUIVO.jar

</br>
</br>

## Questão 01:

Validate CNPJ format and check digits:

## Solução - Código fonte [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/tree/master/cnpj):

- Para executar esta solução via terminal:

1. Baixe o arquivo JAR, clicando [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/raw/master/cnpj/cnpj.jar)
2. Abra o terminal na pasta onde você baixou o arquivo JAR;
3. Dentro do terminal rode o comando: java -jar cnpj.jar
4. Digite o CNPJ que desejas verificar! Se desejar verificar outro valor, repita o passo de número 3.

</br>
- Veja as imagens do programa sendo executado:

CNPJ formatado Correto:</br>
![CNPJ formatado Correto:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/cnpj/screen/Ok.png)

</br>

CNPJ numeral Correto:</br>
![CNPJ numeral Correto:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/cnpj/screen/ok2.png)

</br>

CNPJ Incorreto:</br>
![CNPJ Incorreto:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/cnpj/screen/Erro.png)

</br>

CNPJ Incorreto:</br>
![CNPJ Incorreto:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/cnpj/screen/Erro2.png)

</br>
</br>

## Questão 02:

Test if two rectangles intersect

NÃO FEITO, AINDA!!!

</br>
</br>

## Questão 03:

Compute the area of intersection between two rectangles

NÃO FEITO, AINDA!!!

</br>
</br>

## Questão 04:

Simple Todo List

## Solução - Código fonte [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/tree/master/todo-list):

- Para executar esta solução via terminal:

1. Baixe o arquivo JAR, clicando [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/raw/master/todo-list/target/todo-list.jar)
2. Abra o terminal na pasta onde você baixou o arquivo JAR;
3. Dentro do terminal rode o comando: java -jar todo-list.jar
4. Entre na opção 1 para cadastrar atividades, na opção 2 para deletar uma atividade e 5 para sair do programa.
5. É possível acessar a base de dados acessando http://localhost:8080/h2-console (O terminal deve estar rodando o passo 3) - O password/senha é admin e as outras configurações você pode ver aqui: ![Configuração H2:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/todo-list/Acesso%20H2.png)

</br>
- Veja as imagens do programa sendo executado:

Executando a aplicação:</br>
![Executando a aplicação:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/todo-list/screen/Executando.png)

</br>

Cadastrando uma Task:</br>
![Cadastrando uma Task:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/todo-list/screen/Cadastrando%20uma%20Atividade.png)

</br>

Verificando o cadastro na base de dados:</br>
![Verificando o cadastro na base de dados:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/todo-list/screen/Base%20de%20Dados%20H2.png)

</br>

Deletando uma Task:</br>
![Deletando uma Task:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/todo-list/screen/Deletando%20Atividade%201.png)

</br>

Saindo da aplicação:</br>
![Saindo da aplicação:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/todo-list/screen/Saindo.png)

</br>
</br>

## Questão 05:

Rest Client - World Clock

## Solução - Código fonte [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/tree/master/rest-client-clock):

- Para executar esta solução via terminal:

1. Baixe o arquivo JAR, clicando [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/raw/master/rest-client-clock/target/rest-client-clock.jar)
2. Abra o terminal na pasta onde você baixou o arquivo JAR;
3. Dentro do terminal rode o comando: java -jar rest-client-clock.jar
4. No fim, o terminal exibirá o resultado ao consultar o serviço hospeado em: http://worldclockapi.com/api/json/utc/now

</br>
- Veja as imagens do programa sendo executado:

Executando a aplicação:</br>
![Executando a aplicação:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/rest-client-clock/screen/Executando%20Programa.png)

</br>
</br>

## Questão 06:

Rest Server - World Clock

## Solução - Código fonte [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/tree/master/rest-server-clock):

- Para executar esta solução via terminal:

1. Baixe o arquivo JAR, clicando [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/raw/master/rest-server-clock/target/rest-server-clock.jar)
2. Abra o terminal na pasta onde você baixou o arquivo JAR;
3. Dentro do terminal rode o comando: java -jar rest-server-clock.jar
4. Com o terminal em execução, abra qualquer navegador e digite localhost:8080/clock
5. Será exibido o horário atual. O valor foi obtido através do serviço hospeado em: http://worldclockapi.com/api/json/utc/now

</br>
- Veja as imagens do programa sendo executado:

Executando a aplicação:</br>
![Executando a aplicação:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/rest-server-clock/screen/Executando%20Programa.png)

</br>

- Veja as imagens do programa sendo executado:

Acessando resultado via Navegador:</br>
![Acessando resultado via Navegador:](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/rest-server-clock/screen/Resultado.png)

</br>
</br>

## Questão 07:

Entity Relationship Diagram - Simple Order Manager

## Solução - Todos os conteúdos [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/tree/master/simple-order-manager):

- Baixe/Visualize a modelagem (diagrama) do banco de dados, clicando [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/raw/master/simple-order-manager/Simple%20Order%20Manager.png)

- Baixe/Visualize o script para criar as tabelas e as regras, clicando [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/simple-order-manager/Simple%20Order%20Manager%20-%20DDL.sql)

- Baixe/Visualize o script para listar os pedidos com seus itens (conteúdo extra), clicando [aqui!](https://github.com/RodrigoFranco91/Kaffa-codex/blob/master/simple-order-manager/List%20Orders%20with%20number%20of%20items.sql)

</br>
</br>

## Questão 08:

UX - Prototype (Optional - Designers / frontend developers only)

- Estou concorrendo a uma vaga Backend, logo não realizei esse desafio.

</br>
</br>