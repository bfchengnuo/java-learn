package bfchengnuo;

import java.io.IOException;
import java.util.Scanner;

public class Man {

	public static void main(String[] args) throws IOException {

		int i = 0;

		System.out.println("��������Ҫ���еĹ��ܣ�");
		System.out.println("1-----����������");
		System.out.println("2-----�����ļ�");
		System.out.println("3-----�����ļ�");
		System.out.println("0-----�˳�����");

//		while (true) {
			try {
				Scanner in = new Scanner(System.in);
				i = in.nextInt();
				
			} catch (Exception e) {
				System.out.println("��������ȷ��ָ�");
			}
//		}
		switch (i) {
		case 0:
			// �˳�jvm
			System.exit(-1);
			break;
		case 1:
			new Chat().ChatStart();
			break;
		case 2:
			new FileMan().ShowSed();
			break;

		case 3:
			new FileMan().ShowRed();
			break;

		}
			
	}

}
