package demo10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public static void aa(int[] is) {
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<is.length;i++) {
			if(map.get(is[i])==null) {
				map.put(is[i], 0);
			}else {

				map.put(is[i], map.get(is[i])+1);
			}
		}
		Set<Integer> keySet = map.keySet();
		for(int key:keySet) {
			Integer value = map.get(key);
			System.out.println(key+" ÖØ¸´´ÎÊý£º"+value);
		}		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		int[] is = {1,3,2,5,4,3,4,3,5,7,7,7,7,7,8,2,9,0};
//		aa(is);
//		for(int i=0;i<100;i++) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		
		new Thread().start();

	}

}
