package br.com.licenças.scanner;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TesteDaraCalegar {

	public static void main(String[] args) {

		SimpleDateFormat dt1 = new SimpleDateFormat("dd/HH/yyy HH:mm:ss");

		Date dt = Date.from(Instant.parse("2018-06-25T15:42:05Z"));

		System.out.println(dt1.format(dt));

		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		dt = cal.getTime();

		System.out.println(dt1.format(dt));
		System.out.println("--------------------------");

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(dt);
		int minutos = cal2.get(Calendar.MINUTE);
		int mes = 1 + cal2.get(Calendar.MONTH);

		System.out.println("Minutos: " + minutos + " Mes: " + mes);

	}

}
