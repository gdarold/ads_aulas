/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula8.Exe1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 0 a 10"));
        Tabuada tab = new Tabuada(numero);
        tab.tabuada();
    }
}
