public class TestShareData3{
	public static void main(String[] args){
		�㺮�� ghg = new �㺮��();
		�㺮��.���� lxb = ghg.new ����();
		�㺮��.��׿ ddz = ghg.new ��׿();
		lxb.test();
		ddz.test();
	}
}
class �㺮��{
	Object ���� = new Object();
	class ����{
		public void test(){
			System.out.println(����);
		}
	}
	class ��׿{
		public void test(){
			System.out.println(����);
		}
	}
}