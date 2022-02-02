package ex18;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		System.out.println(arrayList.toString());
		
		
		arrayList.set(2,"sss22");
		System.out.println(arrayList.toString());
		
		
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		System.out.println(arrayList.size());
		
		arrayList.clear();
		System.out.println(arrayList.toString());
		
		arrayList = null;
		System.out.println(arrayList);
		
		
		
	}

}
