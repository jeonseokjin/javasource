package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
//		//입력 : 키보드
//		InputStream in=System.in; //System.in => 키보드 //System.out => 화면
//		int input=0;
//		try {
//			while(in.read()!=-1) {
//				//read() : 한 바이트만 읽어옴
//				
//			System.out.println((char)input);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//	 			in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} 
//		
		//try-with-resource 형태로 변경
		try(InputStream in=System.in) {
		    int input=in.read();
			System.out.println((char)input);
			}
		 	catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

