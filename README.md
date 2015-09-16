S2IT Problema proposto

- Para o problema proposto foi criado o projeto usando resteasy como fonte de serviço e o client do serviço com uma clsse MAIN par chamada do serviço. O projeto foi desenvolvido na plataforma windows.
- Código desenvolvido com enconding UTF-8

** Projeto
*** EntregandoMercadoria
**** EntregandoMercadoria-Servico
**** EntregandoMercadoria-WAR
**** EntrtegandoMercadoria-EAR
*** ClienteEntregandoMercadoria
**** ClienteEntregandoMercadoria-Executa

- O projeto está usando MAVEN como gerador de suas builds.

* Como usar o projeto *

- O código foi usado o jboss-eap-6.4 para a camada de serviço.
- Pegar o target da build no caminho do EAR e executar o deploy no standalone do servidor e start.

- caminho-jar = {caminho-target-ClienteEntregandoMercadoria-Executa}/ClienteEntregandoMercadoria-Executa-0.0.1-SNAPSHOT.jar
- Execute o CMD no caso do windows para java -jar {caminho-jar} {arquivo-caminho}/grafo.txt [Onde fica o grafo como parâmetro].
- Após isso o MAIN irá chamar o método de verificar o menor caminho e retornar para o usuário.
- O algoritmo usado para validar o menor caminho foi o Dijkstra, onde lê os vertices, arestas do grafo e verifica o menor caminho e retorna para o usuário.
- O retorno é um JSON do DTO usado para o retorno do menor caminho.
- O recebimento dos paâmetros é em formato de array  do client para o service.
- O MAIN recebe um parâmetro em formato TXT com o título grafo.txt. Caso contrário será executado o retorno de uma exception de FileNotFound.

--- Observação não foi feito a recuperação dos Grafos anteriores. Motivo não deu tempo de codificar.

* Padrão do arquivo grafo.txt *
A D 2.60 10 GRAFOA
AB10
BD15
AC20
CD30
BE50
DE30

- Primeiro parâmetro Origem
- Segundo parâmetro Destino
- Terceiro valor do combustível
- Quarto autonomia
- Quinto nome do grafo
- Próxima linha nó1 nó2 e o peso da aresta

* Gravação dos GRAFOS *

-Deve ser criado um arquivo bd.txt para gravação dos grafos.

---Observação: Todos os caminhos devem ser alterados nas constantes do código fonte.

- Trabalho realizado para participação do processo seletivo da S2IT, solicito por favor a não cópia do mesmo, pois é para meios de validar o desenvolvimento do desenvolvedor no processo seletivo.

===ENGLISH===

S2IT proposed Problem

- For the proposed problem was created the design using RESTEasy as a source of service and client service with a clsse MAIN pair call service. The project was developed on the Windows platform.

** Project
*** EntregandoMercadoria
**** EntregandoMercadoria-Servico
**** EntregandoMercadoria-WAR
**** EntrtegandoMercadoria-EAR
*** ClienteEntregandoMercadoria
**** ClienteEntregandoMercadoria-Runs

- The project is using MAVEN as a generator of their builds.

* How to use design *

- The code was used jboss-eap-6.4 to the service layer.
- Catch the build of the target path of the EAR deploy and run on the server and standalone start.

- Path-jar = {caminho-target-ClienteEntregandoMercadoria-Executa}/ClienteEntregandoMercadoria-Executa-0.0.1-SNAPSHOT.jar
- Run the CMD in the case of windows for java -jar {path} {-jar-file path} /grafo.txt [Where is the graph as a parameter].
- After this the MAIN will call the method of verifying the shortest path and return to the user.
- The algorithm used to validate the shortest path was Dijkstra, which reads the vertices, edges of the graph and checks the shortest path and returns to the user.
- The return is a JSON DTO used to return the shortest path.
- The receipt of paâmetros client is in the array format for the service.
- The MAIN receives a parameter in TXT format with grafo.txt title. Otherwise it will run the return of an exception of FileNotFound.

--- Observation was not made the recovery of the previous graphs. Reason not had time to encode.

* Standard grafo.txt file *
D 2.60 10 GRAFOA
AB10
BD15
AC20
CD30
BE50
DE30

- First parameter Source
- Second parameter Destination
- The third value of the fuel
- Room autonomy
- Fifth graph name
- Next line node1 NO2, and the weight of the edge

* Recording of GRAPH *

-must Be created bd.txt file for writing graph .

--- Note : All paths must be changed in constant source code.

- Work performed to participate in the selection process of S2IT, please request a copy not the same as it is for means to validate the developer's development in the selection process.
