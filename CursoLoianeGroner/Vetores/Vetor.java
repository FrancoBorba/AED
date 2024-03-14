package Vetores;


/*
  Clase vetor que séra utilizada para a parte de vetores do curso de AED da Loaine Groner

  Nesta Classe serão criados metodos para se manipular o vetor

  */
public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho =0;
    }


    /* ***************************************************************
    * Metodo: Adiciona
    * Funcao: adicionar valores no vetor
    * Parametros: Recebe como parametro um elemento a ser adicionado no vetor
    * Retorno: true ou false
    *************************************************************** */
    public boolean adiciona(String elemento){ 
        // Em java quando se iniciar um vetor de String por padrão todas posicoes serão null

        if(this.tamanho < this.elementos.length){ // verifica se o "tamanho real" do vetor é menor do que a capacidade dele
           this.elementos[this.tamanho] = elemento; // adiciona o elemento na primeira posicao disponivel do vetor
        this.tamanho++; 
        return true;
        } 
        
    return false;
    
    
}

     /* ***************************************************************
    * Metodo: Adiciona
    * Funcao: adicionar valores no vetor na funcao indicada
    * Parametros: Recebe como parametro um elemento a ser adicionado no vetor e a posicao a ser adicionado
    * Retorno: true ou false
    *************************************************************** */
    public boolean adiciona(int posicao , String elemento){
        if(!(posicao >= 0) && (posicao < this.tamanho)){ // ao negar se alcança todas posições que não podem fazer parte do vetor
            throw new IllegalArgumentException("Posição invalida");
         }
         
         for(int i= tamanho-1 ; i >= posicao ; i-- ){
            this.elementos[i+1] = this.elementos[i];
         }
         this.elementos[posicao] = elemento;
         tamanho++;

    return false;
    }



     /* ***************************************************************
    * Metodo: getTamanho
    * Funcao: retorna o tamanho do vetor , não sua capacidade
    * Parametros: não recebe
    * Retorno:  int
    *************************************************************** */
    public int getTamanho(){
        return this.tamanho;
    }

  /* ***************************************************************
    * Metodo: busca
    * Funcao: buscar e retorna um elemento na sua posicao indicada
    * Parametros: int posicao(posicao desejada que se busque)
    * Retorno:  String
    *************************************************************** */
    public String busca( int posicao){

        if(!(posicao >= 0) && (posicao < this.tamanho)){ // ao negar se alcança todas posições que não podem fazer parte do vetor
           throw new IllegalArgumentException("Posição invalida");
        }
        return elementos[posicao]; 
    }

    /* ***************************************************************
    * Metodo: busca sobrecarregado
    * Funcao: buscar e retorna se um elemento existe no vetor
    * Parametros: String do elemento que se desaja encontrar
    * Retorno:  retorna a posicao que o elemento foi encontrado
    *************************************************************** */
    public int busca(String elemento){
       for(int i=0 ; i< this.tamanho ; i++){
        if(elementos[i].equals(elemento)){ // string nao pode usar ==
            return i;
        }
       }
         return  -1;
    }







    /* ***************************************************************
    * Metodo: toString
    * Funcao: Retorna os elementos do vetor , não retorna a parte não prenchida do vetor(null)
    * Parametros: não recebe
    * Retorno: Vetor de String
    *************************************************************** */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0 ; i < this.tamanho -1 ; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");


        return s.toString();
    }
   
    

}
