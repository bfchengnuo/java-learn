package regexIP;

import java.util.TreeSet;

public class RegexIP {

	public static void main(String[] args) {

		//��IP��������  
		
		String str = "192.1.5.4  5.6.44.7  103.112.3.5  11.54.6.1";
		
		//Ϊ�������ַ������бȽ�  ����Ҫ����Ϊͬһ��λ��
		//������ÿ��ǰ�油����0���չ˲���3λ��
		str = str.replaceAll("(\\d+)", "00$1"); //�滻�ַ����ķ�����X+һ�λ���
		System.out.println(str);
		
		//Ȼ��ȥ�������λ��
		str = str.replaceAll("0*(\\d{3})", "$1");//x*����λ���
		System.out.println(str);
		
		// ����֮��Ŀո���зָ�
		
		String[] ss = str.split(" +");
		
		//������������treeset���Ͻ�������
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String ip : ss){
			ts.add(ip);
		}
		
		//��ӡ����
		
		for(String ip : ts){
			//ȥ�������0ֻ��������λ
			System.out.println(ip.replaceAll("0*(\\d)", "$1"));
		}
	}

}
