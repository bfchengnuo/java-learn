import java.util.*;
public class TestMap{
	public static void main(String[] args){
		//��δ�������
		Map<String,Integer> map = new HashMap<>();
		//������Ԫ��
		map.put("С��",210);//������
		map.put("С��",160);//������
		map.put("С��",720);//�Ҽ�С��
		//Map û��Collections.putAll() ������map.putAll(��һ��Map)
		//��εõ�Ԫ�ظ���
		System.out.println(map.size());//3
		//����Ϥ��İ������
		System.out.println(map.get("С��"));//720
		//��һ������������ contains(obj)
		//�ж��Ƿ����ָ������������
		System.out.println(map.containsKey("С��"));
		//�ж��Ƿ����ָ����ֵ����
		System.out.println(map.containsValue(720));
		//���ɾ��һ�м�ֵ��
		map.remove("С��");
		System.out.println(map.size());
	}
}


