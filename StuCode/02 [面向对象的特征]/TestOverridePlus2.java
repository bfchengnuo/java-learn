public class TestOverridePlus2{
	public static void main(String[] args){
		Gosu weixiao = new Gosu();
		weixiao.kill();//?

	}
}
class Noob{//noob = ����
	public void kill(){
		System.out.println("�����ȿ��� r");
		System.out.println("qwe�Ҷ�");
		System.out.println("����ײ��ǽ �ڰ�����");
	}
}
class Gosu extends Noob{
	@Override //Annotation = ע�� = ע�͵�ע�� = ����������ע��
	public void kill(){
		System.out.println("�Ȳ���ƽa����");
		System.out.println("qwe���ּ���������");
		System.out.println("������ֿ�������ͷ");
	}
}




