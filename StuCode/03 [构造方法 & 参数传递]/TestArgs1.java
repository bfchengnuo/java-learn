public class TestArgs1{
	public static void main(String[] args){
		int num = 3;
		change(num);//num����ʵ�ʲ���
		System.out.println(num);//?
	}
	public static void change(int x){//��ʽ����
		//�����Ĳ��� �ȼ��ڶ����ڷ����嵱�еľֲ�����
		//int x = num;
		x = 7;
	}//�����ŷ������� �����嵱�еľֲ�������������
	 //�������ȼ��ھֲ����� ����Ҳ����
}