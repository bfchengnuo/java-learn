public class TestSingleton{
	public static void main(String[] args){
		/*
		Sun s1 = Sun.getOnly();
		Sun s2 = Sun.getOnly();
		System.out.println(s1 == s2);//?
		*/
	}
}
//����ʽ = �ӳټ���
class Sun{
	private Sun(){}
	private static Sun only;//null
	public static Sun getOnly(){
		if(only == null)
			only = new Sun();
		return only;
	}
}

/*
//��ʽ
class Moon{
	//˽�л����췽�� ��ֹ����֮������new����
	private Moon(){}
	//�ڱ��൱�д���һ����ǰ���͵Ķ��� Ӧ����˽�еľ�̬��
	private static Moon only = new Moon();
	//�ڱ��൱���ṩһ�������� ��̬��getter
	public static Moon getOnly(){
		return only;
	}
}
*/

/*
class Sun{
	//1st.˽�л����Ĺ��췽�� ��ֹ����֮�����ⴴ������
	private Sun(){}
	//2nd.�ڱ������嵱���ṩһ���������
	private static Sun only = new Sun();
	//3rd.Ϊ���Ψһ��˽�������ṩgetter����
	public static Sun getOnly(){//getter
		return only;
	}
}
*/



