package net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

	public static void main(String[] args) throws IOException {

		/*
		 * 1,����servicesocket����
		 * 2����ȡsocket��/����
		 * 3����������������ӡ����������
		 */
		
		//�����˿�
		ServerSocket ss = new ServerSocket(10000);
		
		//��ȡ������
		Socket s = ss.accept();
		
		//��ȡIP��ַ
		String ip = ss.getInetAddress().getHostAddress();
		System.out.println(ip+"........������");
		
		//��ȡ��ȡ�� ��װ��
		BufferedReader bufr = new BufferedReader((new InputStreamReader(s.getInputStream())));//�൱�ڿͻ��˵�output
		
		//��ȡ����� ��װ��
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true); //�൱�ڿͻ��˵�input
		
		String len = null;
//		����ͻ��˹ر���ͨ�����൱�ڴ��˸�-1����nullֵ
		while((len = bufr.readLine())!= null){
			System.out.println("�ѽ������ݣ�"+len);
			//ת����д�ķ���������д����
			pw.println(len.toUpperCase());
		}
		s.close();
		ss.close();  //������һ�㲻��ر�����it
	}

}
