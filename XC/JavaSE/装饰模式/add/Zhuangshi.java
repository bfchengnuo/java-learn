package add;

public class Zhuangshi {

	public static void main(String[] args) {

		Person p = new Person();
//		p.eat();
		NewPerson p1 = new NewPerson(p);
		p1.eat();
	}

}

class Person {
	void eat(){
		System.out.println("�Է�");
	}

}

//�����ĳ��־���Ϊ����ǿperson������
class NewPerson{
	//��Ȼ��Ϊ����ǿ�ͱ���Ҫ�������
	private Person p;
	public NewPerson(Person p) {
		this.p = p;
	}
	
	public void eat(){
		System.out.println("��θ��");
		p.eat();
		System.out.println("���");
	}
}

/*
 * װ�����ģʽ��
	��һ�����Ĺ��ܽ�����ǿʱ���Ϳ���ʹ�ø�ģʽ��������Ľ���� 
	

	װ�κͼ̳ж���ʵ��һ�����ص㣺���й��ܵ���չ��ǿ��
	
	�ص㣺װ����ͱ�װ���඼��������ͬһ���ӿڻ��߸��ࡣ 
	
	������ж��ؼ̳�  ���¼̳���ϵԽ��Խӷ�ס������� 
	*/
