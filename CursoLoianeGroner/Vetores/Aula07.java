package Vetores;

public class Aula07 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("a");
        vetor.adiciona("b");
        vetor.adiciona("c");
        vetor.adiciona("d");
        vetor.adiciona("e");
        System.out.println(vetor);

        vetor.adiciona(1 ,"f ");
        System.out.println(vetor);

        vetor.adiciona(4 , "z");
        System.out.println(vetor);
        vetor.adiciona(9,"g");
    }
}
