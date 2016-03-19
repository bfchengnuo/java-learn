package iO_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesText {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		/*
		 * Map
		 * 	|--Hashtable
		 * 		|--Properties:
		 * 
		 * Properties���ϣ�
		 * �ص㣺
		 * 1���ü����еļ���ֵ�����ַ������͡�
		 * 2�������е����ݿ��Ա��浽���У����ߴ�����ȡ��
		 * 
		 * ͨ���ü������ڲ����Լ�ֵ����ʽ���ڵ������ļ��� 
		 * 
		 * 
		 */
		
		// propdd();
//		������д�뵽�ļ�
		// file1();
//		���ļ���������  �����ļ�
//		file2();
//		��ȡ�ļ� �����޸��ļ�
		file3();
	}

	private static void file3() throws IOException {
		//��ȡ�ļ�
		File file = new File("info.txt");
		//����ļ�������  ��ô���½�һ��
		if(!file.exists()){
			file.createNewFile();
		}
//		����һ���ַ���
		FileReader fr = new FileReader(file);
		// ��������
		Properties prop = new Properties();
		
//		�����е���Ϣ�洢��������
		prop.load(fr);
		
//		�޸�����
		prop.setProperty("loli_a", "ssss");
		
		
//		����һ������ַ����������Ḳ��ԭ�ļ�������Ӧ����load֮�󴴽�
		FileWriter fw = new FileWriter(file);
//		���������ݴ洢���ļ�
		prop.store(fw, "");
		
//		�ر���
		fw.close();
		fr.close();
	}

	private static void file2() throws IOException {
		Properties prop = new Properties();
//		Ҫ��֤�ļ��Ǽ�ֵ��    �ֽ���--����ˢ��Ҳ���Դ��룿����
		FileInputStream fis = new FileInputStream("info.txt");
		
//		ʹ��load����
		prop.load(fis);
		
		prop.list(System.out);
	}

	private static void file1() throws IOException {
		Properties prop = new Properties();
		
		prop.setProperty("loli_a", "skye1");
		prop.setProperty("loli_b", "skye2");
		prop.setProperty("loli_c", "skye3");
		prop.setProperty("loli_d", "skye4");
		prop.setProperty("loli_e", "skye5");
		
//		�浽�ļ��У����������,�ֽ���
		FileOutputStream fos = new FileOutputStream("info.txt");
		
//		�������е����ݴ洢���ļ���ʹ��store����
		prop.store(fos, "text");
		
//		һ��Ҫ�ر���
		fos.close();
	}

	private static void propdd() {
//		���� Prop����
		Properties prop = new Properties();
		
//		�洢���� ��ֵ�� �����ַ�������
		prop.setProperty("lolia", "01");
		prop.setProperty("lolib", "02");
		prop.setProperty("lolic", "03");
		prop.setProperty("lolid", "04");
		
//		�޸�Ԫ�ص�ֵ
		prop.setProperty("lolia", "sss");
		
		//���������������ȡϵͳ��Ϣ����
		// prop = System.getProperties();
		
		//�������б������ָ������������˷����Ե��Ժ����á�
		prop.list(System.out);
		
		
		
		
		/* ��һ��ȡ������
		
//		ȡ������Ԫ��,�߼�for
		Set<String> names = prop.stringPropertyNames();
		
		for(String name : names){
//			���ݼ�ȡֵ
			String val = prop.getProperty(name);
			System.out.println(name+":"+val);
		}
		*/
	}

}
