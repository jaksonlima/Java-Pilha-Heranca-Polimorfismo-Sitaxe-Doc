package br.com.licenças.scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TesteData {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dt = new SimpleDateFormat("dd/HH/yyyy");
		SimpleDateFormat dt2 = new SimpleDateFormat("dd/HH/yyyy HH:mm:ss");
		SimpleDateFormat dt3 = new SimpleDateFormat("dd/HH/yyyy HH:mm:ss");
		
		dt3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date data1 = dt.parse("25/06/2018");

		Date data2 = dt2.parse("25/07/2018 15:44:05");

		Date dtagr3 = new Date();

		Date dtagr4 = new Date(System.currentTimeMillis());

		Date dtagr5 = new Date(0L);

		Date dtagr6 = new Date(1000L * 60L * 60L * 5L);

		Date dtagr7 = Date.from(Instant.parse("2019-02-06T15:42:05Z"));

		System.out.println();
		System.out.println("data1: " + dt.format(data1));
		System.out.println();
		System.out.println("data2: " + dt2.format(data2));
		System.out.println();
		System.out.println("data3: " + dt2.format(dtagr3));
		System.out.println();
		System.out.println("data4: " + dt2.format(dtagr4));
		System.out.println();
		System.out.println("data5: " + dt2.format(dtagr5));
		System.out.println();
		System.out.println("data6: " + dt2.format(dtagr6));
		System.out.println();
		System.out.println("data7: " + dt2.format(dtagr7));
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("data1: " + dt3.format(data1));
		System.out.println();
		System.out.println("data2: " + dt3.format(data2));
		System.out.println();
		System.out.println("data3: " + dt3.format(dtagr3));
		System.out.println();
		System.out.println("data4: " + dt3.format(dtagr4));
		System.out.println();
		System.out.println("data5: " + dt3.format(dtagr5));
		System.out.println();
		System.out.println("data6: " + dt3.format(dtagr6));
		System.out.println();
		System.out.println("data7: " + dt3.format(dtagr7));

	}

}
