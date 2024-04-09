/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 09/04/2024
* Ultima alteracao.: 09/04/2024
* Nome.............: IDeque.java
* Funcao...........: Criar a Interface de um Deque
*************************************************************** */
package Faculdade.Deque;

public interface IDeque<T> {
   /*
   * ***************************************************************
   * Metodo: fazVazia
   * Funcao: Limpar o deque
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  void fazVazia();

  /*
   * ***************************************************************
   * Metodo: estaVazia
   * Funcao: Verificar se o deque está vazia
   * Parametros: void
   * Retorno: boolean(True se estiver vazia Falsa se não)
   * ***************************************************************
   */
  boolean estaVazia();


  /*
   * ***************************************************************
   * Metodo: getPrimeiro
   * Funcao: retorna o primeiro elemento da deque
   * Parametros: void
   * Retorno: T(Objeto que está em primeiro)
   * ***************************************************************
   */
  T getPrimeiro();

  /*
   * ***************************************************************
   * Metodo: getUltimo
   * Funcao: retorna o ultimo elemento da deque
   * Parametros: void
   * Retorno: T(Objeto que está em ultimo)
   * ***************************************************************
   */
  T getUltimo();

  /*
   * ***************************************************************
   * Metodo: enfileirarInicio
   * Funcao: adicionar um elemento no inicio da deque
   * Parametros: Elemento que sera adicionado
   * Retorno: void
   * ***************************************************************
   */
  void enfileirarInicio(T objeto);

  /*
   * ***************************************************************
   * Metodo: enfileirarFim
   * Funcao: adicionar um elemento no fim da deque
   * Parametros: Elemento que sera adicionado
   * Retorno: void
   * ***************************************************************
   */
  void enfileirarFim(T objeto);

   /*
   * ***************************************************************
   * Metodo: desinfileirarInicio
   * Funcao: retorna o primeiro elemento da deque e retira-lo da deque
   * Parametros: void
   * Retorno: T(Objeto que está em primeiro)
   * ***************************************************************
   */
  T desenfileirarInicio();

/*
   * ***************************************************************
   * Metodo: desinfileirarFim
   * Funcao: retorna o ultimo elemento da deque e retira-lo da deque
   * Parametros: void
   * Retorno: T(Objeto que está em ultimo)
   * ***************************************************************
   */
  T desenfileirarFim();
}
