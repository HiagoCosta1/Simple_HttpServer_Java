package application;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHttpServer {
	
	public static void main(String [] args) throws Exception{
		
		final ServerSocket server = new ServerSocket (8080);
		System.out.println("Aguardando conexão na porta 8080...");
		while (true) {
			try (Socket socket = server.accept()){
				Date today = new Date();
				String httpResponse = "HTTP/1.1 200 OK \r\n\r\n" + today;
				socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
			}
		
		}
		
	}
	

}
