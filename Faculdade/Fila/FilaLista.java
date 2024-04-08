/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 08/04/2024
* Ultima alteracao.: 08/04/2024
* Nome.............: FilaLista.java
* Funcao...........: Criar uma fila de Lista
*************************************************************** */
package Faculdade.Fila;

public class FilaLista<T> implements IFila<T>{
  @SuppressWarnings("rawtypes")
  private ListaEncadeada listaEncadeada;
  

  @SuppressWarnings("rawtypes")
  public FilaLista(){
    listaEncadeada = new ListaEncadeada();
  }

   /*
   * ***************************************************************
   * Metodo: fazVazia
   * Funcao: Limpar a fila
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  @Override
  public void fazVazia() {
    listaEncadeada.limparLista(); // limpa a lista
  }

  /*
   * ***************************************************************
   * Metodo: estaVazia
   * Funcao: Verificar se a fila está vazia
   * Parametros: void
   * Retorno: boolean(True se estiver vazia Falsa se não)
   * ***************************************************************
   */
  @Override
  public boolean estaVazia() {
    return listaEncadeada.getTamanho() ==0;
  }

  /*
   * ***************************************************************
   * Metodo: getPrimeiro
   * Funcao: retorna o primeiro elemento da fila
   * Parametros: void
   * Retorno: T(Objeto que está em primeiro)
   * ***************************************************************
   */
  @Override
  public T getPrimeiro() {
       if(listaEncadeada.getTamanho() == 0){
      throw new IllegalAccessError("Fila vazia");
    }
   return (T) listaEncadeada.getHead();
  }

  /*
   * ***************************************************************
   * Metodo: enfileirar
   * Funcao: adicionar um elemento no inicio da fila
   * Parametros: Elemento que sera adicionado
   * Retorno: void
   * ***************************************************************
   */
  @Override
  public void enfileirar(T objeto) {
    listaEncadeada.adicionaFim(objeto);
  }

    /*
   * ***************************************************************
   * Metodo: desinfileirar
   * Funcao: retorna o primeiro elemento da fila e retira-lo da fila
   * Parametros: void
   * Retorno: T(Objeto que está em primeiro)
   * ***************************************************************
   */
  @Override
  public T desenfileirar() {
      if(listaEncadeada.getTamanho() == 0){
      throw new IllegalAccessError("Fila vazia");
    }
    T retorno = (T) listaEncadeada.getHead();
    listaEncadeada.removerInicio();
    return retorno;

  }
  @Override
  public String toString() {
    return "FilaLista [listaEncadeada=" + listaEncadeada + "]";
  }
  
  
}
