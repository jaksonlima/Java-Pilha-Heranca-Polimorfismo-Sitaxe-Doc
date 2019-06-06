package b2.br.com.blue.jakson.GenericsParametrizadas;

import java.util.ArrayList;
import java.util.List;

public class GenericsParametrizadas<T> { // <-- Criando classes parametrizadas com o uso de generics

	private List<T> listBuffer = new ArrayList<>();

	public void adicionar(T s) {
		listBuffer.add(s);
	}

	public T remover() {
		T s = listBuffer.get(0);
		listBuffer.remove(0);
		return s;
	}

}
