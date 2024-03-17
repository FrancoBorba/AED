package Vetores;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("a");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("d"); // o a capacidade é aumentada já que se add um quarto elemento em um vetor de capacidade 3
        vetor.adiciona("e");

        vetor.adiciona(2, "z");
        System.out.println(vetor);
    }
}
