/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 23/03/2023
* Ultima alteracao.: 24/03/2023
* Nome.............: ListaEncadeada
* Funcao...........: Implementar uma lista encadeada 
*************************************************************** */
public class ListaEncadeada<T> {

  private No<T> head;
  private No<T> tail;

  private int tamanho;

  /*
   * ***************************************************************
   * Metodo: getTamanho
   * Funcao: retornar o tamanho da lista encadeada
   * Parametros: void
   * Retorno: int
   */
  public int getTamanho() {
    return tamanho;
  }

  /*
   * ***************************************************************
   * Metodo: adicionaInicio
   * Funcao: adicionar sempre no inicio da lista um novo No
   * Parametros: objeto que se deseja adicionar no fim da lista
   * Retorno: void
   */
  public void adicionaInicio(T elemento) {
    No<T> celula = new No<T>(elemento);
    if (tamanho == 0) { // se a lista estiver vazia tail recebe o No
      tail = celula;
    } else { // se nao tiver vazia o novo no aponta para o head atual
      celula.setProximo(head);
    }
    head = celula; // head recebe o No , já que esta sendo adicionando no inicio
    tamanho++;
  }

  /*
   * ***************************************************************
   * Metodo: adicionaFim
   * Funcao: adicionar sempre no final da lista um novo No
   * Parametros: objeto que se deseja adicionar no fim da lista
   * Retorno: void
   */


  public void adicionaFim(T elemento) {
    No<T> celula = new No<T>(elemento);
    if (tamanho == 0) { // adiciona elemento no comeco da lista e passa como referencia para o No Head
                        // ja que só existe um elemento
      this.head = celula;
    } else {
      tail.setProximo(celula); // se o a lista nao for fazia passa referencia da Tail para o ultimo
    }
    tail = celula; // tail recebe o ultimo , se a lista tiver comecado vazia o tail e head serao
                   // iguais
    tamanho++; // aumenta o tamanho da celula
  }

 /*
   * ***************************************************************
   * Metodo: adiciona
   * Funcao: adicionar um No na posicao indicada pelo usuario 
   * Parametros: objeto que se deseja adicionar e a posicao desejada
   * Retorno: void
   */
  public void adiciona(T elemeneto, int posicao){

    if(posicao < 0 || posicao > tamanho){
      throw new IllegalArgumentException("Posicao invalida");
    }

    if(tamanho == 0){ // a lista esta vazia logo se tem que adicionar no comeco
      adicionaInicio(elemeneto);
    } else if( posicao == tamanho){ // a posicao desejada é a ultima entao reutilizamos o metodo
      adicionaFim(elemeneto);
    } else{
     No<T> noAnterior = buscaNo(posicao-1); // busca o No da posicao deseja e armazena em noAnterior
     No<T> proximoNo = noAnterior.getProximo(); // No seguinte do no anterior
     No<T> novoNo = new No<T>(elemeneto); // criando o No que vai ser adicionado entre noAnteiror e proximoNo
     novoNo.setProximo(proximoNo);  // setando como referencia o proximoNo , deve sempre setar a referencia do sucessor primeiro para nao se perder as referencias da lista
     noAnterior.setProximo(novoNo); // setando a referencia do noAnterior para o novoNo assim interligando todos
     tamanho++;
    }
  }

 /*
   * ***************************************************************
   * Metodo: removerInicio
   * Funcao: remover o No inicial mudando a referencia da Head
   * Parametros: void
   * Retorno: void
   */
  public void removerInicio(){
    if(tamanho == 0){
      throw new RuntimeException("Lista vazia");
    }
    head = head.getProximo(); 
    tamanho--;
    if(tamanho == 0){ // se apos a remocao a lista estiver vazia head e tail referenciam null
      head = null;
      tail = null;
    }
}

 /*
   * ***************************************************************
   * Metodo: removerFim
   * Funcao: remover o No final mudando a referencia do penultimo para null e atualizando a tail
   * Parametros: void
   * Retorno: void
   */
  public void removerFim(){
   if(tamanho == 0){
      throw new RuntimeException("Lista vazia");
    } 
     if(tamanho == 1){
      removerInicio();
    } 

    No<T> penultimoNo = buscaNo(tamanho -2); // penultimo no
    penultimoNo.setProximo(null);
    tail = penultimoNo;
    tamanho--;
}

/*
   * ***************************************************************
   * Metodo: remove
   * Funcao: remove o No da posicao indicada
   * Parametros: posicao que se deseja remover o NO
   * Retorno: void
   */
public void remove(int posicao) {

       if(posicao < 0 || posicao > tamanho){
      throw new IllegalArgumentException("Posicao invalida");
    }

        if (posicao == 0) {
            removerInicio();
        }
        if (posicao == this.tamanho - 1) {
            removerFim();
        }
        No<T> noAnterior = this.buscaNo(posicao - 1);
        No<T> atual = noAnterior.getProximo();
        No<T> proximo = atual.getProximo();
        noAnterior.setProximo(proximo);
        atual.setProximo(null);
        this.tamanho--;
        
    }

  /*
   * ***************************************************************
   * Metodo: buscaNo
   * Funcao: retorna o No da posicao indicada e como nao queremos que o usario tenha acesso ao no é um metodo private
   * Parametros:  posicao desejada(inteiro)
   * Retorno: No<T> 
   */

  private No<T> buscaNo(int posicao){
    if(posicao >= tamanho && posicao < 0){
      throw new  IllegalArgumentException ("Posição maior do que a lista");
    }
      No<T> atual = head;
       for(int i =0 ; i < posicao ; i++){
        atual = atual.getProximo();
    }

    return atual;
  }
  /*
   * ***************************************************************
   * Metodo: busca
   * Funcao: retorna o elemento da posicao que o usario indicar
   * Parametros:  posicao desejada(inteiro)
   * Retorno: T (object da lista)
   */
  public T busca(int posicao){

    if(posicao >= tamanho && posicao < 0){
      throw new  IllegalArgumentException("Posição Invalida");
    }
     No<T> atual = head;

    for(int i =0 ; i < posicao ; i++){
     atual = atual.getProximo();
    }
    
    return atual.getElemento();
  }


   /*
   * ***************************************************************
   * Metodo: busca
   * Funcao: retorna a posicao do Elemento buscado
   * Parametros:  Elemento onde se deseja saber a posicao
   * Retorno: int 
   */
  public int busca(T elemento){

     No<T> atual = head;
    for(int i = 0 ; i < tamanho ; i++){
      if(atual.getElemento().equals(elemento)){
        return i;
      }
      atual = atual.getProximo();
    }

    return -1;
  }

  /*
   * ***************************************************************
   * Metodo: limparLista
   * Funcao: remover todos os Nos da lista
   * Parametros: void
   * Retorno: void
   ***************************************************************
   */
  public void limparLista() { // a forma mais simples de se limpar a lista é atribuir o valor null para a head
                              // e tail assim fazendo os outros elementos se perderem na lista
    /*
     * head = null;
     * tail = null;
     * tamanho = 0;
     * esta é a forma mais simples só que menos otimizada
     */
    for (No<T> atual = this.head; atual != null;) {
      No<T> proximo = atual.getProximo(); // proximo recebe o No seguinte do atual
      atual.setElemento(null); // transforma em null o elemento atual
      atual.setProximo(null); // remove a referencia do no Atual para o Proximo
      atual = proximo; // o atual vira o proximo assim iterando toda a lista
    }
    head = null;
    tail = null;
    tamanho = 0;

  }

  /*
   * ***************************************************************
   * Metodo: getHead
   * Funcao: retorna o elemento Head da lista
   * Parametros: void
   * Retorno: No
   ***************************************************************
   */
  public T getHead() {
    return head.getElemento();
  }

  /*
   * ***************************************************************
   * Metodo: getTail
   * Funcao: retorna o elemento da tail da lista
   * Parametros: void
   * Retorno: No
   ***************************************************************
   */
  public T getTail() {
    return tail.getElemento();
  }

  /*
   * ***************************************************************
   * Metodo: to String
   * Funcao: Transformar em string o "object" no caso a Lista para facilitar sua
   * leitura em eventuais prints
   * Parametros: void
   * Retorno: String
   */
  @Override
  public String toString() {

    if (tamanho == 0) {
      return "[]";
    }
    StringBuilder builder = new StringBuilder("[");
    No<T> atual = this.head;
    for (int i = 0; i < tamanho - 1; i++) { // para no penultimo elemento , para facilitar a manipulacao de string
      builder.append(atual.getElemento()).append(",");
      atual = atual.getProximo(); // chega no ultimo elemento
    }
    builder.append(atual.getElemento()).append("]"); // evita que saia uma virgula apos o ultimo elemento

    return builder.toString();

  }
}