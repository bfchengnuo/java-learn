//final���εķ��� �����շ��� ���Ա��̳� ���ܱ����ǣ���д��
public class TestFinal2{
	public static void main(String[] args){
		C cc = new C();
		cc.gogogo();
	}
}
class A{
	public final void gogogo(){
		System.out.println("ΰ������շ���");
	}
}
class C extends A{

}