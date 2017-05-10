/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizesArquivos;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author alexia-gomes
 */
public class ExibeMatrizes {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        MatrizesArquivos matrizesArquivos = new MatrizesArquivos();

        int[][] resultado = matrizesArquivos .leituraMatrizOriginal("example_4.txt");
        matrizesArquivos.exibe(resultado);
        
    }

}
