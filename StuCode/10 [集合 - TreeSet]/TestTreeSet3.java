import java.util.*;
public class TestTreeSet3{
	public static void main(String[] args){
		Set<Student> set = new TreeSet<>();
		Student s1 = new Student("Andy",60);
		Student s2 = new Student("Zorro",16);
		set.add(s1);
		set.add(s2);
		System.out.println(set);
	}
}
class Student implements Comparable<Student>{
	String name;
	int age;
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return name + " : " + age;
	}
	@Override
	public int compareTo(Student stu){
		//�ҵ���������ȽϵĶ���
		Student s1 = this;//������Ԫ��
		Student s2 = stu;//�����е���Ԫ��
		/*
		if(s1.age > s2.age){//�����Ԫ�ص����� ���� ��Ԫ�ص�����
			return 1;//�������ķ���������[����]
		}else{//�����Ԫ�ص����� С�ڵ��� ��Ԫ�ص�����
			return -1;//�������ķ���������[ǰ��]
		}
		*/
		return s1.name.compareTo(s2.name);
	}
}