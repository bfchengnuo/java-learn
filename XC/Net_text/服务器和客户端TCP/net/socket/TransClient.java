package net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		// �ͻ���
		/*
		 * 1,����һ��socket����ָ�����͵�ַ
		 * 2������һ��IO����ȡ��������
		 * 3������������������ݣ�������������ڽ��շ���������
		 */
		
		Socket s = new Socket("127.0.0.1", 10000);
		
		//��Ϊ���ַ����������ַ�������ӻ�����
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		//����һ����ӡ�������㷢������,����֧���Զ�ˢ��   socket�����������
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		//����һ����������ڽ��շ��������ݣ� socket������������
		//ͬ����read����Ϊ�Ƕ�ȡ�������ķ�������
		BufferedReader bufin = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String len = null;
		
		while((len = bufr.readLine())!= null){
			//�����ݷ��͸���ӡ��
			if("over".equals(len))
				break;
//			Ҫ����if���棬��������쳣���ȴ���������������������һ��ֵ���ǿͻ����Ѿ��ر������ӣ����Ի����쳣
			pw.println(len);
			System.out.println(bufin.readLine());
		}
		s.close();
	}

}
