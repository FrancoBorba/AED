package Faculdade.HeapSort;

public class Teste {
  public static void main(String[] args) {
    int vetor[] = new int[20];
   

    // vetor desordenado
    for( int i =0 ; i < vetor.length ; i++){
      vetor[i] = (int) Math.floor(Math.random() * vetor.length);
    }
    
    imprimirArray(vetor);
    ordenar(vetor);

    imprimirArray(vetor);
    
    
  }
   public static void ordenar(int arr[])
    {
        int N = arr.length;

        // Construir heap (reorganizar o array)
        for (int i = N / 2 - 1; i >= 0; i--)
            HeapSort(arr, N, i);

        // Um por um, extraia um elemento do heap
        for (int i = N - 1; i > 0; i--) {
            // Mover a raiz atual para o fim
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Chamar max heapify no heap reduzido
              HeapSort(arr, i, 0);
        }
    }

  
  // esse metodo reorganiza "arvore" em uma max-heap
  public static  void HeapSort(int vetor[] , int tamanhoVetor , int i){
   

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

   public static void imprimirArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
}
