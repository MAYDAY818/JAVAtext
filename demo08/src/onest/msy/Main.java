package onest.msy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list示例程序
		List<String> list = new ArrayList<String>();
		list.add("mengsy");
		for(int i=0;i<10;i++) {
			list.add("mengsy"+i);
		}
//		list.add(new Student());
		for(int i=0;i<list.size();i++) {
			String string = list.get(i);
			System.out.println();
		}
		//		linkedList示例程序
//		List list2 = new LinkedList();
//		list2.add(new Student());
//		for(int i=0;i<10;i++) {
//			list2.add("mengsy"+i);
//		}
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i));
//		}
		//HashSet示例程序
//		Set set = new HashSet();
//		set.add("a");
//		set.add("b");
//		set.add("mengsy");
//		set.add("a");
//		set.add(new Student());
//		set.add(new Student());
//		System.out.println(set.toString());
		//HashSet中判断对象是否相等
//		String s1 = new String("a");
//		String s2= new String("a");
//		Student ss1 = new Student();
//		ss1.setSname("张三");
//		ss1.setSno("201215121");
//		Student ss2 = new Student();
//		ss2.setSname("张三");
//		ss2.setSno("201215121");
//		//ss1.equals(ss2);
//		set.add(ss1);
//		set.add(ss2);
//		System.out.println(ss1.hashCode());
//		System.out.println(ss2.hashCode());
//		System.out.println(ss1.equals(ss2));
//		System.out.println(set.toString());
		
		//Set实现比较
		HashSet<String> set1 = new HashSet<String>();
		set1.add("B");
		set1.add("A");
		set1.add("D");
		set1.add("E");
		set1.add("C");
		set1.add("F");
//		set1.add(new Student());
		Iterator<String> iterator = set1.iterator();
		
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
//		System.out.println("HashSet中的顺序是："+set1);
//		
//
//		LinkedHashSet set2 = new LinkedHashSet();
//		set2.add("B");
//		set2.add("A");
//		set2.add("D");
//		set2.add("E");
//		set2.add("C");
//		set2.add("F");
//		System.out.println("LinkedHashSet中的顺序是："+set2);
//		
		TreeSet set3 = new TreeSet();
		Student s1 = new Student();
		s1.setSno("201215123");
		Student s2 = new Student();
		s2.setSno("201215122");
		System.out.println(s1);
		System.out.println(s2);
		
		set3.add(s1);
		set3.add(s2);
		System.out.println(set3);
		set3.add("B");
		set3.add("A");
		set3.add("D");
		set3.add("E");
		set3.add("C");
		set3.add("F");
		Iterator iterator2 = set3.iterator();
		while(iterator2.hasNext()) {
			Object next = iterator2.next();
			String s = (String)next;
		}
		
//		System.out.println("TreeSet中的顺序是："+set3);
		//HashMap示例程序
		Map<Integer,Student> map = new HashMap<Integer,Student>();
//		map.put(1, "mengsy");
//		map.put(1, new Student());
//		map.put(3, "mengsy");
//		map.put(2, "zhangsan");
//		map.put("mengsy", paramE);
		map.put(1, new Student());
		map.put(2, new Student());
//		map.put("3", new Student());
//		//第一种遍历Map
//		Set entrySet = map.entrySet();
//		Iterator iterator2 = entrySet.iterator();
//		while(iterator2.hasNext()) {
//			Map.Entry next = (Entry) iterator2.next();
//			System.out.println(next.getKey()+":"+next.getValue());
//		}
//		//第二种遍历
//		Set keySet = map.keySet();
//		Iterator iterator3 = keySet.iterator();
//		
//		while(iterator3.hasNext()) {
//			Object key = iterator3.next();
//			Object value = map.get(key);
//			System.out.println(key+"="+value);
//		}
////		Set keyset = map.keySet();
////		System.out.println(keyset);
//		Collection c = map.values();
//		System.out.println(c);
////		
////		Object object = map.get("mengsy");
////		System.out.println(object);
		
		
		
		Classes classes = new Classes();
		
		List<Student> studentList = new ArrayList<Student>();
		classes.allStudnet(studentList);
	}

}
