import java.util.*;
public class ExecArrayList6{
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"���ǳ�","�Ժ격","����","���»�","���¸�","�����");
		//��ɾ�����������������ֵ�����~
		for(Iterator<String> car = list.iterator(); car.hasNext(); ){
			String x = car.next();
			if(x.length() == 3){
				//list.remove(x);
				car.remove();
			}
		}
	}
}