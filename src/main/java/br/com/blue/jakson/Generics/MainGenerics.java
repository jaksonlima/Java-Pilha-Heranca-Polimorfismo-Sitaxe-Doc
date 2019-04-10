package br.com.blue.jakson.Generics;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {
	public static void main(String[] args) {

//		List list = new ArrayList();
//
//		list.add("abc");
//		list.add("def");
//		list.add("gh1");
//		list.add(100);
//
//		for (Object obj : list) {
//			String s = (String) obj;
//			System.out.println(s);
//		}
		
		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("def");
		list.add("gh1");

		for (String obj : list) {
			System.out.println(obj);
		}

	}
}
