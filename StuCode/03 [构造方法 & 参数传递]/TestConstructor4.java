public class TestConstructor4{
	public static void main(String[] args){
		������ cd1 = new ������();//��������
		System.out.println("==============");
		������ cd2 = new ������("����");
	}
}
class ������{
	public ������(){
		System.out.println("���� ���� �ȹ�");
		System.out.println("���鼦��");
		System.out.println("���Ϸ���");
	}
	public ������(String ���){
		this();//��ִ�е�ǰ���췽��֮ǰ ��ȥִ�б�����������췽�� ������ִ����һ�� ȡ����this()����Ĳ���
		System.out.println("����"+���);
		System.out.println("�������Ϸ���");
	}
}


