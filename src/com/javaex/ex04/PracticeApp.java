package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PracticeApp {

	public static void main(String[] args) throws IOException {

		Reader r = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		List<Practice> rList = new ArrayList<Practice>();

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] ss = str.split(",");
			
			Practice pp = new Practice(ss[0], ss[1], ss[2]);
			
			rList.add(pp);
			
		}
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).showInfo();
			System.out.println("");
		}
		
		br.close();

	}

}
