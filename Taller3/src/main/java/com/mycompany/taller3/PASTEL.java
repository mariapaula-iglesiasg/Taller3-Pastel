/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller3;
import java.util.Scanner;
/**
 *
 * @author Maria Paula
 */
public class PASTEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Tec = new Scanner(System.in);
        NumeroDeVelas v = new NumeroDeVelas();
        int años;
        System.out.println("\t¡FELIZ CUMPLEAÑOS!\t");     
        System.out.println("\nPor favor digite los años que cumple la persona: \t");
        años = Tec.nextInt();
        v.setVelas(años);
        v.AlturaV();
        v.ImpAlturaVelas();
        v.ApagarV();
        
    }
    
}
