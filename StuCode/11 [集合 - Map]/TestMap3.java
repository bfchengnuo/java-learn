import java.util.*;
public class TestMap3{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<>();
		map.put("С��",210);//������
		map.put("С��",160);//������
		map.put("С��",720);//�Ҽ�С��
		//entrySet() : �õ����м�ֵ�Լ�¼������ɵ�Set����
		Set<Map.Entry<String,Integer>> es = map.entrySet();
		for(Map.Entry<String,Integer> e : es){
			String k = e.getKey();
			Integer v = e.getValue();
			System.out.println(k + " = " + v);
			if("С��".equals(k)){
				e.setValue(738);
			}
		}
	}
}