public class TestThrows{
	//ѧ������ϯ
	public static void main(String[] args)throws Exception{
		first();
	}
	//�����Ų���
	public static void first()throws Exception{
		second();
	}
	//�����Ÿ���
	public static void second()throws Exception{
		Runtime.getRuntime().exec("notepad");
	}
}