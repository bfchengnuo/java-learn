public class ExecStringBuffer{
	public static void main(String[] args){
		String[] data = {"����","����","�й�","ɽ��","��;"};
		//�뽫�ַ�������data���е��������� ׷�����ӳ�һ���ַ���
		StringBuffer okay = new StringBuffer();
		for(String x : data){
			okay.append(x);
		}
		System.out.println(okay);
	}
}