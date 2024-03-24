public class Principal {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    @SuppressWarnings("rawtypes")
    ListaEncadeada lista = new ListaEncadeada<String>();

    lista.adicionaFim("1");
    System.out.println(lista); // tail e head iguais , apenas um elemento


    lista.adicionaFim("2"); // tail e head diferentes , já que a lista tem mais de um elemento
    System.out.println(lista);

    lista.adicionaInicio("3"); // head vira 3 e tail continua como 2 , já que foi adicionado no inicio;
    lista.adicionaFim("0"); // adiciona 0 no fim e transforma a tail em 0

    lista.adiciona("5", 1); // adicionando 5 na posicao 1

    


    System.out.println(lista);

  lista.removerInicio(); // remove 3 de head e transforma o elemento seguinte na head no caso 5
  lista.removerFim(); // remove o ultimo elemento no caso o 0 e transforma o 2 em tail

  System.out.println(lista);


  System.out.println(lista.getHead()); // imprime a Head
  System.out.println(lista.getTail()); // imprime a Tail

  System.out.println("O elemento da posicao 1 = " + lista.busca(1)); // mostra o elemento da posicao 1
  System.out.println("O elemento f esta na posicao = " + lista.busca("f")); // mostra a posicao do elemento buscado ,se não existir retorna -1

  lista.limparLista(); // limpa a lista
  System.out.println(lista); // lista vazia
 
  

  
    
   
  }
}
