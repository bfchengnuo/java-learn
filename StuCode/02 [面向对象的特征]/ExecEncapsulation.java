public class ExecEncapsulation{
	public static void main(String[] args){
		//Ҫ�� �밴�շ�װ��Ҫ���дRect���嵱�еĴ���
		//֮�󴴽����������ζ��� һ����5��3 һ����8��2
		Rect no1 = new Rect();
		no1.setLength(5);
		no1.setWidth(3);
		Rect no2 = new Rect();
		no2.setLength(8);
		no2.setWidth(2);

		no1.showArea();
		no2.showArea();

	}
}
class Rect{
	private int length;//����
	private int width;//���
	//�����������Ե�setter
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	//���ڵõ����Ե�getter
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}

	//��ʾ�Լ������
	public void showArea(){
		System.out.println(length * width);
	}
}