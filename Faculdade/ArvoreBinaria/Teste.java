/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 24/04/2023
* Ultima alteracao.: 24/04/2023
* Nome.............: Teste.java
* Funcao...........: Testar os metodos de uma arvore binaria
*************************************************************** */
package Faculdade.ArvoreBinaria;

public class Teste {
  public static void main(String[] args) {
    Node<Integer> arvoreBinaria = new Node<Integer>(50);

    arvoreBinaria.inserirOrdenado(40);
    arvoreBinaria.inserirOrdenado(60);
    arvoreBinaria.inserirOrdenado(65);
    arvoreBinaria.inserirOrdenado(30);
    arvoreBinaria.inserirOrdenado(70);
    arvoreBinaria.inserirOrdenado(45);

    System.out.println("-------------------------------------------------------------------");

    arvoreBinaria.imprimirInOrdem();
    System.out.println("-------------------------------------------------------------------");
    arvoreBinaria.imprimirEmPreOrdem();
     System.out.println("-------------------------------------------------------------------");
     arvoreBinaria.imprimirEmPosOrdem();

     arvoreBinaria.remover(40);

     arvoreBinaria.imprimirInOrdem();
    System.out.println("-------------------------------------------------------------------");
    arvoreBinaria.imprimirEmPreOrdem();
     System.out.println("-------------------------------------------------------------------");
     arvoreBinaria.imprimirEmPosOrdem();
  }
}
