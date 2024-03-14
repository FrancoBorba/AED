package Vetores;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("a");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("d");
        vetor.adiciona("e");

        System.out.println(vetor.busca("d") ); // retorna a posicao que o elemento esta
        System.out.println(vetor.busca("o") ); // retorna -1 já que o elemento nao esta no vetor
    }
}
