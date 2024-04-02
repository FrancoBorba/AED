/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 02/04/2024
* Ultima alteracao.: 02/04/2024
* Nome.............: PilhaAray.java
* Funcao...........: Cria a pilha com uma estrutura de dados de Array
*************************************************************** */

import java.util.Arrays;

public class PilhaArray implements IPilha{
  private Object array[]; // cria o array
  private int count; // variavel de controle do tamanho

  public PilhaArray(int tamanho){
    count =0;
    array = new Object[tamanho];
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

    return count ==0; // se o contador for 0 retona true , se nao retorna false
  }

 /*
   * ***************************************************************
   * Metodo: fazVazia
   * Funcao: Limpar a pilha
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  @Override
  public void fazVazia() {
    while (count > 0) {
      array[--count] = null; // diminui o contador e transforma o index em null
    }
  }

  @Override
  public Object getTop() {
    if(count == 0){
      throw new IndexOutOfBoundsException("PILHA VAZIA"); // lanca excessao pois nao existe elemento para ser retirado
    }
    return array[count-1];
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
  public void push(Object object) {
  if(array.length == count){
    throw new IndexOutOfBoundsException("PILHA CHEIA"); // lanca excessao caso a pilha esteja cheia
  }
  array[count] = object; // adiciona o objeto No topo(Se for escolha do progamador se adiciona sempre em cima ou em baixo)
  count++; // aumenta o contador parra sabe quantos elemento se tem
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
    
    if(count == 0){
      throw new IndexOutOfBoundsException("PILHA VAZIA"); // lanca excessao pois nao existe elemento para ser retirado
    }
    count --; // diminui um do controle
    Object topo = array[count]; // armazena a varizavel a ser removida em uma para ser retornada
    array[count] = null; // transforma em null o topo
    
    return topo; // retorna o elemento do topo
  }
  @Override
  public String toString() {
    return "PilhaArray [array=" + Arrays.toString(array) + "]";
  }



}
