package netDemo;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatDemo {

	public static void main(String[] args) throws SocketException {

		//��������
		DatagramSocket send = new DatagramSocket();
		//�󶨵����������ϵ�ָ���˿�!!!
		DatagramSocket rece = new DatagramSocket(10000);
		
		//���룬���ҿ������߳�
		new Thread(new Send(send)).start();
		new Thread(new Rece(rece)).start();
		
	}

}
