public class TestEquals2{
	public static void main(String[] args){
		/*
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));
		*/
		Cacti cc = new Cacti();

		String str1 = new String("ABC");
		String str2 = null;
		System.out.println(str1.equals(cc));//true

		Student stu1 = new Student("Jay");
		Student stu2 = null;
		System.out.println(stu1.equals(cc));//false
	}
}
class Cacti{}//������

class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj){
		//ֻҪ���漰���Ƚ� ���۱Ƚ��Ƿ���� ���ǱȽ�˭��˭С
		//���Ⱦ�Ҫ�ҵ�����Ƚϵ���������
		if(obj == null) return false;//��ֹ��ָ���쳣
		if(!(obj instanceof Student)) return false;//��ֹ�������쳣
		if(obj == this) return true;//���Ч��

		Student s1 = this;
		Student s2 = (Student)obj;
		//�����߼����������Ƚϵ�����
		return s1.name.equals(s2.name);
	}
}