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
public class Professor extends Usuario {

    private double dataAdmissao;

    public Professor(String nome, double data) {
        setNome(nome);
        setDataAdmissao(data);
    }

    public double getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(double dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
