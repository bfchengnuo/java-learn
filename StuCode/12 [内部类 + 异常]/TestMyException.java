public class TestMyException{
	public static void main(String[] args)throws Exception{
		int lucky = (int)(Math.random()*10);//0-9
		if(lucky == 4){
			throw new BJLException();
		}
		System.out.println("��������������:"+lucky);
	}
}
class BJLException extends Exception{//�Զ����һ���쳣
	public BJLException(){
		super("������ֲ�����");
	}
}