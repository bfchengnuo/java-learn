public class TestReplace{
	public static void main(String[] args){
		String str = "�����Ѳ�������Ƥ";
		String ok = str.replace("����","����");
		System.out.println(str);//����
		System.out.println(ok);//����
	}
}