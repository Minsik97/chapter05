package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// 리스트 사용 X
		Reader r = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);

		
		
		String com = "";
		
		while (true) {
			com = br.readLine();

			if (com == null) {
				break;
			}
			String[] data = com.split(",");
			
			System.out.println("이름:" + data[0]);
			System.out.println("핸드폰:" + data[1]);
			System.out.println("회사:" + data[2]);
			System.out.println("");
			
	
		}
			
		
			
		br.close();
	}

}
