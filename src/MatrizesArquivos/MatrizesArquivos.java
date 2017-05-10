/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizesArquivos;

/**
 *
 * @author alexia-gomes
 */
public class MatrizesArquivos {

    public int contador(int[][] matriz) {

        int matrizLinha = matriz[0].length;
        int matrizColuna = matriz.length;
        int indiceIlhas = 0;
        boolean[][] verificaIlhas = new boolean[matrizLinha][matrizColuna];

        for (int l = 0; l < matrizLinha; l++) {
            for (int c = 0; c < matrizColuna; c++) {
                if (!verificaIlhas[l][c] && matriz[l][c] == 1) {
                    indiceIlhas++;
                }
            }
        }//fecja for

        return 0;
    }
}//fecha contador
