public class TestOverridePlus1{
	public static void main(String[] args){
		After90 xiaoMing = new After90();
		xiaoMing.research();
	}
}
class After60{//60��
	public void research(){//�о�
		System.out.println("ȥͼ��ݲ�������");
		System.out.println("��绰��ѯ��������");
	}
}
class After90 extends After60{//90��
	public void research(){
		super.research();//ִ�и����research()����
		System.out.println("�ٶ�һ�� ���֪��");
	}
}






