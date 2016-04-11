package bfchengnuo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Chat_rece implements Runnable{

	private DatagramSocket ds;
	
	public Chat_rece(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {

		try{
			while(true){
				//�������ݰ�,���� DatagramPacket[���ݱ���]���������ճ���Ϊ length �����ݰ���
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				
//				ʹ�ý��շ��������ݴ洢�����ݰ���
				System.out.println("�ȴ����룬����close�뿪");
				ds.receive(dp);  //����ʽ�����û�����ݻ�һֱ����
				
				//ͨ�����ݰ����󷽷� �������е�����
				
				//����ĳ̨������ IP ��ַ�������ݱ���Ҫ�����û��������ǴӸû������յ��ġ�
				String name = dp.getAddress().getCanonicalHostName();
				String ip = dp.getAddress().toString();
				int port = dp.getPort();//��ȡ�˿ں�
				String text = new String(dp.getData(),0,dp.getLength());//��ȡ�ı���Ϣ
				
				System.out.println("��:"+name+"  IP��ַ��"+ip+"  �˿ڣ�"+port+"\n" +text);
				System.out.println("-----------------------------------------");
				
				if(text.equals("close")){
					
					System.out.println(ip+"�Ѿ��˳�������");
				}
				
			}
		}catch(Exception e){
			
		}
	}

}
