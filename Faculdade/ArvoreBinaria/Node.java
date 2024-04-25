/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 24/04/2023
* Ultima alteracao.: 24/04/2023
* Nome.............: Node.java
* Funcao...........: Criar uma arvore binaria
*************************************************************** */
package Faculdade.ArvoreBinaria;

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
   * Funcao: imprimir os valores em ordem
   * Parametros: void
   * Retorno: void
   * ***************************************************************
   */
  public void imprimirInOrdem(){
    if(this.getFilhoEsquerda() != null){ 
      this.getFilhoEsquerda().imprimirInOrdem();
    }
    System.out.println(this.valor + " ");
  

  if(this.getFilhoDireita() !=null){
    this.getFilhoDireita().imprimirInOrdem();
  }
}

}