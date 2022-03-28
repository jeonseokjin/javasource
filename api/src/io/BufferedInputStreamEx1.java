package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) {
		
		try (
			//InputStream in=new FileInputStream("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\file1.txt");
			//BufferedInputStream bis=new BufferedInputStream(in);
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\file1.txt"));
			//OutputStream out=new FileOutputStream("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\output2.txt");
			//BufferedOutputStream bos=new BufferedOutputStream(out);
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\output2.txt"));){
			
			
			//파일 읽기 => 파일 쓰기
			byte b[]=new byte[1024];
			while(bis.read(b)!=-1) {
				bos.write(b);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
