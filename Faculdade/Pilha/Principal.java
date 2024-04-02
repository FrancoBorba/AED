public class Principal {
  public static void main(String[] args) {
    PilhaArray pilhaArray = new PilhaArray(10);
    PilhaLista pilhaLista = new PilhaLista();

    System.out.println(pilhaArray.estaVazia()); // imprime true pois a pilha está vazia
    pilhaArray.push(1);
    pilhaArray.push(2);
    pilhaArray.push(3);
    pilhaArray.push(4); // topo da pilha

    System.out.println(pilhaArray); // imprime a pilha
    pilhaArray.pop(); // retira o elemento do topo
    System.out.println("O elemento do topo é " + pilhaArray.getTop()); // imprime o elemento do topo

    pilhaArray.fazVazia(); // limpa a pilha
    System.out.println(pilhaArray.estaVazia() ? "Pilha vazia" : "Pilha não está vazia"); // verifica se a pilha esta vazia
    System.out.println(pilhaArray ); // imprime a pilha de novo

    System.out.println("TESTE LISTA");
    System.out.println("---------------------------------------------------------------");

    pilhaLista.push(1); // adicionando no topo
    pilhaLista.push(2); // adicionando no topo
    pilhaLista.push(5); // adicionando no topo
    pilhaLista.push(10); // adicionando no topo

    System.out.println(pilhaLista); // imprimindo a lista

    pilhaLista.pop(); // removendo do topo

    System.out.println(pilhaLista); // imprimindo após a remoção 

    System.out.println("O elemento do topo: " + pilhaLista.getTop());

    System.out.println( pilhaLista.estaVazia() ? "Pilha vazia " : "Pilha com objetos"); // verifica se esta ou não vazia

    pilhaLista.fazVazia(); // limpa a lista

    System.out.println(pilhaLista);
    


  }
}
