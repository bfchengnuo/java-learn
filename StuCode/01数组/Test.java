public class Test{
	public static void main(String[] args){
		int x = 123;//data[y]   data[y+1]
		System.out.println(x / 100);//��λ
		System.out.println(x / 10 % 10);//ʮλ
		System.out.println(x % 10);//��λ
		int s1 = (x / 100) + (x / 10 % 10) + (x % 10);
	}
}