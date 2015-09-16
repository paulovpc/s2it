S2IT Problema proposto

- Para o problema proposto foi criado o projeto usando resteasy como fonte de servi�o e o client do servi�o com uma clsse MAIN par chamada do servi�o. O projeto foi desenvolvido na plataforma windows.
- C�digo desenvolvido com enconding UTF-8

** Projeto
*** EntregandoMercadoria
**** EntregandoMercadoria-Servico
**** EntregandoMercadoria-WAR
**** EntrtegandoMercadoria-EAR
*** ClienteEntregandoMercadoria
**** ClienteEntregandoMercadoria-Executa

- O projeto est� usando MAVEN como gerador de suas builds.

* Como usar o projeto *

- O c�digo foi usado o jboss-eap-6.4 para a camada de servi�o.
- Pegar o target da build no caminho do EAR e executar o deploy no standalone do servidor e start.

- caminho-jar = {caminho-target-ClienteEntregandoMercadoria-Executa}/ClienteEntregandoMercadoria-Executa-0.0.1-SNAPSHOT.jar
- Execute o CMD no caso do windows para java -jar {caminho-jar} {arquivo-caminho}/grafo.txt [Onde fica o grafo como par�metro].
- Ap�s isso o MAIN ir� chamar o m�todo de verificar o menor caminho e retornar para o usu�rio.
- O algoritmo usado para validar o menor caminho foi o Dijkstra, onde l� os vertices, arestas do grafo e verifica o menor caminho e retorna para o usu�rio.
- O retorno � um JSON do DTO usado para o retorno do menor caminho.
- O recebimento dos pa�metros � em formato de array  do client para o service.
- O MAIN recebe um par�metro em formato TXT com o t�tulo grafo.txt. Caso contr�rio ser� executado o retorno de uma exception de FileNotFound.

--- Observa��o n�o foi feito a recupera��o dos Grafos anteriores. Motivo n�o deu tempo de codificar.

* Padr�o do arquivo grafo.txt *
A D 2.60 10 GRAFOA
AB10
BD15
AC20
CD30
BE50
DE30

- Primeiro par�metro Origem
- Segundo par�metro Destino
- Terceiro valor do combust�vel
- Quarto autonomia
- Quinto nome do grafo
- Pr�xima linha n�1 n�2 e o peso da aresta

* Grava��o dos GRAFOS *

-Deve ser criado um arquivo bd.txt para grava��o dos grafos.

---Observa��o: Todos os caminhos devem ser alterados nas constantes do c�digo fonte.

- Trabalho realizado para participa��o do processo seletivo da S2IT, solicito por favor a n�o c�pia do mesmo, pois � para meios de validar o desenvolvimento do desenvolvedor no processo seletivo.

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
- The receipt of pa�metros client is in the array format for the service.
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