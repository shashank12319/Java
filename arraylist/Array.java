package com.arraylist;
import java.util.*;
public class Array {

	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		
				for(int element :list) {
			if(element==3) {
				list.remove(element);
			}
		}
		System.out.println(list);
	}
}
