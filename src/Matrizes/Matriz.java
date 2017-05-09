/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrizes;

/**
 *
 * @author alexia-gomes
 */
public class Matriz {

    public int ilhas(int[][] matriz) {

        int linha = matriz.length;
        int coluna = matriz[0].length;
        int indiceLinha = 0;
        int indiceColuna = 0;
        int indiceIlha = 0;
        boolean ilha = false;

        while (indiceLinha < linha) {
            while (indiceColuna < coluna) {
                if (matriz[indiceLinha][indiceColuna] == 1) {
                    if (indiceIlha == 0) {
                        indiceIlha++;
                        ilha = true;
                    }
                    if (matriz[indiceLinha][indiceColuna] == 1) {
                        indiceIlha++;
                        ilha = true;
                    }
                } else {
                    if (indiceColuna == matriz[0].length - 1) {

                    }

                    if (indiceColuna == 0) {

                    }

                }
                indiceColuna++;
            }
            indiceLinha++;
        }

        return 0;
    }
}
