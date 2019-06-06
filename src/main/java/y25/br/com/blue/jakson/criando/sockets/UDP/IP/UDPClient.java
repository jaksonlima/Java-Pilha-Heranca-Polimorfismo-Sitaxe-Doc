package y25.br.com.blue.jakson.criando.sockets.UDP.IP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		try (DatagramSocket socket = new DatagramSocket()) {
			String str = "Ol�, bem-vindo � Softblue!";
			byte[] buffer = str.getBytes();

			InetAddress addr = InetAddress.getLocalHost();

			DatagramPacket packet = new DatagramPacket(buffer, buffer.length, addr, 2500);
			socket.send(packet);
			System.out.println("Cliente: enviado para o servidor o texto " + str);
		}
	}
}
