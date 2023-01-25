package com.arraylist;

import java.util.*;

public class Arral {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("shashank");
		al.add("alok");
		al.add("nishant");
		System.out.println(al);
//for(String s:al)
		// System.out.println(s);

		for (int i = 0; i < al.size(); i++) {
			if (i == 2) {
				al.add("manoj");
			}

		}
		System.out.println(al);
	}
}