public class TestEncapsulation{
	public static void main(String[] args){
		Teacher tea = new Teacher();
		tea.setName("JayZhou");
		tea.setAge(31);

		System.out.println(tea.getName());
		System.out.println(tea.getAge());

		tea.teach();
	}
}
class Teacher{
	private String name;//ÿ����ʦ�����Լ�������
	public void setName(String name){//setter
		this.name = name;
	}
	public String getName(){//getter
		return "�װ���" + name + "��ʦ";
	}

	private int age;//ÿ����ʦ��������
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	private void eat(){
		System.out.println("�Ա����˲��ܺúý���");
	}

	private void sleep(){
		System.out.println("˯�ú��˲��ܺúý���");
	}

	private void play(){
		System.out.println("�濪���˲�������úý���");
	}

	public void teach(){
		sleep();
		eat();
		play();
		System.out.println("������ֻ��ԭ�ر��ܵ��Ǳ��� ��Ҳ�����Լ�����Զ������");
	}

}