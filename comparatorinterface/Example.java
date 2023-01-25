package com.comparatorinterface;


//Java Program to sort the ArrayList
//in descending order using comparator
import java.util.*;

//create the Laptop class
class Laptop {
	int ModalNo;
	String name;
	int ram;
	Laptop(int ModalNo, String name, int ram)
	{
		this.ModalNo = ModalNo;
		this.name = name;
		this.ram = ram;
	}
}

//creates the comparator for comparing RAM
class RamComparator implements Comparator<Laptop> {
	// override the compare() method
	public int compare(Laptop l1, Laptop l2)
	{
		if (l1.ram == l2.ram) {
			return 0;
		}
		else if (l1.ram < l2.ram) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class Example {
	public static void main(String[] args)
	{
		// create the ArrayList object
		ArrayList<Laptop> l = new ArrayList<Laptop>();
		l.add(new Laptop(322, "Dell", 2));
		l.add(new Laptop(342, "Asus", 8));
		l.add(new Laptop(821, "HP", 16));
		l.add(new Laptop(251, "Lenovo", 6));
		l.add(new Laptop(572, "Acer", 4));

		System.out.println("before sorting");
		System.out.println("Ram"
						+ " "
						+ "Name"
						+ " "
						+ "ModalNo");
		for (Laptop laptop : l) {
			System.out.println(laptop.ram + " "
							+ laptop.name + " "
							+ laptop.ModalNo);
		}
		System.out.println();

		System.out.println("After sorting(sorted by Ram)");
		System.out.println("Ram"
						+ " "
						+ "Name"
						+ " "
						+ "ModalNo");

		// call the sort function
		Collections.sort(l, new RamComparator());
		for (Laptop laptop : l) {
			System.out.println(laptop.ram + " "
							+ laptop.name + " "
							+ laptop.ModalNo);
		}
	}
}
