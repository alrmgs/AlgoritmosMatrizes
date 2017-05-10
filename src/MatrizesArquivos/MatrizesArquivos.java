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

/**
 *
 * @author alexia-gomes
 */
public class MatrizesArquivos {

    public int contador(int[][] matrizIlhas) {

        int verificaLinha = matrizIlhas[0].length;
        int verificaColuna = matrizIlhas.length;
        int indiceIlhas = 0;
        boolean[][] verificaIlhas = new boolean[verificaLinha][verificaColuna];

        for (int l = 0; l < verificaLinha; l++) {
            for (int c = 0; c < verificaColuna; c++) {
                if (!verificaIlhas[l][c] && matrizIlhas[l][c] == 1) {
                    indiceIlhas++;
                }
            }
        }//fecja for

        return 0;
    }//fecha contador

    public void procuraIlha(int[][] matrizIlhas, boolean[][] verificaIlhas, int verificaLinha, int verificaColuna) {

        if (verificaLinha < 0 || verificaColuna < 0) {
        }

        if (verificaLinha >= matrizIlhas.length || verificaColuna >= matrizIlhas[0].length) {
        }

        if (verificaIlhas[verificaLinha][verificaColuna] == true) {
            verificaIlhas[verificaLinha][verificaColuna] = true;
        }

        if (matrizIlhas[verificaLinha][verificaColuna] == 0) {

            procuraIlha(matrizIlhas, verificaIlhas, verificaLinha + 0, verificaColuna - 1);
            procuraIlha(matrizIlhas, verificaIlhas, verificaLinha + 0, verificaColuna + 1);
            procuraIlha(matrizIlhas, verificaIlhas, verificaLinha + 1, verificaColuna + 0);
            procuraIlha(matrizIlhas, verificaIlhas, verificaLinha - 1, verificaColuna + 1);
        }
    }

    public int[][] leituraMatrizOriginal(String fileName) throws FileNotFoundException, IOException {

        BufferedReader buffer = null;

        while (true) {
            try {

                System.out.println(" ");
                String nomeArquivo = null;

                buffer = new BufferedReader(new FileReader(nomeArquivo + ".txt"));

                String arquivoLinhas = buffer.readLine();
                String[] tamanhoMatriz = arquivoLinhas.split(" ");
                int coluna = Integer.parseInt(tamanhoMatriz[0]);
                int linha = Integer.parseInt(tamanhoMatriz[1]);
                String[][] matriz = new String[linha][coluna];

                int indiceColuna = 0;

                while ((arquivoLinhas = buffer.readLine()) != null) {
                    String[] testaLinhas = arquivoLinhas.split("");
                    for (int indiceLinha = 0; indiceLinha < testaLinhas.length; indiceLinha++) {
                        matriz[indiceColuna][indiceLinha] = testaLinhas[indiceLinha];
                    }
                    indiceColuna++;
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }//fecha leituraMatrizOriginal

    public void exibeMatrizes(int[][] matrizIlhas) {
        for (int l = 0; l < matrizIlhas.length; l++) {
            for (int c = 0; c < matrizIlhas[0].length; c++) {

                if (c == matrizIlhas[0].length - 1) {
                    System.out.println(matrizIlhas[l][c] + "");
                } else {
                    System.out.println("" + matrizIlhas[l][c] + "");
                }

            }
        }

        System.out.println("Número de ilhas contidas nesta matriz: " + contador(matrizIlhas));
    }


}//fecha contador
