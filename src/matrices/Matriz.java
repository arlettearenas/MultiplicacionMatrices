
package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estudiante
 */
public class Matriz {
    int[][]matrizEntera;
    
    public Matriz(int r, int c){
        matrizEntera = new int[r][c];
    }
    
    public Matriz(int r, int[]c){
        for(int col=0; col<c.length; col++)
            matrizEntera=new int [r][c[col]];
    }
    
    public int[][]getMatrizEntera(){
        return matrizEntera;
    }
    
    public void setMatrizEntera() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        for(int i=0; i<matrizEntera.length; i++)
            for(int j=0; j<matrizEntera[i].length; j++){
                System.out.println("Ingrese valor ["+i+"]["+j+"]: ");
                entrada=bufer.readLine();
                matrizEntera[i][j]=Integer.parseInt(entrada);
            }
    }
    
    public void printMatrizEntera(){
        for(int i=0; i<matrizEntera.length; i++){
             for(int j=0; j<matrizEntera[i].length; j++){
                 System.out.printf("%4d", matrizEntera[i][j]);
             }
        System.out.println();
        }
    }
    
    public void printMatriz(int[][]matriz){
        for(int i=0; i<matriz.length; i++){
             for(int j=0; j<matriz[i].length; j++){
                 System.out.printf("%4d", matriz[i][j]);
             }
         System.out.println();
        }
    }

    public int[][] rellenarMatrizAleatoria(int r, int c, int min, int max){
        int rango = max-min+1;//definir rango de valores aleatorios
        int[][] matriz=new int[r][c];
        
        for(int i=0; i<matriz.length; i++)
            for(int j=0; j<matriz.length; j++)
                matriz[i][j]=(int)(Math.random()*rango)+min;
        
        return matriz;
    }
}