package bfchengnuo.reflect;

import java.lang.reflect.Method;

import org.junit.Test;

public class DemoFunction {

	@Test
	public void demo() throws Exception{
		Text tex = new Text();
		Class clazz = Class.forName("bfchengnuo.reflect.Text");
		
		//���ֽ����ļ���ȡ��������һ������Ϊ���������ڶ�������Ϊ������Ҫ����Ĳ���
		Method me = clazz.getMethod("show", null);
		//�ú�������������һ��Ϊ���󣬵ڶ���������������Ҫ�Ĳ���
		me.invoke(tex, null);
		
	}
}
