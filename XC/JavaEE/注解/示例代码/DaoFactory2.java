package cn.itcast.annotation2;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.sql.DataSource;

/**
* �ֶ���ע���ʹ��
* ���ֶ���ʹ��ע�⣬����ֶξ�ע���˶���
*/
public class DaoFactory2 {
	
	public static BookDao createBookDao(){
		
		BookDao dao = new BookDao();
		
		Field fields[] = dao.getClass().getDeclaredFields();
		for(int i=0;fields!=null && i<fields.length;i++){
			Field f = fields[i];
			f.setAccessible(true);
			Inject inject = f.getAnnotation(Inject.class);
			if(inject==null){
				continue;
			}
			
			//����ǰ��ȡ�����ֶ�����Inject���ע�⣬����ע����Ϣ������һ���ظ����ֶ���
			try{
				//�����ֶ���Ҫ�����ӳ�
				DataSource ds = (DataSource) f.getType().newInstance();  
				
				//��ע�����Ϣ���������洴���ĳ�
				inject2Datasource(inject,ds);
				
				f.set(dao, ds);
			}catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return dao;
	}

	//��ע�����Ϣ�����ó�
	private static void inject2Datasource(Inject inject, DataSource ds) {
		Method methods[] = inject.getClass().getMethods();
		for(Method method : methods){
			String name = method.getName();                     //�õ�ע���ÿһ���������磨jdbcUrl(),user(),password(),toString(),hashcode()��
			
			//��ȡds���뷽������Ӧ������
			try{
				PropertyDescriptor pd = new PropertyDescriptor(name,ds.getClass());
				Object value = method.invoke(inject, null);   //�õ�ע�����Ե�ֵ
				
				//��ֵ����ds��������
				pd.getWriteMethod().invoke(ds, value);
			}catch (Exception e) {
				continue;
			}
			
		}
		
		
	}
	
}
