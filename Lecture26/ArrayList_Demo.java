package Lecture26;

import java.util.*;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		list.add(1, 100);
//		System.out.println(list);
//		System.out.println(list.contains(200));
//		System.out.println(list.indexOf(1000));
//		System.out.println(list.size());

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
		list1.add(list);
		list1.add(list2);
		System.out.println(list1);
//		for(  ArrayList k  : list1) {
//			System.out.println(k);
//		}

//		for (ArrayList k : list1) {
//			for (int i = 0; i < k.size(); i++)
//				System.out.println(k.get(i));
//		}
	}

}
