package regexIP;

public class RegexEmail {

	public static void main(String[] args) {

		//����У��
		
		String em = "awdad@123.com";
		
		//X+һ�λ��Σ������װΪ�飬Ϊ��ʵ��.com.cn֮���ƥ��  �����������ִ���Ϊ1�ε�3��
		String regex = "[a-zA-Z0-9_]+@[A-Za-z0-9]+(\\.[a-zA-Z]{1,3}){1,3}";
			//   \w �����ַ���[a-zA-Z_0-9]  ����Ŀ�����\\w���� 
			
		boolean f = em.matches(regex);
		
		System.out.println(em +":"+ f);
	}

}
