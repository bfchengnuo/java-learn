public class Exec1{
	public static void main(String[] args){
		String str = "�Ժ��Ҳ��º���Ƥ ���Ժ��ҵ��º���Ƥ";
		//��ͳ�ƺ��ҳ��ֵĴ���...
		//1st way: split()
		String[] data = (str+"!").split("����");
		System.out.println(data.length-1);
		//2nd way: replaceFirst() + while + contains()
		/*
		int count = 0;
		while(str.contains("����")){
			str = str.replaceFirst("����","����");
			count++;
		}
		System.out.println(count);
		*/
		//3rd way: replace() + length()
		int len1 = str.length();
		str = str.replace("����","⨺���");
		int len2 = str.length();
		System.out.println(len2 - len1);










	}
}