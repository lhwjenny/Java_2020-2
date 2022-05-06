package javapractice1.wk9;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx1 {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ���� IP�ּ�: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.smu.ac.kr");
			for (InetAddress remote : iaArr) {
				System.out.println("www.smu.ac.kr�� IP �ּ�: " + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
