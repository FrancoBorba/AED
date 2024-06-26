/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 01/04/2024
* Ultima alteracao.: 02/04/2024
* Nome.............: IPilha.java
* Funcao...........: Criar a Interface de uma Pilha
*************************************************************** */
public interface IPilha {

   /*
   * ***************************************************************
   * Metodo: estaVazia
   * Funcao: Verificar se a pilha está vazia
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
  public Object getTop();
    /*
   * ***************************************************************
   * Metodo: push
   * Funcao: adiciona elementto noo topo da pilha
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  public void push(Object object);

    /*
   * ***************************************************************
   * Metodo: pop
   * Funcao: retira o elemento do top e retorna ele
   * Parametros: void
   * Retorno: T(Objeto que está no top)
   * ***************************************************************
   */
  public Object pop();

}
