package iO_split;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SplitDemo {

	public static void main(String[] args) throws IOException {

		
		File ff = new File("c:\\0.jpg");
		splitff_1(ff);
	}

	private static void splitff_1(File ff) throws IOException {
		// TODO �Զ����ɵķ������
		
		//�ö�ȡ������Ҫ�ָ���ļ�
				FileInputStream fis = new FileInputStream(ff);
				
				//����������
				byte[] tem = new byte[1024];
				
				//����Ŀ����
				FileOutputStream fos = null;
				
				int len = 0;
				int count = 1;
				
				//Ŀ���ļ���
				File fle = new File("c:\\abc");
//				��׳���ж�  ��������ھʹ���һ���ļ���
				if(!fle.exists()){
					fle.mkdir();
				}
				
//				���ļ��ָ�Ϊ��������С���ļ�
				while ((len = fis.read(tem)) != -1) {
					fos = new FileOutputStream(new File(fle, (count++)+".part"));
					//��������������д�룬�ֽ�������Ҫˢ��,���ճ��Ȳ�ȷ������ָ��
					fos.write(tem,0,len);
					//�ر���
					fos.close();
				}
				
				/*
				 * ���������ļ�����¼�ָ���Ϣ�������Ժ���ļ��ϲ�
				 * */
				
				// Properties ��/����    	��ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء�
				Properties prop = new Properties();
				
				prop.setProperty("partcount", count+"");
				prop.setProperty("filename", ff.getName());
				
				//��һ������� д�����ļ�
				fos = new FileOutputStream(new File(fle,count+".properties"));
				//��������Ϣ���棬���ʡ��
				prop.store(fos, "");
				
				fos.close();
				fis.close();
	}

	private static void splitff(File ff) throws IOException {
		// TODO �Զ����ɵķ������
		
		
		//�ö�ȡ������Ҫ�ָ���ļ�
		FileInputStream fis = new FileInputStream(ff);
		
		//����������
		byte[] tem = new byte[1024*1024];//�������д��ֵ
		
		//����Ŀ����
		FileOutputStream fos = null;
		
		int len = 0;
		int count = 1;
		
		//Ŀ���ļ���
		File fle = new File("c:\\abc");
//		��׳���ж�  ��������ھʹ���һ���ļ���
		if(!fle.exists()){
			fle.mkdir();
		}
		
//		���ļ��ָ�Ϊ��������С���ļ�
		while ((len = fis.read(tem)) != -1) {
			fos = new FileOutputStream(new File(fle, (count++)+".part"));
			//��������������д�룬�ֽ�������Ҫˢ��,���ճ��Ȳ�ȷ������ָ��
			fos.write(tem,0,len);
			//�ر���
			fos.close();
		}
		
		fis.close();
	}

}
