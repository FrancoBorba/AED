package Faculdade.Deque;

public class Teste {
  public static void main(String[] args) {
    DequeArray dequeArray = new DequeArray<Integer>(10);


    dequeArray.enfileirarFim(5);
    dequeArray.enfileirarFim(1);
    dequeArray.enfileirarFim(22);


    System.out.println(dequeArray);

    System.out.println("O elemento inicial é : " + dequeArray.getPrimeiro());

    System.out.println("O elemento final é: " + dequeArray.getUltimo());
  
    dequeArray.enfileirarInicio(19);
    dequeArray.enfileirarInicio(43);

    System.out.println(dequeArray);

    System.out.println("O elemento inicial é : " + dequeArray.getPrimeiro());

    System.out.println("O elemento retira foi " + dequeArray.desenfileirarFim()); // tem que sair 22
      System.out.println("O elemento retira foi " + dequeArray.desenfileirarFim()); // tem que sair 1

    System.out.println(dequeArray);
    

   

    dequeArray.fazVazia();

    System.out.println(dequeArray);




  }
}
