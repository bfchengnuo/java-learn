public class TestReplaceFirst{
	public static void main(String[] args){
		String str = "�����Ѳ�������Ƥ";
		String ok = str.replaceFirst("����","����");
		System.out.println(ok);
	}
}