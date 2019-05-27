/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzzzzz.br.com.blue.jakson.N.I.O.InterateDiretory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author jakson
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		Path dir = Paths.get("C:\\Temp\\Curso");
		
//		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.tx?")) {
//			for (Path path : stream) {
//				System.out.println(path);
//			}
//		}
		
//		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, p -> Files.size(p) > 100)) {
//			for (Path path : stream) {
//				System.out.println(path);
//			}
//		}
	
		SearchFile searchFile = new SearchFile("txt");
		Files.walkFileTree(dir, searchFile);
	}
}
