public class TestLocalInner{
	public static void main(String[] args){

	}
}
class Outer{
	int a = 3;
	static int b = 5;

	public void gogo(int c){
		int d = 7;
		class Inner{				//�ֲ��ڲ���
			int x = 9;
			public void test(){
				c = 3;
				System.out.println(a);//okay (���gogo�����Ǿ�̬�ľͲ���)
				System.out.println(b);//okay
				System.out.println(c);//�ְ汾
				System.out.println(d);//�ְ汾
				System.out.println(x);//okay
			}
		};
		Inner in = new Inner();//��λ���޶�
	}
}





