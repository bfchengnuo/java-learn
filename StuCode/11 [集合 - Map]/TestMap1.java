import java.util.*;
public class TestMap1{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<>();
		map.put("С��",210);//������
		map.put("С��",160);//������
		map.put("С��",720);//�Ҽ�С��
		//keySet() : �õ���������������ɵ�Set����
		/*
			һ������������ ֻ�������һ��
			���һ��ȫ�Ǽ� ȫ��Ψһ������
		*/
		Set<String> ks = map.keySet();
		for(String k : ks){
			System.out.println(k + " = " + map.get(k));
		}
	}
}



