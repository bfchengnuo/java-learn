public class TestFinally2{
	public static void main(String[] args){
		System.out.println(get(100));//1
		System.out.println(get(50));//2
		System.out.println(get(0));
		System.out.println(get(50));
		System.out.println(get(100));
	}
	public static int get(int x){
		try{
			return 100 / x;
		}catch(Exception e){
			System.out.println("߹��������߹��");
			return 0;
		}finally{
			//��ע�� finally���о��Բ�Ӧ�ó���return��䣡
			return 7777;
		}
	}
}