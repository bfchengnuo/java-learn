public class TestArraySort{
	public static void main(String[] args){
		int[] data = new int[]{53,87,66,39,14};
		//�ܹ���Ҫѡ���ٸ�������
		for(int i = 0;i<data.length-1;i++){
			//һ�δ�ͷ��β�ıȽ� = ѡһ�������Ĺ���
			for(int j = 0;j<data.length-1-i;j++){
				if(data[j] > data[j+1]){//ǰ���С
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		for(int x : data){
			System.out.println(x);
		}

	}
}