package Faculdade.ArvoreBinaria;

public class TesteAVL {
  public static void main(String[] args) {
     AVL<Integer> arvoreBinaria = new AVL<Integer>(8);

    arvoreBinaria.inserirOrdenado(1);
    arvoreBinaria.inserirOrdenado(5);
    arvoreBinaria.inserirOrdenado(3);
    arvoreBinaria.inserirOrdenado(14);
    arvoreBinaria.inserirOrdenado(18);
    arvoreBinaria.inserirOrdenado(10);

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

   System.out.println( arvoreBinaria.removerNode(10, arvoreBinaria.getFilhoDireita()));

     System.out.println("-------------------------------------------------------------------");

      arvoreBinaria.imprimirInOrdem();
  }
  }

