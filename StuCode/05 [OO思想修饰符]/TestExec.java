public class TestExec{
	public static void main(String[] args){
		C no1 = new C();
		System.out.println("==============");
		C no2 = new C();
		System.out.println("==============");
		C no3 = new C();
	}
}
class A{
	public A(){
		System.out.println("A��Ĺ��췽��");
	}
	{
		System.out.println("A��ķǾ�̬��ʼ����");
	}
	static{
		System.out.println("A��ľ�̬��ʼ����");
	}
}
class C extends A{
	public C(){
		System.out.println("C��Ĺ��췽��");
	}
	{
		System.out.println("C��ķǾ�̬��ʼ����");
	}
	static{
		System.out.println("C��ľ�̬��ʼ����");
	}
}