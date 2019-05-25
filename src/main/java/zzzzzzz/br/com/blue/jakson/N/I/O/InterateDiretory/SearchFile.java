/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzzzzz.br.com.blue.jakson.N.I.O.InterateDiretory;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author jakson
 */
public class SearchFile implements FileVisitor<Path> {

    private String fileName;

    public SearchFile(String fileName) {;
        this.fileName = fileName;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Entrando no diretório " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Acessando o arquivo " + file);

        if (file.getFileName().toString().contains(fileName)) {
            System.out.println("Arquivo encontrado em " + file);
            return FileVisitResult.TERMINATE;
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Falha ao acessar arquivo " + file + ": " + exc);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Saindo do diretório " + dir);
        return FileVisitResult.CONTINUE;
    }
}
