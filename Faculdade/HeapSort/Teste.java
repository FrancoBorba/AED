package Faculdade.HeapSort;

public class Teste {
  public static void main(String[] args) {
    int vetor[] = new int[20];
    int tamanhoVetor = vetor.length;

    // vetor desordenado
    for( int i =0 ; i < vetor.length ; i++){
      vetor[i] = (int) Math.floor(Math.random() * vetor.length);
    }
    
     for( int i =0 ; i < vetor.length ; i++){
      System.out.print(vetor[i] + "  ");
    }

      for( int i = (vetor.length/2) -1 ; i >= 0 ; i--){
            HeapSort(vetor , tamanhoVetor , i);
    }
    for(int i = tamanhoVetor-1 ; i >0 ; i--){
        int auxiliar = vetor[0];
      vetor[0] = vetor[i];
      vetor[i] = auxiliar;
      HeapSort(vetor, i , 0);
    }

    System.out.println();
     for( int i =0 ; i < vetor.length ; i++){
      System.out.print(vetor[i] + "  ");
    }
  }

  

  public static void HeapSort(int vetor[] , int tamanhoVetor , int i){
   

    int raiz = i;
    int esquerda = 2*i +1;
    int direita = 2*i +2;

    if(esquerda < tamanhoVetor &&  vetor[esquerda] > vetor[raiz]){ // esquerda < tamanhoVetor garante que ainda esta dentro do  vetor
       raiz = esquerda;
    }// fim do if
       
    if(direita < tamanhoVetor && vetor[direita] > vetor[raiz]){  // direita < tamanhoVetor para garantir que ainda esta dentro  do vetor
    raiz = direita;
  }// fim do if

    if(raiz != i){
      int auxiliar = vetor[i];
      vetor[i] = vetor[raiz];
      vetor[raiz] = auxiliar;
      HeapSort(vetor, tamanhoVetor, raiz);  
    }

  }
  
}
