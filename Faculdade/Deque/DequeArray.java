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

  private T array[];
  private int count;
  
  public DequeArray(int tamanho){
    super(tamanho);
  }
  
  @Override
  public T getUltimo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getUltimo'");
  }

  @Override
  public void enfileirarInicio(T objeto) {
     // ao se enfileirar no Inicio eu vou ter que tirar o elemento que já existe???????
     // DUVIDA

    
    
  }
  
  @Override
  public void enfileirarFim(T objeto) {
    
    enfileirar(objeto);
    
  }

  @Override
  public T desenfileirarInicio() {
   return desenfileirar();
  }

  @Override
  public T desenfileirarFim() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'desenfileirarFim'");
  }
  
}
