public class ExecPolymorphism{
	public static void main(String[] args){
		XCC no1 = new XCC();
		Benz s900 = new Benz();
		Bmw x9 = new Bmw();
		no1.fix(s900);
		no1.fix(x9);
	}
}
class XCC{//�޳���
	public void fix(Car c){
		c.run();
	}
}
class Car{
	public void run(){
		System.out.println("���������ķ���");
	}
}
class Benz extends Car{
	public void run(){
		System.out.println("�ε�����~");
	}
}
class Bmw extends Car{
	public void run(){
		System.out.println("�ε�����~");
	}
}
class Santana extends Car{
	public void run(){
		System.out.println("�ε�����~");
	}
}
class Jetta extends Car{
	public void run(){
		System.out.println("�ε�����~");
	}
}


