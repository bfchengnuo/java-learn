public class TestArray{
	public static void main(String[] args){
		//int[] data1 = new int[3];//{0,0,0}
		//int[] data2 = new int[]{11,22,33};//�ĺ���
		int[] data = {11,22,33};
		System.out.println(data.length);
		System.out.println(data[1]);
		System.out.println("====���������ķָ���====");
		for(int x = 0;x<data.length;x++){
			System.out.println(data[x]);
		}
		System.out.println("====���������ķָ���====");
		for(int x : data){
			System.out.println(x);
		}
	}
}