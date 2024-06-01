package Faculdade.Hash;

public class Teste {
  public static void main(String[] args) {
     int M = 13; // Exemplo de tamanho da tabela hash
    Hash hF = new Hash(M);
    hF.inserir("Carlos");
    hF.inserir("Raissa");
    hF.inserir("Mariana");
    hF.inserir("Franco");
    hF.inserir("COrdeiro");
    hF.inserir("Arthur");

    System.out.println("\nTabela Hash: \n");

    for (int i = 0; i < hF.m; i++) {
      if (hF.tabelaHash[i] != null) {
        System.out.println(hF.tabelaHash[i].StringK());
      } else
        System.out.println("-------");
    }
    System.out.println();

    hF.remover("COrdeiro");

    hF.imprimir();

  }
}