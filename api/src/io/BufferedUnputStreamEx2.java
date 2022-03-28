package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedUnputStreamEx2 {
	public static void main(String[] args) {
		try (FileInputStream fis =new FileInputStream("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\pawel.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\copu.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			int data;
			while((data=bis.read()!=-1))
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
