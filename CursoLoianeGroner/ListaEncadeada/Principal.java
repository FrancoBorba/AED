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


    System.out.println(lista);

  System.out.println(lista.getHead()); // imprime a Head
  System.out.println(lista.getTail()); // imprime a Tail

  System.out.println("O elemento da posicao 1 = " + lista.busca(1)); // mostra o elemento da posicao 1
  System.out.println("O elemento 0 esta na posicao = " + lista.busca("f")); // mostra a posicao do elemento buscado

  lista.limparLista(); // limpa a lista
  System.out.println(lista); // lista vazia
 
  

  
    
   
  }
}
