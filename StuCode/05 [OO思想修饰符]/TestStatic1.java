public class TestStatic1{
	public static void main(String[] args){
		Student s1 = new Student("����");
		Student s2 = new Student("����");
		//�����㾡һ�� ���ڽ��Լ������������� ��ǿ���й�
		Student.country = "��ǿ���й�";
		System.out.println(Student.country);//?
		System.out.println(Student.country);//?
	}
}
class Student{
	String name;
	static String country = "�й�";
	public Student(String name){
		this.name = name;
	}
}