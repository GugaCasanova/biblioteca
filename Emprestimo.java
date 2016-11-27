/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class Emprestimo {

    private ArrayList<Obra> obra = new ArrayList<>();

    private Usuario usuario = new Usuario();

    public void emprestarObra(Usuario u, Obra o) {

        if (u instanceof Aluno) {
            if (obra.size() < 3) {
                obra.add(o);
            } else {
                throw new RuntimeException();    
            }

        } else if (obra.size() > 5) {
            obra.add(o);
        } else {
            throw new RuntimeException();
        }

    }

    public void devolverObra(Usuario u, Obra o) {

        Date data = new java.util.Date();

        if (u instanceof Aluno) {
            obra.remove(o);
        } else {
            obra.remove(o);
        }

    }
          
    public double valorTotalEmprestimo() {
        return 0.0;
    }
}
