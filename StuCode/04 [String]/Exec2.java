public class Exec2{
	public static void main(String[] args){
		String str = "name,age,salary";
		//���ӡ���鵱��ÿ�����Ե�getter��setter������
		//split() substring() toUpperCase() substring(1)
		String[] data = str.split(",");
		for(String x : data){
			String first = x.substring(0,1).toUpperCase();
			String weiba = x.substring(1).toLowerCase();
			System.out.println("set"+first+weiba+"()");
			System.out.println("get"+first+weiba+"()");
		}
	}
}
