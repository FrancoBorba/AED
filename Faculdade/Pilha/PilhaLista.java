/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 02/04/2024
* Ultima alteracao.: 02/04/2024
* Nome.............: PilhaAray.java
* Funcao...........: Cria a pilha com uma estrutura de dados de lista
*************************************************************** */
public class PilhaLista implements IPilha{
  @SuppressWarnings("rawtypes")
  private ListaEncadeada lista; // criando a lista

  public PilhaLista(){
    lista = new ListaEncadeada<>(); 
    // não precisa passar tamanho pois é uma lista e não precisa do "tamanho real" pois na minha classe lista existe o registro
  }

  

     /*
   * ***************************************************************
   * Metodo: estaVazia
   * Funcao: Verificar se a pilha está vazia
   * Parametros: void
   * Retorno: boolean(True se estiver vazia Falsa se não)
   * ***************************************************************
   */
  @Override
  public boolean estaVazia() {
    return lista.getTamanho() == 0; // retorna true se o tamanho da lista for 0 e false se nao for
  }
 /*
   * ***************************************************************
   * Metodo: fazVazia
   * Funcao: Limpar a lista
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  @Override
  public void fazVazia() {
    lista.limparLista();
  }

     /*
   * ***************************************************************
   * Metodo: push
   * Funcao: retorna o elemento 
   * Parametros: void
   * Retorno: T(Objeto que está no top)
   * ***************************************************************
   */
  @Override
  public Object getTop() {
   return lista.getHead();
  }

     /*
   * ***************************************************************
   * Metodo: push
   * Funcao: adiciona elementto noo topo da pilha
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  @SuppressWarnings("unchecked")
  @Override
  public void push(Object object) {
    lista.adicionaInicio(object); // adiciona no inicio
                                  // foi definido que o topo é o inicio
  }

    /*
   * ***************************************************************
   * Metodo: pop
   * Funcao: retira o elemento do top e retorna ele
   * Parametros: void
   * Retorno: T(Objeto que está no top)
   * ***************************************************************
   */
  @Override
  public Object pop() {
    Object topo = lista.getHead();
    lista.removerInicio();

    return topo;
  }



  @Override
  public String toString() {
    return "PilhaLista [lista=" + lista + "]";
  }
  



  
}
