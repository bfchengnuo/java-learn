import java.util.*;
public class TestTreeSet7{
	public static void main(String[] args){
		Set<A> set = new TreeSet<>();
		//��ҵ���� �����ʽ���� ����ѡ����һ��A4
		A no1 = new A(4);
		set.add(no1);//��A4�Ž�������
		//���� ��˾���չ ����ѡ���˶�����������
		A no2 = new A(8);
		set.add(no2);
		System.out.println(set);
		//���� ���Ƿ��� 5.2���ϵĳ� ����ͣ
		set.remove(no2);	//1.ɾ��		����TestTreeSet5
		no2.num = 3;		//2.�޸�
		set.add(no2);		//3.�������	����TestTreeSet6
		System.out.println(set);//?
	}
}
class A implements Comparable<A>{//�µϵ�һ��ϵ��   A4 A5 A6 A7 A8
	int num;
	public A(int num){
		this.num = num;
	}
	@Override
	public String toString(){
		return String.valueOf(num);
	}
	@Override
	public int compareTo(A a){
		A a1 = this;
		A a2 = a;
		return a1.num - a2.num;
	}
}


