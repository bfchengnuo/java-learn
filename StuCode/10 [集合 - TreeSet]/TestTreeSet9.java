import java.util.*;
public class TestTreeSet9{
	public static void main(String[] args){
		Set<Integer> set = new TreeSet<>(new QQB());
		Collections.addAll(set,55,33,11,44,22);
		//��Ҫ����
		System.out.println(set);

	}
}
class QQB implements Comparator<Integer>{
	@Override		//i1������ i2��Ԫ��
	public int compare(Integer i1,Integer i2){
		return i2 - i1;
	}
}