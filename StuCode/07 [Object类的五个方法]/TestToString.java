public class TestToString{
	public static void main(String[] args){
		String str = new String("etoak");
		System.out.println(str);//etoak
		System.out.println(str.toString());

		Student stu = new Student("Jay");
		System.out.println(stu);//Student@15db9742   ����ʱ����ʶ@�ڴ��ַӳ��ֵ
		System.out.println(stu.toString());

		Student stu2 = new Student("Joshua");
		System.out.println(stu2);
	}
}
//����Student��û��дtoString()
//���ǻ�ͨ���̳еõ�Object���toString()
//��Object���toString() ����:����ʱ����ʶ@�ڴ��ַӳ��ֵ
class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return name;
	}
}