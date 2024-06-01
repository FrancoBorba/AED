/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 24/04/2024
* Ultima alteracao.: 06/05/2024
* Nome.............: Node.java
* Funcao...........: Criar uma arvore binaria
*************************************************************** */

package Faculdade.Hash;

import java.util.LinkedList;
import java.util.Queue;


public class Node<T> {
  private T valor; // valor que sera armazenado
  private Node<T> filho_esq , filho_dir ; // criação de nós filhos(referencias para as sub-arvores)


  // Construtor de uma arvore que não gera sub-arvores
  public Node(T valor){
    this.valor = valor;
    filho_esq = null;
    filho_dir = null;
  }

  // Construtor de uma arvore que adiciona as sub-arvores
  public Node(T valor , Node<T> noEsq , Node<T> noDir){
    this.valor = valor;
    this.filho_esq = noEsq;
    this.filho_dir = noDir;
  }

  /*
   * ***************************************************************
   * Metodo: getValor
   * Funcao: retorna o valor do No
   * Parametros: void
   * Retorno: T
   * ***************************************************************
   */
  public T getValor(){
    return valor;
  }

    /*
   * ***************************************************************
   * Metodo: getFilhoEsquerda
   * Funcao: retorna o No(sub-arvore) a esquerda
   * Parametros: void
   * Retorno: Node<T> (retorna um No )
   * ***************************************************************
   */
  public Node<T> getFilhoEsquerda(){
    return filho_esq;
  }

     /*
   * ***************************************************************
   * Metodo: getFilhoDireita
   * Funcao: retorna o No(sub-arvore) a direita
   * Parametros: void
   * Retorno: Node<T> (retorna um No )
   * ***************************************************************
   */
  public Node<T> getFilhoDireita(){
    return filho_dir;
  }


   /*
   * ***************************************************************
   * Metodo: setValor
   * Funcao: adicionar um valor na RAIZ da arvore
   * Parametros: valor a ser adicionado
   * Retorno: void
   * ***************************************************************
   */
  public void setValor(T valor){
    this.valor = valor;
  }

/*
   * ***************************************************************
   * Metodo: setNoEsquerda
   * Funcao: adicionar uma subarvore a esquerda
   * Parametros: Node a ser adicionado
   * Retorno: void
   * ***************************************************************
   */
  public void setNoEsquerda(Node<T> filhoEsq){
    filho_esq = filhoEsq;
  }

  /*
   * ***************************************************************
   * Metodo: setNoDireita
   * Funcao: adicionar uma subarvore a direita
   * Parametros: Node a ser adicionado
   * Retorno: void
   * ***************************************************************
   */
  public void serNoDireita(Node<T> filhoDir){
    filho_dir = filhoDir;
  }

  /*
   * ***************************************************************
   * Metodo: inserirOrdenado
   * Funcao: inserir valores em uma arvore de forma ordenada
   * Parametros: valor a ser adicionado
   * Retorno: boolean
   * ***************************************************************
   */
  public boolean inserirOrdenado(T valor){
    if(valor.toString().compareTo(this.getValor().toString()) < 0){

      // o valor deve ser inserido sempre a esquerda do No atual
      if(this.getFilhoEsquerda() != null){
        return this.getFilhoEsquerda().inserirOrdenado(valor);     
      } // se nao for nulo continua navegando na arvore ate encontrar uma folha
      else{ // como todos os nos a esquerda estavam preenchidos deve-se criar uma sub-arvore

      Node<T> n = new Node<T>(valor); // cria um novo no já com o valor
      setNoEsquerda(n); // adicionando o no a esquerda
      return true;
      }
    }
    else{ // se cair nesse else e por que deve ser inserido a direita e nao é necessario ser feita a comparacao
    if(this.getFilhoDireita() != null){
      return this.getFilhoDireita().inserirOrdenado(valor); // procura um No a direita e se for nulo adiciona
    } 
    else{ // nao tinha no a direita nulo entao se cria um
    Node<T> n = new Node<T>(valor); // cria o no ja com o valor
    this.serNoDireita(n); // adiciona o no na direita
    return true;

    }

    }
  }

  /*
   * ***************************************************************
   * Metodo: imprimirInOrdem
   * Funcao: imprimir os valores em ordem ( elementos da esquerda , raiz , elemetos da direita)
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  public void imprimirInOrdem(){
    if(this.getFilhoEsquerda() != null){ 
      this.getFilhoEsquerda().imprimirInOrdem();
    }
    System.out.println(this.valor + " "); // visitando a raiz
  

  if(this.getFilhoDireita() !=null){
    this.getFilhoDireita().imprimirInOrdem();
  }
}
/*
   * ***************************************************************
   * Metodo: imprimirEmPreOrdem
   * Funcao: imprimir os valores em ordem (raiz , elementos da esquerda, elementos da direita)
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  public void imprimirEmPreOrdem(){
    System.out.println(this.valor + " "); // visitando a raiz primeiro

    if(this.getFilhoEsquerda() != null){ 
      this.getFilhoEsquerda().imprimirEmPreOrdem();
    }
      if(this.getFilhoDireita() !=null){
    this.getFilhoDireita().imprimirEmPreOrdem();
  }
  }

/*
   * ***************************************************************
   * Metodo: imprimirEmPosOrdem
   * Funcao: imprimir os valores em ordem (elementos a esquerda , elementos a direita , raiz)
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  public void imprimirEmPosOrdem(){
     if(this.getFilhoEsquerda() != null){ 
      this.getFilhoEsquerda().imprimirEmPosOrdem();
    }
      if(this.getFilhoDireita() !=null){
    this.getFilhoDireita().imprimirEmPosOrdem();
  }

  System.out.println(this.valor + " "); // visita a raiz por ultimo
  }




/*
   * ***************************************************************
   * Metodo: imprimirEmLargura
   * Funcao: imprimir os valores com uma busca em largura
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
   public void imprimirEmLargura(){
      Queue<Node<T>> fila = new LinkedList<Node<T>>();
      fila.add(this);
      while(!fila.isEmpty()){
        Node<T> no = fila.poll();
        System.out.print(no.getValor() + " | ");
        if(no.getFilhoEsquerda() != null){
          fila.add(no.getFilhoEsquerda());
        }
        if(no.filho_dir != null){
          fila.add(no.getFilhoDireita());
        }
      }
    }

/*
   * ***************************************************************
   * Metodo: calcularAltura
   * Funcao: calcular a altura (comprimento do caminho mais longo do nó a uma folha.) Em profundidade   
   * Parametros: void
   * Retorno: int
   * ***************************************************************
   */
   protected int calculaAltura() {
       int alturaesquerda=0;
       int alturadireita=0;
               
       if (this.getFilhoEsquerda()!=null)
           alturaesquerda = this.getFilhoEsquerda().calculaAltura()+1;

       //aqui, como vou saber a altura do filho da direita pra eu poder calcular a altura do node
       
       if (this.getFilhoDireita()!=null)
           alturadireita = this.getFilhoDireita().calculaAltura()+1;
         
       
       if (alturaesquerda>alturadireita)
           return alturaesquerda;
       
       else
           return alturadireita;
  }

/*
   * ***************************************************************
   * Metodo: calcularAlturaEmLargura
   * Funcao: calcular a altura (comprimento do caminho mais longo do nó a uma folha).   
   * Parametros: void
   * Retorno: int
   * ***************************************************************
   */
    protected int calculaAlturaEmLargura() {
       
      Queue<Object> f = new LinkedList<Object>();
      Queue<Integer> dist = new LinkedList<Integer>();

      f.offer(this);
      dist.offer(0);

      int altura_maxima = 0;

       while(f.peek()!=null) {
           @SuppressWarnings("unchecked")
          Node<T>  no = (Node<T>)f.poll();
         int dist_pai = (int) dist.poll();
             
           if (no.getFilhoEsquerda()!=null) {
                 f.offer(no.getFilhoEsquerda());
                dist.offer(dist_pai + 1);
             }
                     
            if (no.getFilhoDireita()!=null) {
                      f.offer(no.getFilhoDireita());
                      dist.offer(dist_pai + 1);
             }
       
           // eh folha
           if (dist_pai > altura_maxima) altura_maxima = dist_pai;
         }//while
         return altura_maxima;
    }

    /*
   * ***************************************************************
   * Metodo: calcularTotalNodes
   * Funcao: calcular a quantidade de nodes
   * Parametros: void
   * Retorno: int
   * ***************************************************************
   */
     protected int calculaTotalNodes() {
      int totalesq=0;
      int totaldir=0;  
         
       if (this.getFilhoEsquerda()!=null) {
         totalesq = this.getFilhoEsquerda().calculaTotalNodes();
       }
       if (this.getFilhoDireita()!=null) {
         totaldir = this.getFilhoDireita().calculaTotalNodes();
         }
       
       return totalesq+totaldir + 1;
   }
    /*
   * ***************************************************************
   * Metodo: calcularTotalNodesFolhas
   * Funcao: calcular a quantidade de nodes que são folhas
   * Parametros: void
   * Retorno: int
   * ***************************************************************
   */
   protected int calculaTotalNodesFolhas() {

    int totalesq=0;
    int totaldir=0;
    boolean ehfolha=true;
                     
    if (this.getFilhoEsquerda()!=null) {
        totalesq = this.getFilhoEsquerda().calculaTotalNodesFolhas();
        ehfolha = false;
       }
    if (this.getFilhoDireita()!=null) {
        totaldir = this.getFilhoDireita().calculaTotalNodesFolhas();
        ehfolha = false;
       }
    if (ehfolha) { return 1;}
    else return (totaldir + totalesq);
    }









  /*
   * ***************************************************************
   * Metodo: remover
   * Funcao: remover um No da arvore sem alterar sua estrutura ordenada
   * Parametros: Valor do No que sera removido
   * Retorno: void
   * ***************************************************************
   */


  public boolean remover(T valor){ // Ta dando erro  ):
    Node<T> atual = new Node<>(this.valor); // cria um node com o valor da raiz
    Node<T> paiAtual = null; // cria um node que é o pai do node atual , começa como null ja que o atual é a raiz
    while (atual != null) { // se chegar em null o Valor nao existe
      if(atual.getValor().equals(valor)){ // verifica se encontrou o no e caso sim da break
          break;
      } else if(valor.toString().compareTo(this.getValor().toString()) < 0){ // o valor procurado é menor entao passa para a esquerda
        paiAtual = atual;
          atual = atual.getFilhoEsquerda();
      } else{ // o valor procurado é maior entao passa para a direita
      paiAtual = atual;
        atual = atual.getFilhoDireita();
      }
    }


    if(atual != null){ // se for diferente de null existe um elemento e sera removido

    // não faz diferença o no ter filhos na direita e na esquerda pois só sera utilizado um "tipo" de substituição

      if(atual.getFilhoDireita() != null ){ // tem filhos somente na direita
         Node<T> substituto = atual.getFilhoDireita(); 
          Node<T> paiSubstituto = atual;
          while (substituto.getFilhoEsquerda() != null) {
            paiSubstituto = substituto;
            substituto = substituto.getFilhoEsquerda();
          }
          // fazendo a substituição 
          if(paiAtual != null){ // não ta tirando a raiz
            if(atual.getValor().toString().compareTo(paiAtual.getValor().toString()) == 1){ // atual é maior do que pai atual , logo ta na direita
            paiAtual.serNoDireita(substituto);
          } else{ // se nao o atual esta na esquerda e transforma em null
            paiAtual.setNoEsquerda(substituto);
          }
          } else { // ta tirando a raiz
          atual = substituto;
          }
          
          // removendo o elemento da arvore
            if(substituto.getValor().toString().compareTo(paiSubstituto.getValor().toString()) == 1){ // substituto é maior do que paiSubstituto atual , logo ta na direita
            paiSubstituto.serNoDireita(null);
          } else{ // se nao o atual esta na esquerda e transforma em null
           paiSubstituto.setNoEsquerda(null);
          }
     

        }else if(atual.getFilhoEsquerda() != null){ // tem filhos somente na esquerda
          Node<T> substituto = atual.getFilhoEsquerda(); 
          Node<T> paiSubstituto = atual;
          while (substituto.getFilhoDireita() != null) {
            paiSubstituto = substituto;
            substituto = substituto.getFilhoDireita();
          }
          // fazendo a substituição 
          if(atual.getValor().toString().compareTo(paiAtual.getValor().toString()) == 1){ // atual é maior do que pai atual , logo ta na direita
            paiAtual.serNoDireita(substituto);
          } else{ // se nao o atual esta na esquerda e transforma em null
            paiAtual.setNoEsquerda(substituto);
          }
          // removendo o elemento da arvore
            if(substituto.getValor().toString().compareTo(paiSubstituto.getValor().toString()) == 1){ // substituto é maior do que paiSubstituto atual , logo ta na direita
            paiSubstituto.serNoDireita(null);
          } else{ // se nao o atual esta na esquerda e transforma em null
           paiSubstituto.setNoEsquerda(null);
          }

      } else{ // Não possui filhos
          if(atual.getValor().toString().compareTo(paiAtual.getValor().toString()) == 1){ // atual é maior do que pai atual , logo ta na direita
            paiAtual.serNoDireita(null);
          } else{ // se nao o atual esta na esquerda e transforma em null
            paiAtual.setNoEsquerda(null);
          }
      }

      return true;
    }else{
      return false; // não existia elemento logo não é removido nada
    }

  }
       /*
   * ***************************************************************
   * Metodo: removerNode
   * Funcao: remover um No da arvore sem alterar sua estrutura ordenada
   * Parametros: Valor do No que sera removido
   * Retorno: void
   * ***************************************************************
   esse metodo foi feito pelo professor diferente do metodo remover acima no qual tentei fazer sozinho
   */



     protected AVL<String> removerNode(T v, Node<T> nodepai){
     
       int comparacao = v.toString().compareTo(this.getValor().toString());
       boolean resultado=false;
       
       if (comparacao<0){
          if (this.getFilhoEsquerda()!=null)
          return this.getFilhoEsquerda().removerNode(v,this); // o nó a ser removido ta na subarvore esquerda
            else resultado=false;//o valor nao ta na subarvoreesquerda  
       }
       else if (comparacao>0) {
         if (this.getFilhoDireita()!=null)
             return this.getFilhoDireita().removerNode(v,this); // o valor pode estah na subarvore direita
             else resultado=false;//valor nao foi encontrado               }
        }
        else //o no a ser removido é o atual.
        {
            if ((this.getFilhoEsquerda()==null)&&(this.getFilhoDireita()==null)){
                 //este node é folha, pois os dois filhos sao nulos
                 this.setFilhoNode(nodepai,null);//setar o filho de pai como nulo
                 resultado = true;
               }
               else if ((this.getFilhoEsquerda()!=null)&&(this.getFilhoDireita()==null)){
                 //o node tem o filho da esquerda diferente de nulo e o da direita eh nulo
                 this.setFilhoNode(nodepai,this.getFilhoEsquerda()); //seta o pai o node atual com o filho da esquerda do nodeatual  
                 resultado = true;
               }
               else if ((this.getFilhoEsquerda()==null)&&(this.getFilhoDireita()!=null)){
                 //o node tem o filho da direita diferente de nulo e o da esquerda eh nulo
                 this.setFilhoNode(nodepai,this.getFilhoDireita()); //seta o pai do node atual com o filho da direita do nodeatual
                 resultado = true;  
               }
               else if ((this.getFilhoEsquerda()!=null)&&(this.getFilhoDireita()!=null)){
              //podemos pegar um dos dois nodes a seguir, tanto faz.
                 //Node<String> nEsq = NodeComMaiorValor(nodeatual.getFilho_esq()); //pega o node com maior valor da subarvore esquerda
                 
                   Node<T> menorNodeDir = this.getFilhoDireita().NodeComMenorValor(); //pega o node com menor valor da subarvore da direita
                   Node<T> paiMenorNodeDir;
                   if (menorNodeDir !=this.getFilhoDireita()) { //verifica se o proprio node raiz da subarvore direita eh ou nao o menor valor
                       paiMenorNodeDir = this.getFilhoDireita().acharPai(menorNodeDir);
                   }
                   else paiMenorNodeDir=this;
                   
                   this.setValor(menorNodeDir.getValor());//coloca o novo valor no nodeatual.
                   /*
                    * Se menorNodeDir eh o menor valor da subarvore direita, entao menorNodeDir nao tem filhos a esquerda porque
                    * o menor valor de uma arvore eh o node mais a esquerda dessa arvore
                    * sendo assim, eu já sei que o menorNodeDir tem no maximo um filho a direita
                    * ou ele eh um node folha.
                    * Sendo assim posso setar diretamente o filho (direita) do paiMenorNoDir com o filho da direita do menorNodeDir
                    */
                 
                   menorNodeDir.setFilhoNode(paiMenorNodeDir,menorNodeDir.getFilhoDireita()); //seta o pai do menorNode com o filho da direita
                  //menorNodeDir.removerNode(menorNodeDir.getValor(), paiMenorNodeDir)
                   resultado = true;
                   }
                 
               }
   
       return null;
}


  /*
   * ***************************************************************
   * Metodo: setFilhoNode
   * Funcao: adicionat um no filho em relacao ao no Pai passado como parametro,seta o filho de um node pai como sendo o novo node
   * Parametros: NodePai , e novoNode que sera o filho
   * Retorno: void
   * ***************************************************************
   */

protected void setFilhoNode(Node<T> nodePai, Node<T> novoNode) {

       if (nodePai.getFilhoEsquerda()==this) {
             nodePai.setNoEsquerda(novoNode);}
       else
       if (nodePai.getFilhoDireita()==this) {    
           nodePai.serNoDireita(novoNode);}
}

  /*
   * ***************************************************************
   * Metodo: NodeComMaiorValor
   * Funcao: retornar o Node com maior valor
   * Parametros: void
   * Retorno: Node , retorna o No com maior valor
   * ***************************************************************
   */

protected Node<T> NodeComMaiorValor() {
 if (this.getFilhoDireita()!= null) {
           return this.getFilhoDireita().NodeComMaiorValor();          
        }
 else return this;
}//fim algotimo

/*
   * ***************************************************************
   * Metodo: NodeComMenorValor
   * Funcao: retornar o Node com menor valor
   * Parametros: void
   * Retorno: Node , retorna o No com menor valor
   * ***************************************************************
   */
protected Node<T> NodeComMenorValor() {
       if (this.getFilhoEsquerda()!= null) {
            return this.getFilhoEsquerda().NodeComMenorValor();
     } else return this;
    }//fim algotimo

    /*
   * ***************************************************************
   * Metodo: acharPai
   * Funcao: retornar o Node com maior valor
   * Parametros: void
   * Retorno: Node , retorna o No com maior valor
   * ***************************************************************
   */
   protected Node<T> acharPai(Node<T> nofilho) {
    /*
       Esse algoritmo retorna o pai do Node noFilho
       O algoritmo verifica se o node do contexto de execução do metodo
       node This eh pai (pela esquerda ou pela direita) do nofilho.  
 */  

       if (this.getFilhoEsquerda() == nofilho || this.getFilhoDireita() == nofilho) {
          return this;
        } else
          {
          if (nofilho.getValor().toString().compareTo(this.getValor().toString()) > 0) {
              //o valor do no do atual contexto é maior que o nofilho, entao o pai estah do lado esquerdo
             if (this.getFilhoEsquerda() != null) {
              return this.getFilhoEsquerda().acharPai(nofilho);
            } else {
              return null;//pode ser que o nofilho nao esta na arvore ou ele eh o no raiz
            }
          } else {// subarvore direita
            if (this.getFilhoEsquerda() != null) {
              return this.getFilhoDireita().acharPai(nofilho);
            } else {
              return null; //pode ser que o nofilho nao esta na arvore ou ele eh o no raiz
            }
          }
        }
 

      
}
}

