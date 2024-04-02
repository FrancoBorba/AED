public class PilhaArray<T> implements IPilha<T>{
  private Object array; // cria o array
  private int count; // variavel de controle do tamanho

  public PilhaArray(int tamanho){
    count =0;
    array = new Object[tamanho];
  }
  @Override
  public boolean estaVazia() {
    return false;
  }

  @Override
  public void fazVazia() {
    
  }

  @Override
  public T getTop() {
    return null;
  }

  @Override
  public void push(T object) {
  
  }

  @Override
  public T pop() {
  return null;
  }



}
