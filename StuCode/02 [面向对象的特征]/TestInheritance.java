public class TestInheritance{
	public static void main(String[] args){
		Dog babu = new Dog();//�Ͳ���
		babu.setName("Bob");
		babu.setAge(31);
		babu.eat();

		System.out.println(babu.getName());
		System.out.println(babu.getAge());
	}
}
class Animal{
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	private int age;
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	public void eat(){
		System.out.println("�����ʳ��");
	}
}
class Dog extends Animal{//Dog��һ��Animal

}

/*
class Car{}//����
class Person{}//��
class Transformer extends Car,Person{//�಻֧�ֶ��ؼ̳�//���ν�� = ������

}
*/