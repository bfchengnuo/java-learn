/* 
�������ģʽ
		��֤һ�������ڴ��ж����Ψһ�ԣ�ֻ����һ������
		˽�л����캯������ͨ��new�ڱ����д���һ��������󡢡�����һ�����з������ش����Ķ���
*/
class danli
{
	public static void main(String[] args)
	{
		demo ls =  demo.getInstance();  // ������������������
		demos lss = demos.getInstance();
		//��ʱ����
		// ceshi x = new ceshi();   ԭ������ô���õ�
		// ceshi x = new ceshi;		����
		// new ceshi.show();		����
		// new ceshi().show();			��ȷ��ʹ�ã�������Ϊ���Ű�������
	}
}
//����ʽ  ����
class demo
{
	private static demo s = new demo();  //��̬������ؾʹ���
	private demo(){};
	public static demo getInstance()
	{
		return s;
	}
}
//����ʽ  ����
class demos
{
	private static demos s = null;
	private demos(){};
	public static demos getInstance()
	{
		s = new demos();
		return s;
	}
}

class ceshi
{
	void show()
	{
		System.out.println("yes!");
	}
}
		 