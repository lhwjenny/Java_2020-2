package javapractice1.wk9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localHost", 5001));
			while(true) {
				System.out.println("[ ���� ��ٸ��� ��... ]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[ ���� ������ ] " + isa.getHostName());
			}
		} catch (Exception e1) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch(IOException e2) {}
		}
	}
}
