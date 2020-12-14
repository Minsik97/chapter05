package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PersonApp2 {

	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		List<Person> pList = new ArrayList<Person>();

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] pArr = str.split(",");
			
			Person pp = new Person(pArr[0], pArr[1], pArr[2]);
			
			pList.add(pp);
		}

		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).showInfo();
		}

	}

}
