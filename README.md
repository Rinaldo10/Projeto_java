# Projeto_Spring_Boot

Projeto Spring Boot utilizando java 21, criado com o intuito de treinar os conceitos iniciais da programação Orientada a Objetos aliada com o 
desenvolvimento web (back-end). Serão testados conceitos como: classe, objeto, 
herança, polimorfismo, API Restful, padrões de arquitetura, testes unitarios, JPA, bancos relacionais, etc.

O cenario construido para abranger as regras de negócio que guiarão a construção deste serviço será dada pelo seguintes 
termos: Empresas que publicam vagas e profissionais que se cadastram em vagas, vagas que possuem requisitos para que sejam 
associadas ao profissional e profissionais que possuem qualificações para se candidatar as vagas. É partindo deste cenários
inicial que o desenvolvimento deste sistema será feito. Ao longo do projeto, mudanças e refinamentos/aperfeiçoamentos 
serão realizados a fim de tornar o projeto mais robusto e mais próximo de um projeto real.

** Alguns insights futuros:

    * Adicionar tecnologia de cache utilizando o banco de dados Redis para melhora de performance. 

    * Criar e projetar toda a parte visual do sistema, possivelmente sendo desenvolvida em react ou angular.

    * Adicionar um arquivo SQL ao projeto com os scripts de banco de dados para que seja possivel replicar em outras maquinas.

    * Adicionar uma camada de autenticação e autorização para os serviços além de um conjunto de "roles" que definirão as permissões do usuario.

    * Aplicar durante as implementações deste projeto os principios do SOLID.

    * Desenvolver um sistema de filtros de localidade visando buscar vagas de outros países.

    * Adicionar ferramentas de observabilidade ao fazer o deploy da aplicação (Grafana e Prometheus).

    * Buscar opções de ferramentas gratuitas para fazer o deploy.

    * Adicionar ao projeto fluxo para consumo de mensageria (Kafka).

    * Tentar trazer uma implementação de Azure function para este ou um futuro projeto.

    * Adicionar testes unitarios para garantir a qualidade do código, utilizar JUnit e o Mockito.
