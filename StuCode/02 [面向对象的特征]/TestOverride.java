public class TestOverride{
	public static void main(String[] args){

	}
}
class Animal{
	public void eat(){
		System.out.println("�����ʳ��ķ���");
	}
}
class Cat extends Animal{
	public void eat(){
		System.out.println("è��è��");
	}
}
