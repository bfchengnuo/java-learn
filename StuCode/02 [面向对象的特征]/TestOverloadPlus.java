public class TestOverloadPlus{
	public static void main(String[] args){
		/*
			1st.���ʵ�ǰ���뵱����û�г��ַ�������? ��
			2nd.[C���A��̳������޲�test] �� [C�ඨ���int������test] ���㷽������
		*/
	}
}
class A{
	public void test(){
		System.out.println("A���test����");
	}
}
class C extends A{
	public void test(int x){
		System.out.println("C���test����");
	}
}