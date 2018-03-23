import java.util.*;
public class TestHashSet1{
	public static void main(String[] args){
		//��δ�������
		Set<Integer> set = new HashSet<>();
		//������һ��Ԫ��
		set.add(11);
		set.add(33);
		//�����Ӷ��Ԫ��
		Collections.addAll(set,44,22,55,55,55,55,55,55);
		//��εõ�Ԫ�ظ���
		System.out.println(set.size());//Ψһ
		//��Ҫ�����Ǹ�get(int)  => ����
		//System.out.println(set.get(0));
		System.out.println("=============");
		//1st. Iterator
		for(Iterator<Integer> car = set.iterator(); car.hasNext(); ){
			Integer x = car.next();
			System.out.println(x);
		}
		System.out.println("=============");
		//2nd. foreach
		for(Integer x : set){
			System.out.println(x);
		}
		System.out.println("=============");
		//3rd. lambda 8.0
		set.forEach(System.out::println);
		//set.stream().filter(x -> x>30).forEach(System.out::println);


	}
}