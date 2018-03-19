public class ExecSingleton{
	public static void main(String[] args){
		//��ʹ����ѧ����֪ʶ ʵ�ֵ���ģʽ
		//Ҫ�� ���۶��ٸ�ͬѧ���Եõ�����
		//���õ���ͬ��һ������
		Cup c1 = Cup.getOnly();
		Cup c2 = Cup.getOnly();
		System.out.println(c1 == c2);
	}
}
class Cup{//����
	private Cup(){}
	private static Cup only = new Cup();
	public static Cup getOnly(){
		return only;
	}
}