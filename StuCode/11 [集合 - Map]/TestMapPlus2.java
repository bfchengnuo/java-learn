import java.util.*;
public class TestMapPlus2{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<>();
		map.put("С��",210);
		map.put("С��",160);
		map.put("С��",720);

		Set<String> ks = map.keySet();
		ks.remove("С��");
		System.out.println(ks.size());//2
		System.out.println(map.size());//2

	}
}