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
 * @author Aléxia e Daniel
 */
public class ExibeMatrizes {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        while (true) {
            Scanner e = new Scanner(System.in);
            System.out.println("Nome do arquivo: (example_0.txt, example_1.txt, example_2.txt, example_3.txt, example_4.txt)");
            String op = null;
            op = e.next();
            MatrizesArquivos matrizesArquivos = new MatrizesArquivos();

            int[][] resultado = matrizesArquivos.leituraMatrizOriginal(op);
            matrizesArquivos.exibe(resultado);
        }
    }

}
