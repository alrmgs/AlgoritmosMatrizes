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

        }

    }
}//fecha contador
