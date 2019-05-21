/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzz.br.com.blue.jakson.I.O;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author jakson
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Properties pro = new Properties();
        try (InputStream entrada = new FileInputStream("text.1")) {
            pro.load(entrada);
            System.out.println("msg1 " + pro.getProperty("msg1"));
            System.out.println("msg2 " + pro.getProperty("msg2"));

        }

        pro.setProperty("msg3", "valor de entrada");

        try (OutputStream saida = new FileOutputStream("text.2")) {

            pro.store(saida, "entrada");
        }

    }

}
