package io;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx1 {
	public static void main(String[] args) {
		try(Writer writer = new FileWriter("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\file3.txt",true)){
			writer.write("FileWriter는 한글로 된\r\n");
			writer.write("문자열을 출력할 수 있다.\r\n");
			writer.write("writer 클래스는 문자 단위의\r\n");
			writer.write("출력만 가능합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
