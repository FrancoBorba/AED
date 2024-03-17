package Vetores;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("a");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("d");
        vetor.adiciona("e");

        System.out.println(vetor);

        vetor.remove(3); // removendo a posicao 3
        vetor.remove(3); // removendo a posicao 3 de novo

        System.out.println(vetor);
        
        vetor.remove(3); // vai da erro pois o tamanho do vetor ja é menor do que 4 , logo a posicao 3 não existe
        System.out.println(vetor);
    }
}
