public class TestInterfaceJDK8{
	int i = 8;
	public static void main(String[] args){
		A.test1();
	}
}
interface A{
	public static void test1(){
		System.out.println("�ӿڵ��п��Զ��徲̬������");
	}
	public default void test2(){
		System.out.println("�ӿڵ��п��Գ���default���ε�Ĭ�Ϸ���ʵ��");
	}
}