public class ExecConstructor3Plus{
	public static void main(String[] args){
		D dd = new D();
	}
}
class A{
	public A(){
		System.out.println("A���޲ι��췽��");
	}
	public A(int x){
		super();
		System.out.println("A��int�������췽��");
	}
}
class C extends A{
	public C(int x){
		super(66);
		System.out.println("C��int�������췽��");
	}
	public C(long x){
		super();
		System.out.println("C��long�������췽��");
	}
}
class D extends C{
	public D(){
		super(77);
		System.out.println("D���޲εĹ��췽��");
	}
}