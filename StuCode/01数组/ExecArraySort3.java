public class ExecArraySort3{
	public static void main(String[] args){
		int[] data = {65,128,133,68,240,55};
		//��֪ ���鵱�е�Ԫ�ش���һ��ͬѧ������
		//���� ��λ�ǲ�ͬ�� 100���µĶ��ǹ��� 100���ϵĶ��ǽ�
		//�밴���ṩ�ɸߵ��ͽ�������
		for(int x = 0;x<data.length-1;x++){
			for(int y = 0;y<data.length-1-x;y++){
				int num1 = data[y] < 100 ? data[y]<<1 : data[y];
				int num2 = data[y+1] < 100 ? data[y+1]<<1 : data[y+1];
				if(num1 < num2){
					int temp = data[y];
					data[y] = data[y+1];
					data[y+1] = temp;
				}
			}
		}
		for(int x : data)
			System.out.println(x);
	}
}