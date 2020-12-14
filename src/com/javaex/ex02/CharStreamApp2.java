package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		//Reader fr = new FileReader("C:\\javaStudy\\MS949.txt"); //글자 깨짐 현상
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String str = br.readLine();		//한줄 씩 읽어오기 위함. (줄바꿈 기호는 제외)
			if(str == null) {
				break;
			}
			
			System.out.println(str);
		}

		fr.close();

	}

}
