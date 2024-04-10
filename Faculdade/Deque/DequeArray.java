/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 09/04/2024
* Ultima alteracao.: 09/04/2024
* Nome.............: DequeArray.java
* Funcao...........: Criar um Deque de Array
*************************************************************** */
package Faculdade.Deque;



public class DequeArray<T> extends FilaArray<T> implements IDeque<T> {


  // Eu tive que transformar o array em protecd na classe pai não sei se ta certo
  //private T array[];
 // private int count ;
  
  public DequeArray(int tamanho){
    super(tamanho);
   
  }
  
  /*
   * ***************************************************************
   * Metodo: getUltimo
   * Funcao: retorna o ultimo elemento da fila(tail)
   * Parametros: void
   * Retorno: T(Objeto que está em ultimo)
   * ***************************************************************
   */
  @Override
  public T getUltimo() {
   if(estaVazia()){
    throw new IllegalAccessError("Deque vazio");
   }
    return array[getTail()];
  }

  /*
   * ***************************************************************
   * Metodo: enfileirarInicio
   * Funcao: coloca o elemento no inicio da fila(head)
   * Parametros: elemento a ser adicionado
   * Retorno: void
   * ***************************************************************
   */
  @Override
  public void enfileirarInicio(T objeto) {
     // ao se enfileirar no Inicio eu vou ter que tirar o elemento que já existe???????
     // DUVIDA
    // pensamento do outro dia , só colocar o head como o novo elemento pq não importa onde estao o head e o tail , eles não precisam literalmente ser o primeiro e ultimo e sim funcionar como

     if(getCount() == array.length){   
     throw new IllegalAccessError("Fila cheia");
     }

     if(getCount()==0){
      array[0] = objeto; 
      setHead(0);// como nao possui elementos head passa a ser o primeiro elemento
     }
     for(int i= 0 ; i < array.length ; i++){
      if(array[i] == null){
        array[i] = objeto;
        setHead(i);
        break;
      }
     }


    
    
  }
  
   /*
   * ***************************************************************
   * Metodo: enfileirarFim
   * Funcao: coloca o elemento no fim da fila(tail)
   * Parametros: elemento a ser adicionado
   * Retorno: void
   * ***************************************************************
   */
  @Override
  public void enfileirarFim(T objeto) {
    
    enfileirar(objeto);
    
  }

  /*
   * ***************************************************************
   * Metodo: desenfileirarInicio
   * Funcao: retira o elemento inicial(head)
   * Parametros: void
   * Retorno: Elemento retirado
   * ***************************************************************
   */
  @Override
  public T desenfileirarInicio() { // vai da erro em algumas partes , duvida com o professor
   
    return desenfileirar();
  }

   /*
   * ***************************************************************
   * Metodo: desenfileirarFim
   * Funcao: retira o elemento final(tail)
   * Parametros: void
   * Retorno: Elemento retirado
   * ***************************************************************
   */
  @Override
  public T desenfileirarFim() { // vai da erro em algumas partes , duvida com o professor
    if(getCount() == 0){
       throw new IllegalAccessError("Fila vazia");
    }
    T retorno = array[getTail()];
    array[getTail()] = null;

  
    setTail(getTail()-1);

   
    return retorno;
  }
  
}
