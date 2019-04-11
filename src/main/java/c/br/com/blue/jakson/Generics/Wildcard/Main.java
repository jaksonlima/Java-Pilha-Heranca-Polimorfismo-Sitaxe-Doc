package c.br.com.blue.jakson.Generics.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Bebida> bebida = new ArrayList<Bebida>();
		bebida.add(new Cafe());
		bebida.add(new Chá());
		
		List<Chá> cha = new ArrayList<Chá>();
		cha.add(new Chá());

		List<Cafe> Cafe = new ArrayList<Cafe>();
		Cafe.add(new Cafe());
		
		List<Object> obj = new ArrayList<Object>();
		obj.add(new Cafe());
		
		prepararBedida(bebida);
		
		prepararBedida(cha);

		prepararBedida(Cafe);

		prepararBedida2(cha);
		
		prepararBedida2(obj);
		
		prepararBedidaObj3(obj);

	}

//	private static void prepararBedida(List<Bebida> bebidas) {
//		for (Bebida b : bebidas) {
//			b.preparar();
//		}

	private static void prepararBedida(List<? extends Bebida> bebidas) {
		for (Bebida b : bebidas) {
			b.preparar();
		}
	}

	private static void prepararBedida2(List<? super Chá> bebidas) {

		bebidas.add(new Chá());

		for (Object obj : bebidas) {
			Chá cha = (Chá) obj;
			cha.preparar();
		}
	}

	private static void prepararBedidaObj3(List<?> obj) {
		for (Object b : obj) {
			Chá cha = (Chá) b;
			cha.preparar();
		}
	}

}
