import java.util.*;
/*
	HashSet���췽��������������
		int �������� Ĭ����16
			��������ָ���������ս��һ������2��n�η���
		float �������� Ĭ��0.75F

		��ֵ Threshold = ��������*��������
			��ֵ���ﵽĳ����������С�ٽ�ֵ
				  ��ϣ�����ݵ���С��С

		�ﵽ���߳�����ֵ ��ϣ��ͻ�����
			��ԭ���ķ�������*2
			�����漰��������Ԫ������ɢ��
			���Ӱ��Ч��
		��������Ѿ�֪������Ҫ��Ŷ��ٸ�Ԫ��
			�뱣֤ ��������*��������>Ԫ������
			�����ǰ����
			����������� �����ռ� ���Ч��
			������������ �������ӱ�� ����Ч�� ��֤��Լ�ռ�

	*:HashSet��ε�������?

*/
public class TestHashSet9{
	public static void main(String[] args){
		Set<Integer> set = new HashSet<>(16,0.75F);
	}
	public static void get(int x){//7
		int okay = 1;
		while(okay < x){
			okay <<= 1;
		}
		System.out.println(okay);
	}
}