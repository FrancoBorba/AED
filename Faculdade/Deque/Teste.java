package Faculdade.Deque;

public class Teste {
  public static void main(String[] args) {
    DequeArray dequeArray = new DequeArray<Integer>(10);


    dequeArray.enfileirarFim(5);
    dequeArray.enfileirarFim(1);
    dequeArray.enfileirarFim(22);

    System.out.println(dequeArray);

    System.out.println("O elemento inicial é : " + dequeArray.getPrimeiro());

   

    dequeArray.fazVazia();

    System.out.println(dequeArray);




  }
}
