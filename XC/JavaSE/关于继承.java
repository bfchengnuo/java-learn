class jicheng
{
	public static void main(String[] args)
	{
		Zi s = new Zi();
		s.show();
	}
}

class Fu
{
	int number = 3;
	Fu()
	{
		ʡ���� super() �κ���Ĺ��ԣ����� object��������������Ѿ�����
		show();
		return ;
	}
	// �����ǣ�����ĵ��û����ȴ���������ң����ⱻ����ʹ��final���η�
	void show()
	{
		System.out.println("fu number="+number);
	}
}

class Zi extends Fu
{
	int number = 5;
	Zi()
	{
		super();
		// �ֽ��ߣ�������ſ�ʼ��ʾ��ʼ������ʼ��������ɺ�
		System.out.println("zi-- number="+number);
	}
	void show()
	{
		System.out.println("zi number="+number);
	}
}