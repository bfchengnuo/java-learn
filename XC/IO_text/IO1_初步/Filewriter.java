package iO1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		
		FileWriter fw = new FileWriter("demo.txt");
		//д�뵽������  �����ڻ�������
		fw.write("adawdawd");
		//ˢ��������
		fw.flush();
		
		//�ر�������
		fw.close();
		
		FileReader fw2 = new FileReader("demo.txt");
		//�Ƽ�1024����洢�����
		char[] buf = new char[10];
		int len = 0;
		while ((len = fw2.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		//ҲҪ�ر�������
		fw2.close();
	}

}
