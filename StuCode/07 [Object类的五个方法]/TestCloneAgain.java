public class TestCloneAgain{
	public static void main(String[] args)throws CloneNotSupportedException{
		Sheep s1 = new Sheep("Ф��");
		Sheep s2 = s1.clone();
	}
}
class Sheep implements Cloneable{//Ф��
	String name;
	public Sheep(String name){
		this.name = name;
	}
	@Override
	public Sheep clone()throws CloneNotSupportedException{
		Object obj = super.clone();//����Object���clone()����
		return (Sheep)obj;
	}
}