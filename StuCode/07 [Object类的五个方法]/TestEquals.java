public class TestEquals{
	public static void main(String[] args){
		/*
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));
		*/

		String str1 = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str1.equals(str2));//true

		Student stu1 = new Student("Jay");
		Student stu2 = new Student("Jay");
		System.out.println(stu1.equals(stu2));//false
	}
}
class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj){
		//ֻҪ���漰���Ƚ� ���۱Ƚ��Ƿ���� ���ǱȽ�˭��˭С
		//���Ⱦ�Ҫ�ҵ�����Ƚϵ���������
		Student s1 = this;
		Student s2 = (Student)obj;
		//�����߼����������Ƚϵ�����
		return s1.name.equals(s2.name);
	}
}