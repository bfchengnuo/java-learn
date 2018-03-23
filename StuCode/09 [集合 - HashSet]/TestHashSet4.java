import java.util.*;
/*
	��ʵ���Ԫ�ص������Ƚϲ��� ��ֹ�������� ��������
	       1st.      2nd.     3rd.
		hashCode()	  ==	equals()

		1st && (2nd || 3rd)
*/
public class TestHashSet4{
	public static void main(String[] args){
		Set<Teacher> set = new HashSet<>();
		Teacher tea = new Teacher("Jay");
		set.add(tea);
		set.add(tea);
		System.out.println(set.size());//?
	}
}
class Teacher{
	String name;
	public Teacher(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return name;
	}
	@Override
	public int hashCode(){
		return 1;
	}
	@Override
	public boolean equals(Object obj){
		return false;
	}
}