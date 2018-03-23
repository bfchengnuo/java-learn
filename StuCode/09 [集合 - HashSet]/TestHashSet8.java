import java.util.*;
/*
	ʹ��HashSet ǧ��Ҫ�����Ԫ��֮��
	ֱ���޸Ĳ������ɹ�ϣ�������
	����ᵼ�·ǳ����µ����鷢��

	����������һ��Ҫȥ�޸� ������������ɣ�
		1.ɾ��
		2.�޸�����
		3.������� [����ȷ��Ԫ�ظ��ڵ�λ�ã�]
*/
public class TestHashSet8{
	public static void main(String[] args){
		Set<Teacher> etoak = new HashSet<>();
		Teacher tea = new Teacher("Jay",16);
		etoak.add(tea);//tea.hashCode() "Jay"+16
		etoak.remove(tea);//1st.
		tea.age = 61;//2nd.
		etoak.add(tea);
		System.out.println(etoak);

	}
}
class Teacher{
	String name;
	int age;
	public Teacher(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return name + " : " + age;
	}
	@Override
	public int hashCode(){
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(!(obj instanceof Teacher)) return false;
		if(obj == this) return true;
		Teacher t1 = this;
		Teacher t2 = (Teacher)obj;
		return t1.name.equals(t2.name) && t1.age == t2.age;
	}
}