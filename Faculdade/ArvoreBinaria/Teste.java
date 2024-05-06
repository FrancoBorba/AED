/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 24/04/2024
* Ultima alteracao.: 24/04/2024
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

     System.out.println("A altura da raiz para uma folha é: " + arvoreBinaria.calculaAltura());
     System.out.println(arvoreBinaria.calculaAlturaEmLargura()); // tenho que adicionar a classe FilaEncadeada na pasta para funcionar

     System.out.println("O total de nodes é : " + arvoreBinaria.calculaTotalNodes());

     System.out.println("O total de nos folhas é : " + arvoreBinaria.calculaTotalNodesFolhas());

   System.out.println( arvoreBinaria.removerNode(60, arvoreBinaria.getFilhoDireita()));

     System.out.println("-------------------------------------------------------------------");

      arvoreBinaria.imprimirInOrdem();
  }

  
}
