package bfchengnuo;

import java.io.IOException;
import java.util.Scanner;

public class FileMan {

	public void ShowSed() throws IOException {

		System.out.println("������Ҫ���͵��ļ�λ�úͽ��շ���IP��ַ");

		Scanner in = new Scanner(System.in);
		String scr = in.nextLine();
		String ip = in.nextLine();

		new FileSend().Send(scr, ip);

	}

	public void ShowRed() throws IOException {
		System.out.println("������Ҫ���յ��ļ���ŵ�λ�úͽ����ļ��ĺ�׺");

		Scanner in = new Scanner(System.in);
		String scr = in.nextLine();
		String suf = in.nextLine();

		new FileRece().Rece(scr, suf);
	}
}
