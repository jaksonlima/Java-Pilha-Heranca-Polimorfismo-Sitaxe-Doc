/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzzz.br.com.blue.jakson.I.O.SerialVersionUID;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jakson
 */
public class Main {

    public static void main(String[] args) throws Exception {
        create();
        load();

    }

    public static void create() throws Exception {

        Usuario usuario = new Usuario(10, "jakson");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("propertis.bin"))) {
            oos.writeObject(usuario);
        }

    }

    public static void load() throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("propertis.bin"))) {
            Usuario usuario = (Usuario) ois.readObject();
            System.out.println(usuario);
        }

    }

}
