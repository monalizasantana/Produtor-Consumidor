

## Trabalho realizado para a disciplina  Sistemas Distribuídos do curso de ADS

<h4> Este trabalho faz a implementação do problema produtor-consumidor que evita o erro ao consumir em buffer vazio e produzir em buffer cheio.</h4>


Nesse Trabalhado foi implementado uma versão do produtor-consumidor baseado em troca de mensagens (Sockets TCP/IP multithread) que inclue:

Um servidor que mantém um buffer com os itens produzidos e consumidos, e cliente(s) que solicite(m) produção/consumo de itens. Podem ser executados N clientes que se conectam a um único servidor, o qual disparará thread produtor ou thread consumidor de acordo com a solicitação.

Implementado uma versão do produtor-consumidor baseado em Java RMI que inclua: 

Um serviço RMI que mantém um buffer com os itens produzidos e consumidos, e cliente(s) que solicite(m) produção/consumo de itens. Podem ser executados N clientes que se conectam ao serviço, o qual disparará thread produtor ou thread consumidor de acordo com a solicitação.


#### Problema Consumidor e Produtor




## Instruções para execução:
<h4>

RODAR AS CLASSES ABAIXO 


1- Servidor

2- Cliente (de acordo com a quantidade que desejar)

3- Após conectar escolher se deseja produzir ou consumir

4- Se escolhido produzir (só enviar a mensagem que desejar que armazena no buffer )

5- Se escolher consumir (só enviar a mensagem consumir)

6- Observar informações de quem produziu ou consumiu no console do servidor

 </h4>
 
## **Projeto RMI - ProdutorConsumidor
<h4>

RODAR AS CLASSES ABAIXO :



1- RmiServer

2- RmiClient (de acordo com a quantidade que desejar)

3- Após conectar escolher se deseja produzir ou consumir

4- Se escolher produzir (enviar apenas uma mensagem que desejar que armazena no buffer )

5- Se escolher consumir (só enviar a mensagem consumir)

6- Observar informações de quem produziu ou consumiu no console do servidor

  </h4>
