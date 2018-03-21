public class TestArrayList8{
	public static void main(String[] args){
		EtoakList list = new EtoakList();
		list.add(111);
		list.add(222);
		list.add(333);

		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
//ģ��ʵ��ArrayList���к��Ĺ���
class EtoakList{
	private Object[] data;
	private int size;//0
	public EtoakList(int x){
		data = new Object[x];
	}
	public EtoakList(){
		this(10);
	}
	//�õ�Ԫ�ظ����ķ��� size()
	public int size(){
		return size;
	}
	//�õ��ڼ���Ԫ�صķ��� get()
	public Object get(int x){
		return data[x];
	}
	//���Ԫ�صķ��� add()
	public void add(Object obj){
		if(size == data.length){//������Ѿ�����
			Object[] temp = new Object[size*3/2+1];//����һ��������¿�
			System.arraycopy(data,0,temp,0,size);//���Ͽ�����İ���ת�Ƶ��¿���
			data = temp;//�����¿�(�ӵ��Ͽ�)
		}
		data[size++] = obj;//���°��ӷ������
	}
	//ɾ��Ԫ�صķ���1 remove(int)
	public void remove(int x){
		System.arraycopy(data,x+1,data,x,size-- - x-1);
	}
	//ɾ��Ԫ�صķ���2 remove(Object)
	public void remove(Object obj){
		for(int i = 0;i<size;i++){
			if(obj.equals(data[i])){
				remove(i);
				return;
			}
		}
	}
}






