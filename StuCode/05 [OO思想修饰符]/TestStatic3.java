public class TestStatic3{
	public static void main(String[] args){
		System.out.println(A.i);
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
	}
}
class A{
	static int i;
	static{
		i = 3;
	}
	static{//��̬��ʼ���� ���ڳ�ʼ����̬��Ա
		i = 7;
		System.out.println("�㿴������");
	}
}
