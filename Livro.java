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
public class Livro extends Obra {
    
    private String nomeAutor;
    private double numeroEdicao;
    private int anoPublicacao;
    
    Livro(String nome, String nomeAutor, double numero, int ano) {
        setNome(nome);
        setNomeAutor(nomeAutor);
        setNumeroEdicao(numero);
        setAnoPublicacao(ano);
    }
    
    public String getNomeAutor() {
        return nomeAutor;
    }
    
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    
    public double getNumeroEdicao() {
        return numeroEdicao;
    }
    
    public void setNumeroEdicao(double numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
}
