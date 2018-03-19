public class TestInterface{
	public static void main(String[] args){
		Computer pc = new Computer();
		USB ie30 = new Mouse();//�ӿ����� ʵ�������Ҳ�����ֶ�̬
		USB kb = new Keyboard();
		pc.openDevice(ie30);
		pc.openDevice(kb);

		Tank tk = new Tank();
		pc.openDevice(tk);
	}
}
interface A{}
interface B{}
interface C extends A,B{}

interface USB{
	//�ӿڵ��ж���ı��� Ĭ�Ͼ��ǳ��� �Զ�����������η�
	//public static final
	int v = 5;//USB�ӿڶ��ѹ5V

	//�ӿڵ��ж���ķ��� Ĭ�Ͼ��ǹ����ĳ��󷽷�
	//public abstract
	void connect();
}
class Mouse implements USB{//��ͽӿ� �������Ǽ̳й�ϵ ����ʵ�ֹ�ϵ
	@Override
	public void connect(){
		System.out.println("USB������ӵ��Եķ���");
	}
}
class Keyboard implements USB{
	@Override
	public void connect(){
		System.out.println("USB�������ӵ��Եķ���");
	}
}
class Tank implements USB{
	@Override
	public void connect(){
		System.out.println("USB̹�����ӵ��Եķ���");
	}
}

class Computer{
	public void openDevice(USB x){
		x.connect();
	}
}