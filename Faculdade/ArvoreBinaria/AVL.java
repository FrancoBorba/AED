package Faculdade.ArvoreBinaria;

public class AVL<T> extends Node<T> {

/*
 * A classe Node AVL herda de Node.
 * É adicionado nessa classe o fato de balancamento.
 */
    private int fatorbalanceamento = 0;
    //private AVL<T> pai;

  public AVL(T valor) {
    super(valor);
    this.fatorbalanceamento =0;
  }

    /*
   * ***************************************************************
   * Metodo: getFilhoDireita
   * Funcao: retorna o No(sub-arvore) a direita
   * Parametros: void
   * Retorno: Node<T> (retorna um No )
   * ***************************************************************
   */
    //o metodo getfilho é reescrito para retornar um node AVL
    public AVL<T> getFilho_dir() {
           return (AVL<T>)super.getFilhoDireita();
}

 /*
   * ***************************************************************
   * Metodo: getFilhoEsquerda
   * Funcao: retorna o No(sub-arvore) a esquerda
   * Parametros: void
   * Retorno: Node<T> (retorna um No )
   * ***************************************************************
   */
   //o metodo getfilho é reescrito para retornar um node AVL
    public AVL<T> getFilho_esq() {
           return (AVL<T>)super.getFilhoEsquerda();
}

  
   /*
   * ***************************************************************
   * Metodo: getFB
   * Funcao: retorna o fator de balançeamento
   * Parametros: void
   * Retorno : int
   * ***************************************************************
   */
      //fator de balanceamento de cada no AVL
    public int getFB() { 
      return this.fatorbalanceamento;
}


 
   /*
   * ***************************************************************
   * Metodo: inserirOrdenado
   * Funcao: inseirir elementos na arvore de forma que ela esteja sempre balanceada
   * Parametros: valor , node pai do valor
   * Retorno:  boolean
   * ***************************************************************
   */
 //reescreveremos o metodo inserir para atualizar o fator de balanceamento apos a insercao
    protected boolean InsereOrdenado(T v, AVL<T> nodepai ) {
          boolean resultado;
       
          if (v.toString().compareTo(this.getValor().toString())<0) {  
              //o valor deve ser inserido a esquerda do no atual
            if (this.getFilho_esq()!=null) {                    
                resultado = this.getFilho_esq().InsereOrdenado(v,this);//senao for nulo continua navegando na arvore ate encontrar uma folha
                this.verificarbalanceamento(nodepai);//verifica balanceamento e rotaciona se necessario.
                return resultado;                    
            }
            else {
              AVL<T> n = new AVL<T>(v);//se for nulo, cria o no e adiciona na folha
              this.setNoEsquerda(n);
              return true;                            
             }
          }
   
          else {
               //o valor deve ser inserido a direita atual
                if (this.getFilho_dir()!=null) {
                      resultado = this.getFilho_dir().InsereOrdenado(v,this);
                      this.verificarbalanceamento(nodepai);//verifica e o balanceamento e rotaciona se necessario
                      return resultado;
                  }
                 else {
                      AVL<T> n = new AVL<T>(v);
                      this.serNoDireita(n);                          
                      return true;            
                    }          

          }
           
       }
       
    /*
   * ***************************************************************
   * Metodo: calcularFatorBalanceamento
   * Funcao: calcular o fator balanceamento de uma arvore , ma arvore esta balanceada se o fator balanceamentoe estiver entre -1 ,0 ,1
   * esse metodo apenas calcula o faot para depois ser feito uma verificação em metodos separados
   * Parametros: void
   * Retorno: int
   * ***************************************************************
   */
    private int calculaFatorBalanceamento() {
        int alturaesq = 0;
        int alturadir = 0;
        if (this.getFilho_esq()!=null)
            alturaesq = this.getFilho_esq().calculaAltura();            
        if (this.getFilho_dir()!=null)
            alturadir = this.getFilho_dir().calculaAltura();
        this.fatorbalanceamento = alturadir-alturaesq;
        return this.fatorbalanceamento;
    }

     /*
   * ***************************************************************
   * Metodo: verificarFatorBalanceamento
   * Funcao: verificar o fator balanceamento de uma arvore , ma arvore esta balanceada se o fator balanceamentoe estiver entre -1 ,0 ,1
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  private void verificarbalanceamento(AVL<T> nopai) {
     
     int fb = this.calculaFatorBalanceamento();
     int fb1=0;
     if ((fb<-1)||(fb>1)){//verificar se ha desbalanceamento.
         if (fb>1) { //o lado direito é bem maior
            if (this.getFilho_dir()!=null) {
                fb1 = this.getFilho_dir().calculaFatorBalanceamento();
            if (fb1<0)
                 this.rotacaoDuplaAEsquerda(nopai);
            else this.rotacaoAEsquerda(nopai);            
            }
             
         }
         else { //fb<-1
            fb1=0;
            if (this.getFilho_esq()!=null)
              fb1 = this.getFilho_esq().calculaFatorBalanceamento();
            if (fb1>0)
                this.rotacaoDuplaADireita(nopai);
            else this.rotacaoADireita(nopai);
         }
     }
    }


     /*
   * ***************************************************************
   * Metodo: rotacaoAEsquerda
   * Funcao: fazemos uma rotacao dos elementos para a esquerda dessa forma balanceando a arvore
   * Parametros: nodePai
   * Retorno: void
   * ***************************************************************
   */
    private void rotacaoAEsquerda(AVL<T> nopaideA) {
        AVL<T> novaraizB =  this.getFilho_dir();//filho da direita sera a nova raiz
        AVL<T> tempA = this;//raiz da rotacao
        if (novaraizB!=null) {              
          nopaideA.setFilhoNode(this, novaraizB);//o filho da direita vira a raiz
          tempA.serNoDireita(novaraizB.getFilho_esq());//filho da esquerda da nova raiz vira filho da direita da antiga raiz    
          novaraizB.setNoEsquerda(tempA);//no A vira filho da direita da nova raizB                  
        }
        //if f
    }
   

      /*
   * ***************************************************************
   * Metodo: rotacaoADireita
   * Funcao: fazemos uma rotacao dos elementos para a direita dessa forma balanceando a arvore
   * Parametros: nodePai
   * Retorno: void
   * ***************************************************************
   */
    private void rotacaoADireita(AVL<T> nopaideC) {
        AVL<T> novaraizB =  this.getFilho_esq();//filho da esquerda sera a nova raiz
        AVL<T> tempC = this;//raiz da rotacao
        if (novaraizB!=null) {              
          nopaideC.setFilhoNode(this, novaraizB);//o filho da direita vira a raiz
          tempC.setNoEsquerda(novaraizB.getFilho_dir());//filho da direita da nova raiz vira filho da Esquerda da antiga raiz    
          novaraizB.serNoDireita(tempC);//                  
        }
        //if f    
    }
   
    
   /*
   * ***************************************************************
   * Metodo: rotacaoDuplaAEsquerda
   * Funcao: fazemos uma rotacao dos elementos para a direita e depois uma rotacao a esquerda dessa forma balanceando a arvore
   * Parametros: nodePai
   * Retorno: void
   * ***************************************************************
   */
    private void rotacaoDuplaAEsquerda(AVL<T> nopaideA) {
        //rotacao simples a direita no filho da direita.
        this.getFilho_dir().rotacaoADireita(this);
        //rotacao a esquerda na arvore original
        this.rotacaoAEsquerda(nopaideA);
    }
   
    
      /*
   * ***************************************************************
   * Metodo: rotacaoDuplaADireita
   * Funcao: fazemos uma rotacao dos elementos para a esquerda e depois uma rotacao a direita dessa forma balanceando a arvore
   * Parametros: nodePai
   * Retorno: void
   * ***************************************************************
   */
    private void rotacaoDuplaADireita(AVL<T> nopaideA) {
        //rotacao simples a esquerda no filho da esquerda
        this.getFilho_esq().rotacaoAEsquerda(this);
        //rotacao a esquerda na arvore original
        this.rotacaoADireita(nopaideA);        
    }
 

   


  
}
