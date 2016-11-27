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
public class Professor extends Usuario {

    private Date dataAdmissao;

    public Professor(){
        
    }
    
    public Professor(String nome, Date data) {
        setNome(nome);
        setDataAdmissao(data);
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

}
