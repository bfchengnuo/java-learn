package cn.itcast.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Demo2 {

	/**
	 * 
	 * ʹ��dateformat��ʽ���������
	 * @param args
	 */
	public static void main(String[] args) {

		Date date = new Date();
		
		// ֻ��ȡ����
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
		String str = df.format(date);
		System.out.println(str);
		
		// ֻ��ȡʱ��
		df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
		System.out.println(df.format(date));
		
		
		// ��ȡȫ��
		df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, Locale.CHINA);
		System.out.println(df.format(date));
		
		
		//�õ�Ĭ�ϵ�dateformat
		df = DateFormat.getInstance();
		System.out.println(df.format(date));
		
		
		// ʹ��dateformat�����һ���ַ�����ʽ����һ�����ڶ���
		String str = "2011��3��25�� ������ ����11:44";
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, Locale.CHINA);
		Date date = df.parse(str);
		System.out.println(date);
		
		// ת����
		int price = 18;   //$18  
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(nf.format(price));
		
		// ת�ٷֱ�
		double d  = 0.1;
		nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(d));
		
		// ʹ��ռλ����������
		String pattern = "On {0}, a hurricance destroyed {1} houses and caused {2} of damage.";
		MessageFormat format = new MessageFormat(pattern,Locale.CHINA);
		Object params[] = {new Date(),99,1000000};
		String message = format.format(params);
		System.out.println(message);
	}

}
