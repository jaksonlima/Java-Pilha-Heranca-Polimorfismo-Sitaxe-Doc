/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z32.br.com.blue.jakson.I.O.SerialVersionUID;

import java.io.Serializable;

/**
 *
 * @author jakson
 */
public class Usuario implements Serializable {

    private transient Integer id;
    private String nome;

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + '}';
    }

}
