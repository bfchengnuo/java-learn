import java.util.*;
public class TodaysHomework{
	public static void main(String[] args){
		//keySet() values() entrySet() Map.Entry
		//getKey() getValue() setValue()
		//size() remove() Iterator
		//��������ϰ Map���ϵĲ������ַ����Ĵ��� �Լ����̿��Ƶ�����
		TreeMap<Student,String> map = new TreeMap<Student,String>();
		Student s1 = new Student("��",27);
		Student s2 = new Student("����",24);
		Student s3 = new Student("����",24);
		Student s4 = new Student("����",27);
		Student s5 = new Student("����",25);
		Student s6 = new Student("����",22);
		Student s7 = new Student("����",27);
		map.put(s1,"0531-66532154");
		map.put(s2,"0531-66666661");
		map.put(s3,"0532-88888888");
		map.put(s4,"0538-6678111");
		map.put(s5,"0531-55555511");
		map.put(s6,"0531-55555522");
		map.put(s7,"0538-3434596");
		//1st.��ӡ��ǰͨѶ¼�ܹ���¼�˶��ٸ���ϵ�� 0��
		System.out.println(map.size());
		//2nd.�����и�������Ҫ�Ŀ��� ������� ��ʱɾ����ϵ�� ���ֲ�ͬ�ķ���ʵ��
		//3rd.���Թ������� �Ѿ�28���� �޸���¼��������Ϣ һ������
		//4th.̩���з�չѸ�� �绰������λ ��ͷ+8  0538
		//5th.����ʾ���о�ס�ڼ��ϵ�ѧ������
		//6th.��ӡ����ͬѧ���ڵĳ���
		//7th.�����������25���ͬѧ �����ǳ� СX
	}
}
//�����뿪Student���ƶ�Student��ıȽϹ���
//�������Ҫ�� �Ȱ��������� ������ͬ��������
//�������䶼��ͬ ���������󵽵�˳��
class Student{
	String name;
	int age;
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return name+":"+age;
	}
}