import java.util.*;
//�Ƚ��� ������TreeSet�Լ���ר��
//���㲻��TreeSet Ҳ���ܻ��ñȽ���
public class TestComparatorPlus{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list,55,33,11,44,22);
		//��������
		//Collections.sort(list);
		//System.out.println(list);
		//��Ҫ����
		//Collections.reverse(list);//��תԪ��
		//System.out.println(list);
		Collections.sort(list,(x,y) -> y-x);
		System.out.println(list);
	}
}
/*
class TP implements Comparator<Integer>{
	@Override
	public int compare(Integer i1,Integer i2){
		return i2 - i1;
	}
}
*/