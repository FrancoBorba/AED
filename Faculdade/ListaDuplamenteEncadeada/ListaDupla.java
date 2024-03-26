/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 26/03/2023
* Ultima alteracao.: 26/03/2023
* Nome.............: ListaDupla
* Funcao...........: Implementar uma lista dupla encadeada 
*************************************************************** */

public class ListaDupla {
  private No head, tail;
  private int tamanho;


  /*
   * ***************************************************************
   * Metodo: buscaNo
   * Funcao: retorna o No da posicao indicada e como nao queremos que o usario tenha acesso ao no é um metodo private
   * Parametros:  posicao desejada(inteiro)
   * Retorno: No
   */
  public No buscarNo(Object elemento){
    
    No celula = head;  // cria um No e passa como referencia a Head para se começar a busca
    for(int i =0 ; i < tamanho ; i++){
      if((celula.elemento).equals(elemento)){ // verifica se o elemento do No atual é igual ao do 
      return celula; // retorna o No 
      }
      celula = celula.sucessor; // percorre a lista enquanto não achar o elemento incrementando os No
    }
    return null;

  }

/*
   * ***************************************************************
   * Metodo: remover
   * Funcao: remover um No da lista não importando sua posicao
   * Parametros:  Objeto que sera utilizado para encontrar o No
   * Retorno: void
   */
  public void remover(Object elemento){
    No celula = head;
    while (celula != null && celula.elemento != elemento) {
      celula = celula.sucessor;
    }
  if (celula == null) {
    throw new IllegalArgumentException("Elemento Não está Na lista");
  }
  if(celula == head){ // caso em que se deseja remover o primiero 
    head = celula.sucessor; // passa a referencia da head(No) para o segundo No
    head.anterior = null; // passa a referencia anterior da head para null assim isolando a celula , já que a referencia sucessora ja esta aplicada pois este é o segundo no 
  }
   else if(celula == tail){
    tail = celula.anterior; // passa a referencia da Tail para o penulitmo
    tail.sucessor = null; // passa a referencia sucessora para null assim isolando o ultimo no , já que a referencia antecessora ja esta ligada
  } else{
    (celula.anterior).sucessor = celula.sucessor; // aponta a referencia sucessora da celula de tras para a da frente(confuso escrever)
    (celula.sucessor).anterior = celula.anterior; // aponta a referencia antecessora de celula da frente para a de tras
  }
  tamanho--; // diminui o tamanho da lista
  }

  /*
   * ***************************************************************
   * Metodo: inserirInicio
   * Funcao: adicionar sempre no inicio da lista um novo No
   * Parametros: objeto que se deseja adicionar no inicio da lista
   * Retorno: void
   */
  public void inserirInicio(Object elemento) {
    No celula = new No(elemento, null, head); // como esta inserindo no inicio a referencia sucessora sera para o head
                                              // caso existe a anterior séra sempre null

    if (head == null) {// a lista esta vazia nesse caso , pode verificar pelo tamhanho tambem
      tail = celula; // como sera o primeiro elemento head e tail apontam para ele
    } else {
      head.anterior = celula; // caso ja exista um elemento inicial(Head) a referencia anterior do head aponta
                              // para o novo no criado
    }
    head = celula;// atualiza o head já que o novo No vai ser o elemento inicial
    tamanho++; // aumenta o tamanho
  }

  /*
   * ***************************************************************
   * Metodo: adicionaFim
   * Funcao: adicionar sempre no final da lista um novo No
   * Parametros: objeto que se deseja adicionar no fim da lista
   * Retorno: void
   */
  public void inserirFim(Object elemento) {
    No celula = new No(elemento, tail, null); // como esta sendo inserido no ultimo a referencia sucessora sempre sera
                                              // null e a anterior sempre sera para a tail;

    if (head == null) {// a lista esta vazia nesse caso , pode verificar pelo tamhanho tambem
      head = celula; // se a lista estiver vazia o head e tail terao a mesma referencia
    } else {
      tail.sucessor = celula; // se ja houver algum elemento como esta sendo adicionado no final , apenas a
                              // referencia para o No seguinte deve ser atualizada
    }
    tail = celula; // atualiza o tail
    tamanho++; // aumenta o tamanho
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
    No atual = this.head;
    for (int i = 0; i < tamanho - 1; i++) { // para no penultimo elemento , para facilitar a manipulacao de string
      builder.append(atual.elemento).append(",");
      atual = atual.sucessor; // chega no ultimo elemento
    }
    builder.append(atual.elemento).append("]"); // evita que saia uma virgula apos o ultimo elemento

    return builder.toString();

  }

  public final class No {
    Object elemento;
    No sucessor, anterior;

    No(Object elemento) { // esse construtor passa apenas o elemento do No e refencia o anterior e proximo
                          // como null , sendo assim tendo que ser feito manualmente a referencia
      this.elemento = elemento;
      this.sucessor = null;
      this.anterior = null;
    }

    No(Object elemento, No anterior, No sucessor) { // esse construtor passa como parametro alem do objeto as
                                                    // referencias anteriores e sucessoras do No criado , assim quando
                                                    // for se inserir apenas se manipula os Nos sucessores e anteriores
      this.elemento = elemento;
      this.anterior = anterior;
      this.sucessor = sucessor;
    }


      /*
   * ***************************************************************
   * Metodo: inserirDepois
   * Funcao: adicionar sempre depois do No que foi utilizado para chamar ( Nao tenho certeza)
   * Parametros: Object que ira no No
   * Retorno: void
   */
 public void inserirDepois (Object item){

      No celula = new No(item, this, sucessor); 
      sucessor = celula;
      if(tail == this){
        tail= sucessor;
      }
      else{
        celula.sucessor.anterior = celula;
      }

}
   /*
   * ***************************************************************
   * Metodo: inserirAntes
   * Funcao: adicionar sempre antes do No que foi utilizado para chamar ( Nao tenho certeza)
   * Parametros: Object que ira no No 
   * Retorno: void
   */
public void inserirAntes(Object item){
  No celula = new No(item, anterior, this);

  anterior = celula;
  if(this == head){
    head = anterior;
  }
  else{
    (celula.anterior).sucessor = celula;
  }



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
      return "No [elemento=" + elemento + ", sucessor=" + sucessor + ", anterior=" + anterior + "]";
    }

  }
}
