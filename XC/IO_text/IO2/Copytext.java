package iO1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copytext {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		// ͬʱ��д�ļ�����
		// д��try������
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("demo.txt");
			fw = new FileWriter("demo2.txt");
			// ���û���ռ䣬��1024�ı���Ϊ��
			char[] ch = new char[1024];
			// ������¼��ȡ�ַ��ĸ���
			int len;
			while ((len = fr.read(ch)) != -1) {
				/*
				write(char[] cbuf, int off, int len) 
				д���ַ������ĳһ���֡�
				�����ǲ��Ḳ��ԭ��д�����ݵ�
				*/
				fw.write(ch, 0, len);
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}

		}
	}

}
