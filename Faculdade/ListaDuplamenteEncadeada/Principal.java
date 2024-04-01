/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 26/03/2023
* Ultima alteracao.: 26/03/2023
* Nome.............: Principal.java
* Funcao...........: Testar os metodos de  uma lista dupla encadeada 
*************************************************************** */

public class Principal {
  public static void main(String[] args) {
    ListaDupla<String> lista = new ListaDupla<String>();

   
    lista.inserirInicio("C"); // insere o numero C no inicio
    lista.inserirInicio("A"); // Insere a letra A no inicio
    lista.inserirFim("B"); // insere a letra B no fim
    lista.inserirFim("k"); // Insere o numero K no fim

  System.out.println(lista); 

  lista.remover("A"); // removendo o elemento a

  System.out.println(lista); // lista após a remoção

  
  


    


  }
}
