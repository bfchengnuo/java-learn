public class ExecArray1{
	public static void main(String[] args){
		char[] data = new char[]{'e','t','o','a','k'};
		//���ӡԪ�� o �� k
		System.out.println(data[2]);
		System.out.println(data[4]);
		//��ʹ�����ֲ�ͬ�ķ�ʽ �����������
		for(int i = 0;i<data.length;i++){
			System.out.println(data[i]);
		}
		for(char x : data){
			System.out.println(x);
		}
	}
}