package bfchengnuo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileRece {

	private static final int SIZE = 10485760;

	//·�����ļ���׺
	public void Rece(String src,String suf) throws IOException {
		ServerSocket ss = new ServerSocket(10000);
		int count=0;
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "������");

		try {

			// ��ȡ�ͻ��˷��������ݡ�
			InputStream in = s.getInputStream();

			// ����ȡ�����ݴ洢��һ���ļ��С�
			File dir = new File(src);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			File file = new File(dir, ip + suf);
			// ����ļ��Ѿ������ڷ����
			while (file.exists()) {
				file = new File(dir, ip + "(" + (++count) + ")"+suf);
			}

			FileOutputStream fos = new FileOutputStream(file);

			byte[] buf = new byte[SIZE];

			int len = 0;

			while ((len = in.read(buf)) != -1) {

				fos.write(buf, 0, len);
			}

			// ��ȡsocket����������ϴ��ɹ����������ͻ��ˡ�
			OutputStream out = s.getOutputStream();
			out.write("�ϴ��ɹ�".getBytes());

			fos.close();
			s.close();
		} catch (IOException e) {

		}
		
		
	}

}
