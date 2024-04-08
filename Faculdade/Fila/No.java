package Faculdade.Fila;

/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 23/03/2023
* Ultima alteracao.: 24/03/2023
* Nome.............: No
* Funcao...........: Criar os nos de uma lista encadeada , os nos sao onde ficarao armazendados o "elemento" que se deseja adicionar e a referencia para o proximo No
*************************************************************** */
public class No<T> {
  private T elemento;
  private No<T> proximo;

  public No(T elemento) {
    this.elemento = elemento;
    this.proximo = null;
  }

  public No(T elemento, No<T> proximo) {
    this.elemento = elemento;
    this.proximo = proximo;
  }

  /*
   * ***************************************************************
   * Metodo: getElemento
   * Funcao: retornar o elemento no no
   * Parametros: void
   * Retorno: T (o retorno t é um retorno generico que sera definido pelo ususario
   * quando instanciar o metodo)
   */
  public T getElemento() {
    return elemento;
  }

  /*
   * ***************************************************************
   * Metodo: setElemento
   * Funcao: definir o elemento que vai no No
   * Parametros: T (o parametro t é um parametro generico que sera definido pelo
   * ususario quando instanciar o metodo)
   * Retorno: void
   */
  public void setElemento(T elemento) {
    this.elemento = elemento;
  }

  /*
   * ***************************************************************
   * Metodo: getProximo
   * Funcao: retornar o proximo no
   * Parametros: void
   * Retorno: T (o retorno t é um retorno generico que sera definido pelo ususario
   * quando instanciar o metodo)
   */
  public No<T> getProximo() {
    return proximo;
  }

  /*
   * ***************************************************************
   * Metodo: setProximo
   * Funcao: definir o o proximo No
   * Parametros: T (o parametro t é um parametro generico que sera definido pelo
   * ususario quando instanciar o metodo)
   * Retorno: void
   */
  public void setProximo(No<T> proximo) {
    this.proximo = proximo;
  }

  /*
   * ***************************************************************
   * Metodo: to String
   * Funcao: Transformar em string o "object" no caso o No para facilitar sua
   * leitura em eventuais prints
   * Parametros: void
   * Retorno: String
   */
  @Override
  public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("No [elemento=").append(elemento).append(", proximo=").append(proximo).append("]");
        return builder.toString();
    }

}
