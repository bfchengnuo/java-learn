public class ExecToString{
	public static void main(String[] args){
		Student s1 = new Student("С��",60,20,80);
		Student s2 = new Student("С��",100,60,100);
		Student s3 = new Student("С��",500,100,100);//�Ҽ�С��
		System.out.println(s1);//С��[����]
		System.out.println(s2);//С��[����]
		System.out.println(s3);//С��[����]
		/*
			100 ����	����
			100-200		����
			200-299		����
			300			����
		*/
	}
}
class Student{
	String name;
	int chinese;
	int math;
	int english;
	public Student(String a,int b,int c,int d){
		name = a;
		chinese = b;
		math = c;
		english = d;
	}
	@Override
	public String toString(){
		/*
		StringBuffer ok = new StringBuffer(name);
		ok.append(" [").append(chinese+math+english).append("]");
		return ok.toString();
		*/
		//return name + " ["+(chinese + math + english) + "]";//60��
		int score = chinese + math + english;
		StringBuffer ok = new StringBuffer(name);
		ok.append(" [");
		String[] data = {"����","����","����","����"};
		int index = score / 100;//0-99
		if(index < 0 || index > data.length-1)
			throw new RuntimeException("���Գɼ���bug �������ؿ�");
		ok.append(data[index]).append("]");
		return ok.toString();
		/*
		int score = chinese + math + english;
		if(score < 100)
			ok.append("����]");
		else if(score < 200)
			ok.append("����]");
		else if(score < 300)
			ok.append("����]");
		else
			ok.append("����]");
		return ok.toString();
		*/


	}
}




