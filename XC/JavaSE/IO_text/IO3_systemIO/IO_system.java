package iO2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO_system {

	
//	�������Сд��ĸת��Ϊ��д
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		//���뱳���ĳ̶�����  			����������      		���ֽ���ת��Ϊ�ַ���    ϵͳ����
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
//		��ȡ�ļ���					�������ֽ����ļ�
//		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		
		
		
//									����������		���ַ���ת�����ֽ������
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
//		д�뵽�ļ�  ͬ��Ҳ�����ֽ���  ���д����Ǵ��ı��ļ�����ֱ��ʹ���ַ��� = new BufferedWriter(new FileWriter(file))
//										������----->ת��Ϊ�ֽ���----->���ֽ���д�뵽�ļ�
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		
		
//		��ȡ�ļ��������ַ������룬д�롢�����ļ��������ֽ���д�뵽Ӳ��
		
		
		String ls = null;
//		һ�ζ�ȡһ�У����û�з�����null  ֻ�ж�����null  ��������-1
		while((ls = bufr.readLine()) != null){
			if("over".equals(ls)){
				break;
			}
//			ת���ɴ�д
			bufw.write(ls.toUpperCase());
//			��������
			bufw.newLine();
//			ˢ�»���������Ϊ���ַ��� ����ˢ�²���Ч������Ϊ��ϵͳ�� ���Բ���Ҫ�ر���
			bufw.flush();
		}
	}

}
