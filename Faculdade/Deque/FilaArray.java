/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 09/04/2024
* Ultima alteracao.: 09/04/2024
* Nome.............: FilaArray.java
* Funcao...........: Criar uma fila de Array
*************************************************************** */
package Faculdade.Deque;

import java.util.Arrays;

public class FilaArray<T> implements IFila<T> {

  protected T array[];
  private int head , tail , count;

  @SuppressWarnings("unchecked")
  public FilaArray(int tamanho){
    this.head = 0; // inicializa a cabeca da lista como 0
    this.tail = tamanho-1; // inicializa a cauda da lista como o ultimo tamanho do array
    count= 0;
    array = (T[]) new Object[tamanho]; // iniciaza o array , fazendo um casting pois em java não se pode criar array de tipo generico
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
    while (count > 0) {
      array[head] = null; // transforma em null 
      head++; // incrementa a fila a parti da head
    
    if(head == array.length){
      head =0;
    }
    --count; // diminui o tamanho do Array
   } 
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
    return count ==0; // se for verdadeiro retorna true se nao false
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
    if(count == 0){
      throw new IllegalAccessError("Fila vazia");
    }
    return array[head];
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
    if(count == array.length ){
     throw new IllegalAccessError("Fila cheia");
    }
    tail++; // aumenta o indice de tail
    if(tail == array.length){ // se tail estiver no ultimo indice , ele vira 0 e passa para sua referencia para o inicio da fila que estara vazia pois não deu erro na verificação acima
      tail = 0; // referencia passa para o inicio
    }
    array[tail] = objeto; // indice de tail recebe o objeto
    count++; // aumenta a quantidade de elementos
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
    if(count == 0){
      throw new IllegalAccessError("Fila vazia");
    }
    T retorno = array[head]; // adiciona o retorno em uma variavel retorno(redundante)
    array[head] = null; // limpa o index atual de head
    ++head;
    if(head == array.length){
      head = 0;
    }
    count--; // diminui a quantidade de itens
  return retorno;
  }

  /*
   * ***************************************************************
   * Metodo: getHead
   * Funcao: retorna head(index do comeco da fila)
   * Parametros: void
   * Retorno: int
   * ***************************************************************
   */
  public int getHead(){
    return head;
  }
  /*
   * ***************************************************************
   * Metodo: setHead
   * Funcao: setar um novo  Head
   * Parametros: novo index
   * Retorno: void
   * ***************************************************************
   */
  public void setHead(int head){
    this.head = head;
  }
  /*
   * ***************************************************************
   * Metodo: getTail
   * Funcao: retorna tail(index do fim da fila)
   * Parametros: void
   * Retorno: int
   * ***************************************************************
   */
  public int getTail(){
    return tail;
  }
   /*
   * ***************************************************************
   * Metodo: setTail
   * Funcao: setar um novo Tail
   * Parametros: novo index
   * Retorno: void
   * ***************************************************************
   */
  public void setTail(int tail){
    this.tail = tail;
  }

  public int getCount(){
    return count;
  }

  @Override
  public String toString() {
    if(count == 0){
      return " FILA VAZIA";
    }
    return "FilaArray [array=" + Arrays.toString(array) + ", head=" + head + ", tail=" + tail + "]";
  }
  
  
}
