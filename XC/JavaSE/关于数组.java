class shuzu
{
	public static void main(String[] args)
	{
		
		
		int[] arr = {1,2,3};
		
		int[][] arr2 = new int[3][3];
		
		int[][] arr3 = new int[3][];  //������������
		arr3[0] = new int[3];
		arr3[1] = new int[2];
		
		System.out.println(arr3);
		System.out.println(arr3[0].length+arr3[1].length);
	}
}

/* 
int [] arr = new int []
int [] arr = new int [] {1,2}
int [] arr = {1,2,3}
arr.length   ��������ĳ���

��ά����

int [][] arr = new int [2][3]
int [][] arr = new int [3][]
	arr[0] = new int [4]
	arr[0] = new int [5]  //��ͬ�ĳ���
int [][] arr = {{},{},{}}    һ�ֳ�ʼ����ʽ
	
ֱ�Ӵ�ӡ��������ʾ��ϣֵ  [I@be880  @�ұ��ǹ�ϣֵ����߱�ʾһ������ int����
int[][] arr = new int [2][]  ��ӡarr[0]ֱ����null

��ӡ��ά���ֵĳ��ȣ���ʵ����һά����ĸ��� arr.length
��ӡԪ�ظ���  arr[1].length 
*/