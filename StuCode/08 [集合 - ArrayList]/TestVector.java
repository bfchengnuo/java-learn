import java.util.*;
public class TestVector{
	public static void main(String[] args){
		//<Integer>���� JDK5.0����
		//<> �����Զ��ƶ� ��ʯ�﷨ JDK7.0����
		List<Integer> list = new Vector<>();//��δ������϶���
		//������Ԫ��
		list.add(777);   //Integer.valueOf(111)
		list.add(444);
		list.add(555);
		list.add(666);
		//���ϵĹ����� Collections �����ṩһ����Ӷ��Ԫ�صķ���
		Collections.addAll(list,777,444,555,666);//���ĸ�����������
		//��εõ�Ԫ�ظ���
		System.out.println(list.size());//data.length
		//��εõ��ڼ���Ԫ��
		System.out.println(list.get(0));//data[0]
		System.out.println("===============");
		//��α���
		//1st way : for + get()
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("===============");
		//2nd way : foreach / forin
		for(Integer x : list){
			System.out.println(x);
		}
		System.out.println("===============");
		//3rd way : Iterator��С�Ƴ�...
		for(Iterator<Integer> car = list.iterator(); car.hasNext(); ){
			Integer x = car.next();
			System.out.println(x);
		}
		/*
		{
			Iterator<Integer> car = list.iterator();
			while(car.hasNext()){
				Integer x = car.next();
				System.out.println(x);
			}
		}
		*/
		System.out.println("===============");

		//4th way : lambda���ʽ JDK8.0������
		list.forEach(System.out::println);
		System.out.println("===============");
		list.forEach(TestVector::kill);
	}
	public static void kill(Object obj){
		System.out.println(obj);
	}
}