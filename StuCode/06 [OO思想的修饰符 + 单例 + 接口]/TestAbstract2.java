public class TestAbstract2{
	public static void main(String[] args){

	}
}
abstract class Animal{
	public abstract void eat();
	public abstract void run();
}
abstract class Bird extends Animal{
	@Override
	public void eat(){
		System.out.println("��Գ���");
	}
}
class TuoBird extends Bird{
	@Override
	public void run(){
		System.out.println("���񿿼�ǿ������˫�ȱ���");
	}
}







