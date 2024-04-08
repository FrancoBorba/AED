/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 08/04/2024
* Ultima alteracao.: 08/04/2024
* Nome.............: IFila.java
* Funcao...........: Criar a Interface de uma Fila
*************************************************************** */
package Faculdade.Fila;

public interface IFila<T> {

    /*
   * ***************************************************************
   * Metodo: fazVazia
   * Funcao: Limpar a fila
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
    
  public void fazVazia();

 /*
   * ***************************************************************
   * Metodo: estaVazia
   * Funcao: Verificar se a fila está vazia
   * Parametros: void
   * Retorno: boolean(True se estiver vazia Falsa se não)
   * ***************************************************************
   */
  public boolean estaVazia();

     /*
   * ***************************************************************
   * Metodo: getPrimeiro
   * Funcao: retorna o primeiro elemento da fila
   * Parametros: void
   * Retorno: T(Objeto que está em primeiro)
   * ***************************************************************
   */
  public T getPrimeiro();

   /*
   * ***************************************************************
   * Metodo: enfileirar
   * Funcao: adicionar um elemento no inicio da fila
   * Parametros: Elemento que sera adicionado
   * Retorno: void
   * ***************************************************************
   */
  public void enfileirar(T objeto);
   /*
   * ***************************************************************
   * Metodo: desinfileirar
   * Funcao: retorna o primeiro elemento da fila e retira-lo da fila
   * Parametros: void
   * Retorno: T(Objeto que está em primeiro)
   * ***************************************************************
   */
  public T desenfileirar();

}
