import java.util.*;
public class TestTreeSet4{
	public static void main(String[] args){
		Set<Food> order = new TreeSet<>();
		Food f1 = new Food("ն����",18,1);
		Food f2 = new Food("ѩ�ǻ�ɽ",18,1);
		Food f3 = new Food("������",256,2);
		Food f4 = new Food("��������ˮ��",520,2);
		Food f5 = new Food("82���ѩ��",20,0);
		Food f6 = new Food("�׷�",5,3);
		Collections.addAll(order,f1,f2,f3,f4,f5,f6);
		//�ۼ۸���50�Ĳ�Ʒ 1���Ż�
		List<Food> temp = new LinkedList<>();
		for(Iterator<Food> car = order.iterator(); car.hasNext(); ){
			Food f = car.next();
			if(f.price > 50){
				car.remove();
				f.price /= 10;
				temp.add(f);//
			}
		}
		order.addAll(temp);

		//�ƹ�ȱ�� ��ɾ��ն����
		//order.remove(f1);


		/*
		for(Iterator<Food> car = order.iterator(); car.hasNext(); ){
			Food f = car.next();
			if("ն����".equals(f.name)){
				car.remove();
			}
		}
		*/
		order.forEach(System.out::println);
	}
}
class Food implements Comparable<Food>{
	String name;//����
	int price;//�۸�
	int type;//���� [0.��ˮ 1.���� 2.�Ȳ� 3.��ʳ 4.��Ʒ]

	private static String[] data = "��ˮ,����,�Ȳ�,��ʳ,��Ʒ".split(",");

	public Food(String name,int price,int type){
		this.name = name;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString(){
		StringBuffer ok = new StringBuffer("[");
		ok.append(data[type]).append("] ").append(name).append(" : ").append(price).append("Ԫ");
		return ok.toString();
	}
	@Override
	public int compareTo(Food f){
		Food f1 = this;
		Food f2 = f;
		/*
			���Ȱ��������������
			��������ͬ���ռ۸�������
			������ͼ۸���ͬ ������������
			�����������ͬ Ҳ��������
		*/
		/*
		if(f1.type == f2.type){
			if(f1.price == f2.price){
				if(f1.name.equals(f2.name)){
					return 1;
				}else{
					return f1.name.compareTo(f2.name);
				}
			}else{
				return f2.price - f1.price;
			}
		}else{
			return f1.type - f2.type;
		}
		*/
		//��;��Ҫ��
		if(f1.type != f2.type)
			return f1.type - f2.type;
		if(f1.price != f2.price)
			return f2.price - f1.price;
		if(!f1.name.equals(f2.name))
			return f1.name.compareTo(f2.name);
		return 1;
	}
}