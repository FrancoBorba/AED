/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 24/04/2023
* Ultima alteracao.: 25/04/2023
* Nome.............: Node.java
* Funcao...........: Criar uma arvore binaria
*************************************************************** */

package Faculdade.ArvoreBinaria;

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
     
      
}

