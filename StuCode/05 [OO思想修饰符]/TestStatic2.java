public class TestStatic2{
	public static void main(String[] args){
		Student s1 = new Student("����");
		Student s2 = new Student("����");
		s1.singASong();
		Student.cleanClassroom();
	}
}
class Student{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void singASong(){
		System.out.println(name + "ϴˢˢ ϴˢˢ ŶŶ~");
	}
	public static void cleanClassroom(){
		System.out.println("һ��һ��������~");
	}
}

