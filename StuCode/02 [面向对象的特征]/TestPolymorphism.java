public class TestPolymorphism{
	public static void main(String[] args){
		Student bobo = new JavaStudent();
		bobo.study();//��ӡʲô
	}
}
class Person{}//����
class Student extends Person{//ѧ��
	public void study(){
		System.out.println("�ú�ѧϰ ��������");
	}
}
class JavaStudent extends Student{//ѧJava��ѧ��
	public void study(){
		System.out.println("�ô���ķ���");
	}
}