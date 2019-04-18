package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {
	
	private void mani() {
		
	     Integer idadeRef = Integer.valueOf(29); //autoboxing
         System.out.println(idadeRef.intValue()); //unboxing

         Double dRef = Double.valueOf(3.2);//autoboxing
         System.out.println(dRef.doubleValue());//unboxing

         Boolean dRef1 = Boolean.FALSE;
         System.out.println(dRef1.booleanValue());

         Number refNumero = Integer.valueOf(29);

         List<Number> lista = new ArrayList<>();
         lista.add(10);
         lista.add(32.6);
         lista.add(25.6f);

	}

}
