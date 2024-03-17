package Vetores;


/*
  Clase vetor que séra utilizada para a parte de vetores do curso de AED da Loaine Groner

  Nesta Classe serão criados metodos para se manipular o vetor

  */
public class Vetor {
    private Object[] elementos; // sera um etor de object para transformar a classe em mais generica e permitir varios tipos de Arrays
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho =0;
    }


    /* ***************************************************************
    * Metodo: Adiciona
    * Funcao: adicionar valores no vetor
    * Parametros: Recebe como parametro um elemento a ser adicionado no vetor
    * Retorno: true ou false
    *************************************************************** */
    public boolean adiciona(Object elemento){ 
        aumentaCapacidade();
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
    public boolean adiciona(int posicao , Object elemento){
        aumentaCapacidade();
        if(!(posicao >= 0 && posicao < this.tamanho)){ // ao negar se alcança todas posições que não podem fazer parte do vetor
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
    * Metodo: aumentaCapacidade
    * Funcao: aumenta a capacidade do vetor ao tentar adicionar um elemento e verificar que o tamanho dele é igual a capacidade , assim sempre podendo aumentar sua capacidade , pois em grande parte dos projetos e trabalhos é inviavel ficar trabalhando com quantidadas definidas de capacidade em um array;
    * Parametros: não recebe
    * Retorno: void
    *************************************************************** */
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length*2] ; // se cria um novo vetor com o dobro da capacidade do anterior , quando o tamanho do vetor se igual a sua capacidade
            for( int i =0 ; i < tamanho ; i++){
                elementosNovos[i] = this.elementos[i]; // atribuindo os elementos do antigo vetor no novo
            }
            this.elementos = elementosNovos; // atribuindo o novo vetor criado no antigo vetor 
        }
    }

    /* ***************************************************************
    * Metodo: remove
    * Funcao: remove o elemento da posição que está sendo passada como parametro e reealoca todos os elementos uma posição para tras e removendo um do tamanho do vetor 
    * Parametros: posicao a ser removida
    * Retorno: void
    *************************************************************** */
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < this.tamanho)){ // ao negar se alcança todas posições que não podem fazer parte do vetor
            throw new IllegalArgumentException("Posição invalida");
         }
       
         for( int i = posicao; i < tamanho -1 ; i++ ){
            elementos[i] = elementos[i+1];
         }
         this.tamanho--;
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
    public Object busca( int posicao){

        if(!(posicao >= 0 && posicao < this.tamanho)){ // ao negar se alcança todas posições que não podem fazer parte do vetor
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
    public int busca(Object elemento){
       for(int i=0 ; i< this.tamanho ; i++){
        if(elementos[i].equals(elemento)){ // string nao pode usar ==
            return i;
        }
       }
         return  -1;
    }







    /* ***************************************************************
    * Metodo: toString
    * Funcao: Retorna os elementos do vetor em forma de um print  , não retorna a parte não prenchida do vetor(null)
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
