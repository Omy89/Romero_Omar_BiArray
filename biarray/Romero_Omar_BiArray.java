package biarray;

import java.util.Scanner;
import java.util.Random;

public class Romero_Omar_BiArray {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Random random=new Random();
        
        int dimension;
        int[][] arreglobi;
        int sumaprincipal=0;
        int sumasecundaria=0;
        String principaltext="";
        String secundariatext="";
        
        while (true) {
            try {
                System.out.println("Ingrese el numero de filas y columnas de el arreglo bidimensional");
                dimension=lea.nextInt();
                if(dimension>0){
                    arreglobi=new int[dimension][dimension];
                    break;
                } else {
                    System.out.println("!!AVISO!! Ingrese un valor mayor a 0");
                }

            } catch (Exception e) {
                lea.nextLine();
                System.out.println("!!AVISO!! Ingrese un valor numerico");
            }
        }
        
        for (int i = 0; i < arreglobi.length; i++) {
            for (int j = 0; j < arreglobi.length; j++) {
              int rand=random.nextInt(199);
              rand-=99;
              arreglobi[i][j]=rand;
              
                
                
            } 
        }
        
        
        
        for (int i = 0; i < arreglobi.length; i++) {
            System.out.println("");
            for (int j = 0; j < arreglobi.length; j++) {
                System.out.print("["+arreglobi[i][j]+"]");
                
            }
        }
        System.out.println(arreglobi.length);
        
        
        for (int i = 0; i < arreglobi.length; i++) {
            principaltext+=arreglobi[i][i]+" + ";
            sumaprincipal+=arreglobi[i][i];
        }
        
        for (int i = 0; i < arreglobi.length; i++) {
            int j= arreglobi.length-i-1;
            secundariatext+=arreglobi[j][i]+" + ";
            sumasecundaria+=arreglobi[j][i];
            
        }
        
        
        System.out.println(principaltext+" = "+sumaprincipal);
        System.out.println(secundariatext+" = "+sumasecundaria);
        
        
    }

}
