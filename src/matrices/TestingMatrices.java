/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estudiante
 */
public class TestingMatrices {
    public static void main(String[] args) throws IOException {
        Matriz unaMatriz;
        int renglones, columnas;
        
         BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
         String entrada;
         System.out.println("Escribe el numero de renglones de la matriz de enteros: ");
         entrada = bufer.readLine();
         renglones = Integer.parseInt(entrada);
         System.out.println("Escribe el numero de columnas de la matriz de enteros: ");
         entrada = bufer.readLine();
         columnas = Integer.parseInt(entrada);
         unaMatriz = new Matriz(renglones, columnas);
         unaMatriz.setMatrizEntera();
         unaMatriz.printMatrizEntera();
         //----------------------
         int[][]matrizAleatoria=unaMatriz.rellenarMatrizAleatoria(3, 5, 2, 20);
         System.out.println("Matriz con valores aleatorios");
         unaMatriz.printMatriz(matrizAleatoria);
         //---------------------
         //Trabajo de matrices irreulares
         int[][]matrizIrregular = {{1,2,3},{1,2,3},{1},{1,2,3,4,5,6}};
         System.out.println("Matriz con tamaño de  columnas diferentes");
         unaMatriz.printMatriz(matrizIrregular);
         
    }
    
}
