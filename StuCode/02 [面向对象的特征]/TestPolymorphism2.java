public class TestPolymorphism2{
	public static void main(String[] args){
		/*
		Chinese xdd = new Chinese();
		American tlp = new American();
		Etoakese bob = new Etoakese();

		Restaurant kfc = new Restaurant();
		kfc.service(xdd);
		kfc.service(tlp);
		kfc.service(bob);
		*/

		Student bob = new Student();
		Teacher jay = new Teacher();
		Doctor bqe = new Doctor();
		Restroom wc = new Restroom();
		wc.service(bob);
		wc.service(jay);
		wc.service(bqe);
		Wumao wm = new Wumao();
		wc.service(wm);
	}
}
class Person{}
class Student extends Person{}
class Teacher extends Person{}
class Doctor extends Person{}
class Wumao extends Person{}
class Restroom{//Rest��Ϣ Room���� Restroom���� Toilet
	public void service(Person p){
		System.out.println("�������ϲ���...");
	}
}
/*
class Person{
	public void eat(){
		System.out.println("�����ʳ��");
	}
}
class Chinese extends Person{//�й���
	public void eat(){
		System.out.println("�й��˳�ˮ��");
	}
}
class American extends Person{//������
	public void eat(){
		System.out.println("�����˳�ţ��");
	}
}
class Japanese extends Person{//�ձ���
	public void eat(){
		System.out.println("�ձ��˳�ʳ��");
	}
}
class Etoakese extends Person{
	public void eat(){
		System.out.println("��;�˳�����ȫϯ");
	}
}
class Restaurant{//����
	public void service(Person xr){
		//Person xr = new Chinese();
		xr.eat();
	}
}
*/