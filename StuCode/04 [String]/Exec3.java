public class Exec3{
	public static void main(String[] args){
		String str = "370105198603091712";
		//���� �����Ǽ����� ���� ���հ�
		String year = str.substring(6,10);
		String month = str.substring(10,12);
		String date = str.substring(12,14);
		System.out.println(year + " - " + month + " - " + date);
		//���� �е�Ů��?
		String gender = str.substring(16,17);
		if("02468".contains(gender)){
			System.out.println("Ů��");
		}else{
			System.out.println("�е�");
		}

	}
}