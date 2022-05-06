package javapractice1.wk9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class ServerEx2 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localHost", 5002));
			while (true) {
				System.out.println(">> ���� ��ٸ��� ��...");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(">> ���� ������." + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = (InputStream) socket.getInputStream();
				bytes = new byte[100];
				int readByteNum = is.read(bytes);
				message = new String(bytes, 0, readByteNum, "UTF-8");
				System.out.println(">> ������ �ޱ� ���� !!");
				System.out.println(">> Client: \"" + message + "\"");
				
				OutputStream os = (OutputStream) socket.getOutputStream();
				message = "Hello Client !! (from server)";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println(">>������ ������ ����!!");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch(Exception e1) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch(IOException e2) {}
		}

	}

}
