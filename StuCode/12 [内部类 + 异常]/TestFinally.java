public class TestFinally{
	public static void main(String[] args){
		System.out.println("1st.");
		try{
			System.out.println(7/5);

		}catch(Exception e){
			e.printStackTrace();
			return;
		}finally{
			//�����Ƿ�����쳣 ���ն�Ҫִ�еĲ���
			//ͨ�����ͷź͹ر���Դ�Ĳ���
			System.out.println("��ˮ");
		}

	}
}