//final���εı��� �������ձ���
//һ����ֵ����Ҳ�����޸�
public class TestFinal3{
	public static void main(String[] args){
		final int i = 3;
		//i = 5;
		System.out.println(i);

		final Student stu = new Student("Jay");
		stu = new Student("Gay");
		//stu.name = "Gay";
		System.out.println(stu.name);
	}
}

class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
}