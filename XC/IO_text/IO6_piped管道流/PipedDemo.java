package io_piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedDemo {

	public static void main(String[] args) throws IOException {
		// �ܵ�������������϶��߳�ʹ�ã���������

		PipedInputStream input = new PipedInputStream();
		PipedOutputStream output = new PipedOutputStream();
		// ���������ܵ���,��һ�ַ�ʽ����������ֱ����new��ʱ��ֱ�Ӵ���ȥ
		input.connect(output);

		// ����ǵ��̣߳�һ��ִ�ж�����û��д�ˣ������ö��̣߳�����mark
		new Thread(new Input(input)).start();
		new Thread(new Output(output)).start();
	}

}

// classд������  = =��

//Runnable �ӿ�Ӧ������Щ����ͨ��ĳһ�߳�ִ����ʵ��������ʵ�֡�����붨��һ����Ϊ run ���޲���������
class Input implements Runnable {

	private PipedInputStream in;

	Input(PipedInputStream in) {
		this.in = in;
	}

	@Override
	public void run() {
		try {
			// ����һ��������
			byte[] buf = new byte[1024];
			// �����ݶ����ܵ��������ض��뻺�������ֽ���
//			���������ݿ��á���⵽����ĩβ�����׳��쳣ǰ���˷���һֱ������
//			���д��ܵ���û�����ݾͻ�һֱ�ȴ�
			int len = in.read(buf);
			String s = new String(buf, 0, len);
			System.out.println("s=" + s);
			// �ر���
			in.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class Output implements Runnable {
	private PipedOutputStream out;

	Output(PipedOutputStream out) {
		this.out = out;
	}

	@Override
	public void run() {
		try {
//			��������
			Thread.sleep(5000);
			// getBytesʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ����,����һ��byte����
			out.write("�ܵ���-----111".getBytes());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
