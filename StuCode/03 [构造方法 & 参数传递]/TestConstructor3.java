public class TestConstructor3{
	public static void main(String[] args){

	}
}
class Person{
	String name;
	int age;
	//public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}
class Teacher extends Person{
	public Teacher(){
		super("����",2200);//Ĭ�Ͼ���super();
	}
}






