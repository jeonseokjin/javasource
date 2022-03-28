package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx1 {
	public static void main(String[] args) {
		try (Reader reader= new FileReader("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\file1.txt");){
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.println(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
