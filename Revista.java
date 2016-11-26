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
public class Revista extends Obra {

    private int numeroEdicao;

    private double dataPublicacao;

    
    public Revista (String nome, int numero, double data){
        setNome(nome);
        setNumeroEdicao(numero);
        setDataPublicacao(data);
    }
    
    
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public double getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(double dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    
    
}
