import java.util.*;
public class TestMap2{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<>();
		map.put("С��",210);//������
		map.put("С��",160);//������
		map.put("С��",720);//�Ҽ�С��
		//values() : �õ�����ֵ������ɵ�Collection����
		/*
			һ������������ ֻ���ұ���һ��
			�ұ�һ��ȫ��ֵ �Ȳ�Ψһ������
		*/
		Collection<Integer> vs = map.values();
		for(Iterator<Integer> car = vs.iterator(); car.hasNext(); ){
			Integer x = car.next();
			System.out.println(x);
		}
	}
}



