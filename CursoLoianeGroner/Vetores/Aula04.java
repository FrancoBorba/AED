package Vetores;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5); // capacidade do vetor =5
        vetor.adiciona("1");
        vetor.adiciona("2");
        vetor.adiciona("3");
        System.out.println(vetor.getTamanho()); // retorna 2 , o tamanho do vetor
        System.out.println(vetor);
        
   
    }
}
