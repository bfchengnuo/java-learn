public class TestAbstract1{
	public static void main(String[] args){
		Animal kitty = new Cat();
		kitty.eat();
	}
}
abstract class Animal{//����
	//����һ���г�ʳ��ķ��� ���Ǿ���ʵ�������������
	public abstract void eat();
}
class Cat extends Animal{//è
	@Override
	public void eat(){
		System.out.println("è��è��");
	}
}
