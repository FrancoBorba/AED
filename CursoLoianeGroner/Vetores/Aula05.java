package Vetores;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("a");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("d");
        vetor.adiciona("e");

        System.out.println(vetor.busca(2));
        System.out.println(vetor.busca(20)); // Posicao invalida
    }
}
