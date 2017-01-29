/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.t01.p1;
import java.util.Scanner;

/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBT01P1 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // paso 1. variables
        System.out.println("Calculador de promedio");
        double cal1, cal2, cal3, cal4, cal5, pro;
        int mat;
        String res;
        Scanner kb= new Scanner (System.in);
        //paso2. introducir los datos
        System.out.println("Introduce tu matrícula");
        mat= kb.nextInt();
        System.out.println("Teclea la primera calificación");
        cal1=kb.nextDouble();
        System.out.println("Teclea la segunda calificación");
        cal2=kb.nextDouble();
        System.out.println("Teclea la tercera calificación");
        cal3=kb.nextDouble();
        System.out.println("Teclea la cuarta calificacion");
        cal4=kb.nextDouble();
        System.out.println("Teclea la quinta calificación");
        cal5=kb.nextDouble();
        
       //paso 3. operación
       pro=(cal1+cal2+cal3+cal4+cal5)/5;
        System.out.println("TU promedio es " + pro);
        
        if (pro>=7.0) {
        res= ("APROBADO");
        
            System.out.println("ESTÁS " + res);
        
        }else{
        res= ("REPROBADO");
        System.out.println("Estás " + res);       
        }    
        
        }
        
}   



