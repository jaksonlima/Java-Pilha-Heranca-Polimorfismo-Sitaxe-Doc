/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z31.br.com.blue.jakson.I.O.serialization;

import java.io.Serializable;

/**
 *
 * @author jakson
 */
public class Endereco implements Serializable{

    private String rua;
    private Integer numero;

    public Endereco(String rua, Integer numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + '}';
    }

}
