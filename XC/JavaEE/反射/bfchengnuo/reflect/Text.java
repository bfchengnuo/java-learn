package bfchengnuo.reflect;

public class Text {

	public int num = 3;
	public Text(){
		System.out.println("���ǿղι��캯��");
	}
	
	public Text(String str){
		System.out.println("����һ�������Ĺ��캯��");
	}
	
	public Text(String str,int i){
		System.out.println("�������������Ĺ��캯��");
	}
	
	private Text(int i){
		System.out.println("����˽�еĹ��캯��");
	}
	
//	����������ʾ
	
	public void show(){
		System.out.println("����һ���ղεĺ���");
	}
	
	public Class[] show(int i){
		System.out.println("����һ���з���ֵ��һ�������ĺ���");
		
		return new Class[]{int.class};
	}
	
	private void show(String str){
		System.out.println("����һ��˽�еĺ���");
	}
}
