public class TestVarargs{
	public static void main(String[] args){
		test(5);
		System.out.println("============");
		test(8);
		System.out.println("============");
		test(5,7);
		System.out.println("============");
		test(5,7,8);
		System.out.println("============");
		test();
		System.out.println("============");
		test(5,7,8,0);
	}
	//�ɱ���� ... ���� int���͵�0������������
	//һ�����������һ���ɱ����
	//�ɱ���� ��������ڲ����б�����
	//�������������ĵȼ۶���
	public static void test(int ... data){
		for(int num : data){
			System.out.println(num);
		}
	}
}