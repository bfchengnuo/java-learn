public class TestWrapperClass{
	public static void main(String[] args){
		/*
		int num1 = 222;
		Integer num2 = new Integer(num1);//�Ϲ�����
		Integer num3 = Integer.valueOf(num1);//�Ϲ�����
		*/
		/*
		Integer num1 = Integer.valueOf(127);
		Integer num2 = Integer.valueOf(127);
		Integer num3 = Integer.valueOf(128);
		Integer num4 = Integer.valueOf(128);
		System.out.println(num1 == num2);
		System.out.println(num3 == num4);
		*/
		/*
		Integer num1 = 127;//Integer num1 = Integer.valueOf(127);
		Integer num2 = 127;
		System.out.println(num1 == num2);
		Integer num3 = 128;
		Integer num4 = 128;
		System.out.println(num3 == num4);

		int data1 = num1;//num1.intValue();//�Զ����
		*/
		String price = "123";
		//��String �������������Ӧ��int
		int x = Integer.parseInt(price);//123
		System.out.println(x - 3);

	}
}
/*
class IntGuanzi{
	private int value;
	public IntGuanzi(int value){
		this.value = value;
	}
	public int intValue(){
		return value;
	}
	@Override
	public String toString(){
		return String.valueOf(num);
	}
}
*/