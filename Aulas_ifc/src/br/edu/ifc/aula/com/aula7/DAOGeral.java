/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula7;

/**
 *
 * @author aluno
 */
public interface DAOGeral {
    
    static final String TESTE = "DAOGeral";
    
    public abstract void inserir();
    public abstract void excluir();
    public abstract void listar();
    
}
