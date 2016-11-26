/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author Gustavo
 */
public class Aluno extends Usuario{
    
    private double numeroMatricula;

     public Aluno (String nome, double num){
        setNome(nome);
        setNumeroMatricula(num);
    }
     
    public double getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(double numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
   
    
    
}
