public class TestTryCatch{
	public static void main(String[] args){
		first();
	}
	public static void first(){
		second();
	}
	public static void second(){
		System.out.println("1st");
		try{
			new java.util.ArrayList<Integer>(-3);
		}catch(Exception e){
			//��������
			//��Ҫ����
			//System.out.println(e.getMessage());//��Ҫ������Ϣ
			//��ϸ����
			e.printStackTrace();
		}
		System.out.println("2nd");
	}
}
