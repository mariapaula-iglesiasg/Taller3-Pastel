/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller3;

/**
 *
 * @author Maria Paula
 */
public class NumeroDeVelas {
    public int velas = 0, vApagada = 0;
    public int[] alturaV = new int[100]; 
    public int max=alturaV[0];
    public void setVelas(int m)
    {
            this.velas=m;
    }
     public int getVelas() {
            return this.velas;
     }
     public void AlturaV()  {
        
        for(int i=0;i<velas;i++)
        {
            alturaV[i]= (int) (Math.random()*velas+1);
        }
            
    }
     public int getAlturaV()    {
            return this.alturaV[100];
    }
    public void ImpAlturaVelas()   {
        System.out.print("\nLa altura de las velas -> ");           
        for(int i=0;i<velas;i++)
        {
            System.out.print( + alturaV[i] + " ");
        }
    }
    public void ApagarV()   {
        
        for(int i=0;i<velas;i++)
        {
            if (max<alturaV[i])                
                max=alturaV[i];                                      
        }
        for (int i=0; i<velas;i++)
        {
            if (max==alturaV[i])
                vApagada+=1;           
        }
        System.out.println("\nEl número de velas que se apagaron -> " + vApagada);
        
    }
    
}

