package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Nilesh");
		list.add("Nutan");
		list.add("Nikhil");
		 for (String i:list) {
			 System.out.println(i);
		 }

	}
}
