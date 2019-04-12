 package e.br.com.blue.jakson.reflection.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Executar {
	
//	String arg();
	String value(); // não precisa fazer (value= "") somente passa o valor direto
}
