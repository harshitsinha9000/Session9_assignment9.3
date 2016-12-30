package java_session9;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"amit");
		hm.put(102,"vijay");
		hm.put(103,"murali");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getValue());
		}
	}

}
