//ʹ�þ�̬������ɹ���~
public class TestShareData1{
	public static void main(String[] args){
		//����ʱ�� ˾ͽ����
		���� lxb = new ����();
		��׿ ddz = new ��׿();
		lxb.test();
		ddz.test();
	}
}
class �㺮��{
	static Object ���� = new Object();
}
class ����{
	public void test(){
		System.out.println(�㺮��.����);
	}
}
class ��׿{
	public void test(){
		System.out.println(�㺮��.����);
	}
}