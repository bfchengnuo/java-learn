import java.util.*;
public class TestRuntimeException{
	public static void main(String[] args){
		//IllegalStateException => �Ƿ�״̬�쳣
		List<Integer> list3 = new ArrayList<>(3);
		Collections.addAll(list3,11,22,33);
		Iterator<Integer> car = list3.iterator();
		car.remove();

		//IndexOutOfBoundsException => ����ֵ�����߽��쳣
		List<Integer> list2 = new ArrayList<>(3);
		Collections.addAll(list2,11,22,33);
		System.out.println(list2.get(3));//?

		//IllegalArgumentException => �Ƿ������쳣
		List<Integer> list1 = new ArrayList<>(-3);
		//ClassCastException => �������쳣
		Object stu = new Student();
		Cacti cc = (Cacti)stu;
		//NullPointerException => ��ָ���쳣
		String str3 = null;
		System.out.println(str3.length());
		//NumberFormatException => ���ָ�ʽ�쳣
		String str2 = "123a";
		int price = Integer.parseInt(str2);
		System.out.println(price+3);
		//StringIndexOutOfBoundsException => �ַ�������ֵ�����߽��쳣
		String str1 = "etoak";
		System.out.println(str1.charAt(5));
		System.out.println(str1.substring(0,10));
		//ArrayIndexOutOfBoundsException => ��������ֵ�����߽��쳣
		int[] data2 = new int[]{1,2,3};
		System.out.println(data2[3]);
		//NegativeArraySizeException => ���������С�쳣
		int[] data1 = new int[-3];
		//ArithmeticException => �����쳣
		System.out.println( 5 / 0 );
	}
}
class Student{}
class Cacti{}//������ ������