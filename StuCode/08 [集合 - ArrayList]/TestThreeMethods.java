import java.util.*;
public class TestThreeMethods{
	public static void main(String[] args){
		List<String> xm = new ArrayList<>();
		Collections.addAll(xm,"����","��ѧ","Ӣ��");
		List<String> xg = new ArrayList<>();
		Collections.addAll(xg,"��ѧ","����","��ѧ");
		//��С��ϲ����С�ղ�ϲ�������п�
		{
			List<String> mg = new ArrayList<>();
			mg.addAll(xm);
			mg.removeAll(xg);
			System.out.println(mg);
		}

		//��С����С�ն�ϲ���Ŀ� : ��ѧ    retainAll()
		{
			List<String> mg = new ArrayList<>();
			mg.addAll(xm);
			mg.retainAll(xg);
			System.out.println(mg);
		}

		//������ϲ�������пγ�   addAll()
		{
			List<String> mg = new ArrayList<>();
			mg.addAll(xm);
			mg.addAll(xg);
		}


	}
}