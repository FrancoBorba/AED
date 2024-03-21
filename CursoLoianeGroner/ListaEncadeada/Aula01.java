public class Aula01 {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    @SuppressWarnings("rawtypes")
    ListaEncadeada lista = new ListaEncadeada<Integer>();

    lista.adiciona(1);

    System.out.println(lista);
  }
}
