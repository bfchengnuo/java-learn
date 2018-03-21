import java.util.*;
public class ExecArrayList1{
	public static void main(String[] args){
		String str = "Leon,Andy,Aaron,Jacky,Jay";
		/*
			�뽫������� ����һ������ַ�����ArrayList���ϵ���
			����ʹ�ø��ֲ�ͬ�ķ�ʽ �����������
			a>for + get()   b> foreach	JDK5.0
			c>Iterator	d> lambda���ʽ	JDK8.0
		*/
		String[] data = str.split(",");
		List<String> list = new ArrayList<>();
		Collections.addAll(list,data);//�ɱ����������������ƥ��
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		for(String x : list){
			System.out.println(x);
		}
		for(Iterator<String> car = list.iterator(); car.hasNext(); ){
			String x = car.next();
			System.out.println(x);
		}
		list.forEach(System.out::println);

	}
}







