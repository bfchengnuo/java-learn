package bfchengnuo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Chat_send implements Runnable{

	private DatagramSocket ds;
	
	public Chat_send(DatagramSocket ds){
		this.ds = ds;
	}

	@Override
	public void run() {

		try {
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String line = null;

			while ((line = bufr.readLine()) != null) {

				byte[] buf = line.getBytes();
				// �������ݰ�������ָ�����͵�ַ�Ͷ˿ڣ������ǹ㲥��ַ
				// InetAddress�����ʾ������Э�� (IP) ��ַ��getname �ڸ����������������ȷ�������� IP
				// ��ַ��Ҳ������IP��ַ���������ַ��ʽ����Ч�ԡ�
				DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.255"),10000);

				ds.send(dp);// �����ݷ���

				// �˳�����,�˳�ѭ��
				if ("close".equals(line)) {
					System.out.println("�����˳�������");
					break;
				}

			}
			ds.close();
		} catch (Exception e) {
		}
	}
	
	
}
