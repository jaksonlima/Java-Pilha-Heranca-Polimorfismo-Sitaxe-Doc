/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z31.br.com.blue.jakson.I.O.serialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jakson
 */
public class Usuario implements Serializable{

    private transient Integer id;
    private  String nome;
    private List<Endereco> endereco = new ArrayList<>();

    public Usuario(Integer id, String nome, List<Endereco> endereco2) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco2;
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
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + '}';
    }

    
}
