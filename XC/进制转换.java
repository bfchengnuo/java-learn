/*
���ڽ��Ƶ�ת��
��ʽ��
jz(ʮ��������ת���Ľ���)
*/
class jinzhi
{
	public static void main(String[] args)
	{
		jz a = new jz();
		a.show(16,16);
		
		/* ���᷵������
		int[] arr = jz(10,2);
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i]); */
	}
	
}

class jz
{
	int [] arr = new int[15];
	char[] biao = {'0','1','2','3','4',
					'5','6','7','8',
					'9','A','B','C',
					'D','E','F'};
	int js = arr.length;
	
	void show(int x,int s)
	{
		if(s == 2)
			jzzh(x,1,1);
		else if(s == 8)
			jzzh(x,7,3);
		else if(s == 16)
			jzzh(x,15,4);
		else
			System.out.println(-1);
			//return -1;
	}
	void jzzh(int x,int y,int z)//x ԭ�� y �ڵ��� z �ƶ���
	{
		while(x != 0)
		{
			arr[--js] = x&y;
			x = x>>>z;
		}
		//��ӡһ��д�˰�
		for(int i = js;i < arr.length;i++)
		{
			System.out.print(biao[arr[i]]);
		}
	}
	
	
	
	
	  
	  //�Ҳ��̶õ���ʷ
	 /* 
	̫�鷳�� ����
	jz(int x,int s)
	{
		if(s == 2)
		{
			 jzs(x,s);
		}
		else if (s == 8)
		{
			 jzs(x,7);
		}
		else if(s == 16)
		{
			 jzs(x,15);
		}
		else
			return -1;
	} *
	void show()
	{
		 int [] arr = new int[15];
		int i;
		for(i = 0;x != 0;i++)
		{
			arr[i] = x&(s-1);
			x = x >>> 1;
			
		} 
		for( i = 14;i >= 0;i--)
			System.out.print(arr[i]);
	}
	void shows()
	{
		System.out.println("yes");
	}
	 */
}