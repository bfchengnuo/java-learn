package bfchengnuo.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class Demo {

	//�������ʾ
	public static void main(String[] args) throws Exception {
		
//		���ֽ����ļ����ؽ��ڴ�
		Class clazz = Class.forName("bfchengnuo.reflect.Text");
		
		//��ȡһ���չ��캯��
		Constructor c = clazz.getConstructor(null);
		//���ÿյĹ��캯������һ������
		Text tex = (Text) c.newInstance(null);
		
		System.out.println(tex.num);
	}

	@Test
	public void text() throws Exception{
		Class clazz = Class.forName("bfchengnuo.reflect.Text");
		Constructor c = clazz.getConstructor(String.class);
		Text tex = (Text) c.newInstance("aaa");
		System.out.println(tex.num);
	}
	
	@Test
	//��ȡ˽�еĹ��캯��
	public void text1() throws Exception{
		Class clazz = Class.forName("bfchengnuo.reflect.Text");
		Constructor c = clazz.getDeclaredConstructor(int.class);
		c.setAccessible(true); //��������
		Text tex = (Text) c.newInstance(2);
		System.out.println(tex.num);
	}
	
	//���䴴���������һ�ַ���
	@Test
	public void text2() throws Exception{
		Class clazz = Class.forName("bfchengnuo.reflect.Text");
		//�������ֻ�������޲εĹ��캯��
		Text tex = (Text) clazz.newInstance();
		System.out.println(tex.num);
	}
}
