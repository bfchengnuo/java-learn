public class TestFinalize{
	public static void main(String[] args){
		while(true){
			Teacher tea = new Teacher("Jay");
			//����������ٻ�gc
			System.gc();
			//Runtime.getRuntime().gc();
		}
	}
}
class Teacher{
	String name;
	public Teacher(String name){
		this.name = name;
		System.out.println("һ����ʦվ����~");
	}
	@Override
	public void finalize(){
		System.out.println("һ����ʦ����ȥ~");
	}
}