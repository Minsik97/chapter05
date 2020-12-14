package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {
		
		
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		
		
		
		System.out.println("복사 시작");
		byte[] buff = new byte[1024];
		
		while(true) {
			int bData = in.read(buff);
			if(bData == -1) {
				System.out.println("복사 끝");
				break;
			}
			out.write(buff);
			
		}
		
		
		
		/*
														//파일이 없을 수도 있으니 예외처리 해야 함.
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		// 추상 클래스 			//자식 클래스
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
																		// 인풋꺼랑 덮어쓰기 때문에 이름을 살짝 바꿈
		
		System.out.println("복사시작");
		while (true) {
			int bData = in.read();
			if (bData == -1) {// 데이터의 마지막을 체크
				System.out.println("복사끝");
				break; // 마지막 데이터면 반복문 탈출
			}
			out.write(bData);// 데이터가 있으면 쓴다.
		}
		
		out.close();	//out, in 스트림은 꼭 닫아줘야 함 
		in.close();
		//빨대 정리
		*/
		
		out.close();
		in.close();
		
	}

}
