/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 01/04/2024
* Ultima alteracao.: 26/04/2024
* Nome.............: IPilha.java
* Funcao...........: Criar a Interface de uma Pilha
*************************************************************** */
public interface IPilha<T> {

   /*
   * ***************************************************************
   * Metodo: estaVazia
   * Funcao: Verificar se a lista está vazia
   * Parametros: void
   * Retorno: boolean(True se estiver vazia Falsa se não)
   * ***************************************************************
   */
  public boolean estaVazia();
    /*
   * ***************************************************************
   * Metodo: fazVazia
   * Funcao: Limpar a pilha
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  public void fazVazia();
    /*
   * ***************************************************************
   * Metodo: getTop
   * Funcao: retorna o elemento 
   * Parametros: void
   * Retorno: T(Objeto que está no top)
   * ***************************************************************
   */
  public  T getTop();
    /*
   * ***************************************************************
   * Metodo: push
   * Funcao: retorna o elemento 
   * Parametros: void
   * Retorno: T(Objeto que está no top)
   * ***************************************************************
   */
  public void push(T object);

    /*
   * ***************************************************************
   * Metodo: pop
   * Funcao: retira o elemento do top e retorna ele
   * Parametros: void
   * Retorno: T(Objeto que está no top)
   * ***************************************************************
   */
  public T pop();

}
