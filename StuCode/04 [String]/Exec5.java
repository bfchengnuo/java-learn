public class Exec5{
	public static void main(String[] args){
		String str = "�����:25,�����޵�:60,����:30"
			+ ",�Ʋ�:40,���¸�:55,��־ӱ:55";
		//��ͳ���ܹ��ж��ٸ������������ֵ�����
		{
			String[] data = str.split(",");
			for(String x : data){
				int index = x.indexOf(":");
				String n = x.substring(0,index);
				if(n.length() == 3){
					System.out.println(n);
				}
				/*
				String[] na = x.split(":");
				if(na[0].length() == 3){
					System.out.println(na[0]);
				}
				*/

			}
		}

		//���ӡ����40-60�������
		{
			String[] data = str.split(",");
			//�����޵�:60
			for(String x : data){
				String name = x.substring(0,x.indexOf(":"));
				String age = x.substring(x.indexOf(":")+1);
				if("60".equals(age) || age.startsWith("4") || age.startsWith("5")){
					System.out.println(name);
				}
			}
		}
	}
}