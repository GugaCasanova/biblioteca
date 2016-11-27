/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca.model;

/**
 *
 * @author Gustavo
 */
public class MaterialDigital extends Obra {

    private int anoPublicacao;

    private TipoMaterial tipoMaterial;

    public MaterialDigital(String nome, int ano, TipoMaterial tipo) {
        setNome(nome);
        setAnoPublicacao(ano);
        setTipoMaterial(tipo);
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

}
