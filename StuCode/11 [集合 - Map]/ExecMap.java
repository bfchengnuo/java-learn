import java.util.*;
public class ExecMap{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<>();
		map.put("[��] ������",96);
		map.put("[��] ���Ƴ�",92);
		map.put("[Ⱥ] ������",100);
		map.put("[κ] �ĺ����",86);
		map.put("[κ] ����Զ",91);
		map.put("[κ] ����Т",38);
		map.put("[��] ������",60);
		map.put("[��] �ܹ��",86);
		map.put("[��] ³�Ӿ�",40);
		//map.put("[κ] ����Т",map.get("[κ] ����Т")+10);
		//��ͳ����������佫��ƽ������ֵ   entrySet()
		{
			int sum = 0,count = 0;
			Set<Map.Entry<String,Integer>> es = map.entrySet();
			for(Map.Entry<String,Integer> e : es){
				String k = e.getKey();
				Integer v = e.getValue();
				if(k.startsWith("[��]")){
					sum += v;
					count++;
				}
			}
			System.out.println(sum / count);
		}
		//���д� ��������佫����ֵ����10%  Map.Entry
		{
			for(Map.Entry<String,Integer> e : map.entrySet()){
				String k = e.getKey();
				Integer v = e.getValue();
				if(k.startsWith("[��]")){
					e.setValue(v*11/10);
				}
			}
		}
		//�����ܹ��ж��ٸ� ����Ľ�����Ϣ
		{
			int count = 0;
			for(String k : map.keySet()){
				if(k.startsWith("[��]")){
					count++;
				}
			}
			System.out.println(count);
		}
		//�����ܹ��ж��ٸ� ��������ӵĽ�����Ϣ
		{
			int count = 0;
			for(String k : map.keySet()){
				if(k.length() > 7){
					count++;
				}
			}
			System.out.println(count);
		}
		//���������佫ƽ������ֵ����
		{
			int sum = 0;
			for(Integer v : map.values()){
				sum += v;
			}
			System.out.println(sum/map.size());
		}
		//�����������ֵ���������ֵ�Ƕ���
		{
			int max = 0,min = 999;
			for(Integer v : map.values()){
				if(v > max){
					max = v;
				}
				if(v < min){
					min = v;
				}
			}
			System.out.println(max);
			System.out.println(min);
		}

		//����map�����ܹ��ж��ٸ�Ӣ��
		System.out.println(map.size());
		//���� ����佫������ ����ֵ����
		System.out.println(map.get("[��] ������"));
		//���� �Ƿ�������ֵ100���佫
		System.out.println(map.containsValue(100));
		//���� �Ƿ�����¼ ����� �ܹ�誽���
		System.out.println(map.containsKey("[��] �ܹ��"));
		//����Т���� ��ɾ��κ������Т
		map.remove("[κ] ����Т");
	}
}