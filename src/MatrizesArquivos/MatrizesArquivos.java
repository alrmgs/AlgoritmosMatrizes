
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizesArquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aléxia e Daniel
 */
public class MatrizesArquivos {

    public int contador(int[][] matrizIlhas) {

        int verificaLinha = matrizIlhas.length;
        int verificaColuna = matrizIlhas[0].length;
        int indiceIlhas = 0;
        boolean[][] verificaIlhas = new boolean[verificaLinha][verificaColuna];

        for (int l = 0; l < verificaLinha; l++) {
            for (int c = 0; c < verificaColuna; c++) {

                if (!verificaIlhas[l][c] && matrizIlhas[l][c] == 1) {
                    procuraIlha(matrizIlhas, verificaIlhas, l, c);
                    indiceIlhas++;
                }
            }
        }
        return indiceIlhas;
    }//fecha contador

    public void procuraIlha(int[][] matrizIlha, boolean[][] verificaIlhas, int verificaLinha, int verificaColuna) {

        if (verificaLinha < 0 || verificaColuna < 0) {
            return;
        }
        if (verificaLinha >= matrizIlha.length || verificaColuna >= matrizIlha[0].length) {
            return;
        }

        if (verificaIlhas[verificaLinha][verificaColuna] == true) {
            return;
        }
        verificaIlhas[verificaLinha][verificaColuna] = true;

        if (matrizIlha[verificaLinha][verificaColuna] == 0) {
            return;
        }

        procuraIlha(matrizIlha, verificaIlhas, verificaLinha + 0, verificaColuna - 1);
        procuraIlha(matrizIlha, verificaIlhas, verificaLinha + 0, verificaColuna + 1);
        procuraIlha(matrizIlha, verificaIlhas, verificaLinha + 1, verificaColuna + 0);
        procuraIlha(matrizIlha, verificaIlhas, verificaLinha - 1, verificaColuna + 0);
    }//fecha prcuraIlha

    /**
     * Responsável pela leitura das matrizes originais, ainda sem contar as
     * ilhas.
     */
    public int[][] leituraMatrizOriginal(String fileName) throws FileNotFoundException, IOException {
        try {

            FileReader arquivo = new FileReader(fileName);
            BufferedReader leituraArquivo = new BufferedReader(arquivo);
            String primeiraLinha = leituraArquivo.readLine();
            String[] divideLinha = primeiraLinha.split(" ");
            int coluna = Integer.parseInt(divideLinha[0]);
            int linha = Integer.parseInt(divideLinha[1]);
            int[][] matrizIlha = new int[linha][coluna];

            for (int l = 0; l < linha; l++) {
                char[] cs = leituraArquivo.readLine().toCharArray();
                for (int c = 0; c < coluna; c++) {
                    matrizIlha[l][c] = Integer.parseInt(String.valueOf(cs[c]));
                }
            }
            arquivo.close();
            return matrizIlha;

        } catch (IOException e) {
            System.err.print(e.getMessage());
            //return new int[0][0];
        }
        return null;
    }//fecha leituraMatrizOriginal

    /**
     * Responsável por exibir matrizes. if responsável por exibibir as colunas e
     * else as linhas. Informa o numero de ilhas contidas na matriz do exemplo
     * 0,1,2,3 e 4.
     */
    public void exibe(int[][] matrizIlhas) {

        for (int l = 0; l < matrizIlhas.length; l++) {
            for (int c = 0; c < matrizIlhas[0].length; c++) {
                if (c == matrizIlhas[0].length - 1) {
                    System.out.println(matrizIlhas[l][c] + "");
                } else {
                    System.out.print("" + matrizIlhas[l][c] + " ");
                }
            }
        }

        System.out.println("\nNumero de ilhas contidas na matriz:" + contador(matrizIlhas));
    }//fecha exibe

}
