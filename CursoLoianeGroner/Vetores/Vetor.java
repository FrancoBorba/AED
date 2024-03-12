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
    * Retorno: não retorna valor
    *************************************************************** */
    public void adiciona(String elemento) throws Exception{ //é possivel fazer com retorno de boolean
        // Em java quando se iniciar um vetor de String por padrão todas posicoes serão null

        if(this.tamanho < this.elementos.length){ // verifica se o "tamanho real" do vetor é menor do que a capacidade dele
           this.elementos[this.tamanho] = elemento; // adiciona o elemento na primeira posicao disponivel do vetor
        this.tamanho++; 
        } 
        else{
            throw new Exception("Vetor já está cheio impossivel adicionar mais elementos"); 
            // lançamaneto de Exception caso adicione um elemento se o vetor estiver na sua capacidade maxima
        }  
    }
   
    

}
