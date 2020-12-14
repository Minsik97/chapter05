package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		List<Person> pList = new ArrayList<Person>();

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}
			String[] ss = str.split(",");
			
			Person pp = new Person(ss[0], ss[1], ss[2]);
			
			pList.add(pp);
			
		}
		
		for(int i=0; i<pList.size(); i++) {
			pList.get(i).showInfo();
			System.out.println("");
		}
		
		
		//추가
		Writer w = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(w);
		
		Person p = new Person("채민식", "010-09410-2161", "010-1111-2222");
		pList.add(p);
		
		for(int i=0; i<pList.size(); i++) {
			
		}
		
		
		br.close();

	}

}
