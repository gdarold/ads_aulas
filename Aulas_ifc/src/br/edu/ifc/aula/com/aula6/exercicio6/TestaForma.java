/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio6;

/**
 *
 * @author Gabriel
 */
public class TestaForma {
 
    public static void main(String[] args) {
        
        Forma f1 = new Retangulo();
        
        System.out.println("Área: "+f1.getArea(10));
        System.out.println("Perimetro: "+f1.getPerimetro(10));
        
       
    }
    
}
