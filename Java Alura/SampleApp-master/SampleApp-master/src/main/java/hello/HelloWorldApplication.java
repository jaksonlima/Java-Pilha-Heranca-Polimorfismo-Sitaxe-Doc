package hello;

import hello.HelloTC;
import totalcross.TotalCrossApplication;

public class HelloWorldApplication {
	public static void main(String[] args) {
		TotalCrossApplication.run(HelloTC.class, "/r" , "54434C42070417BF103F8C89");
//		HelloTC.class, "/r", "54434C42070417BF103F8C89"
	}
}
