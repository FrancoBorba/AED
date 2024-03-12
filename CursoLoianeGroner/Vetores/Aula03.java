package Vetores;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        try {
             vetor.adiciona("1"); // adicionado "1" na posicao 0 
        vetor.adiciona("2"); // adicionando "2" na posicao 1
        } catch (Exception e) {
            
           e.printStackTrace(); 
        }
        
       
        
    }
}
