public class ExecArray2{
	public static void main(String[] args){
		int[] data = new int[]{22,87,66,55,91,37};
		//���ҳ����鵱�����ĺ���С��Ԫ��...
		int max = 0,min = 99;
		for(int x : data){
			if(x > max){//�Ƽ�¼��
				max = x;
			}
			if(x < min){//�Ƽ�¼��
				min = x;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
