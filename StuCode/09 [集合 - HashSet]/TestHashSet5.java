import java.util.*;
//HashSet����Ϊ�� �ȵ��ȵ� �������ظ�Ԫ��ֱ������
public class TestHashSet5{
	public static void main(String[] args){
		Set<Student> set = new HashSet<>();
		Student s1 = new Student("Jay");
		Student s2 = new Student("Gay");
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());//1
		System.out.println(set);
	}
}
class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return name;
	}
	@Override
	public int hashCode(){
		return 1;
	}
	@Override
	public boolean equals(Object obj){
		return true;
	}
}