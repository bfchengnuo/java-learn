public class TestInit{
	public static void main(String[] args){
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
	}
}
class A{
	//���嵱��ֻ�ܶ����Ա�����ԡ�������
	//����ֱ��д���
	int i;
	{//��ʼ���� => ��ʼ����Ա����(����)
		i = 3;
		System.out.println("ETOAK");
	}
}

class X{
	//int a = 5;
	int a;
	{
		a = 5;
	}
}









