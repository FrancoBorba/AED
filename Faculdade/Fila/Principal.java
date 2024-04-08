package Faculdade.Fila;

public class Principal {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    @SuppressWarnings("rawtypes")
    FilaArray filaArray = new FilaArray<Integer>(10);

    filaArray.enfileirar(1); // adiciona elemento
    filaArray.enfileirar(2); // adiciona elemento
    filaArray.enfileirar(3); // adiciona elemento
 
    System.out.println(filaArray); // imprime a fila

    System.out.println("O elemento em primeiro lugar da fila = " + filaArray.getPrimeiro()); // mostra o primeiro elemento

    System.out.println(filaArray.estaVazia() ? "Lista vazia" : "Lista com elementos");

    filaArray.desenfileirar();
    System.out.println(filaArray); // imprime após tirar o primeiro elemento

    //filaArray.fazVazia(); // limpa a fila (esta dando erro)

    //System.out.println(filaArray); 

    System.out.println("------------------------------------------------------------------------");

   FilaLista filaLista = new FilaLista<Integer>();

  filaLista.enfileirar(1);
  filaLista.enfileirar(4);
  filaLista.enfileirar(3);

  System.out.println(filaLista);

  filaLista.desenfileirar();

  System.out.println(filaLista);

  System.out.println("Elemento inicial da fila = " + filaLista.getPrimeiro());

  //filaArray.fazVazia(); esta dando erro tbm


  }
}
