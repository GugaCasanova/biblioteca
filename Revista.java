/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca.model;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class Revista extends Obra {

    private int numeroEdicao;

    private Date dataPublicacao;

    
    public Revista (String nome, int numero, Date data){
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

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    
    
}
