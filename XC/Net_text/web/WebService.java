package web;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebService {

	public static void main(String[] args) throws IOException {

		// ���ڲ���HTML�ı��ύ���һ����ʱ�ķ�����

		ServerSocket ss = new ServerSocket(8989);

		Socket s = ss.accept();

		// ��ȡһ�������IP
		System.out.println(s.getInetAddress().getHostAddress() + "......������");

		// ��ȡ�ͻ��˷��͵�����
		InputStream in = s.getInputStream();

		// ���ͻ��˵Ļ�Ӧ

		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

		byte[] but = new byte[1024];
		int len = 0;
		len = in.read(but);
		System.out.print(new String(but, 0, len));
		
		
//		pw.println("�ɹ���ɣ�");
		pw.println("<font color='red' size='7'>�ɹ����</font>");

		s.close();
		ss.close();
	}
}
