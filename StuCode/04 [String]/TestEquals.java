public class TestEquals{
	public static void main(String[] args){
		String str1 = new String("etoak");
		String str2 = new String("etoak");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));


		//���Ҫ�ж�ĳ���ַ����ǲ��ǹ̶�������
		//�뽫�̶�����д��ǰ�����equals ��ֹ��ָ��
		String str = null;
		if("ETOAK".equals(str)){
			System.out.println("��֤�ɹ�");
		}else{
			System.out.println("��֤ʧ��");
		}
	}
}