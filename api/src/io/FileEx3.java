package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {
	public static void main(String[] args) {
		
		File test = new File("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test");
		File dir = new File("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\dir");
		File file1 = new File("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\file1.txt");
		File file2 = new File("C:\\Users\\seok jin jeon\\Desktop\\seok jin\\test\\file2.txt");
		File file3 = new File(test,"file3.txt");
		File file4 = new File(dir,"file4.txt");
		
		//디렉토리 생성 
		if(!dir.exists()) { 
			dir.mkdirs();
		}
		
		//파일 생성
			try {
				if(!file1.exists()) {
				file1.createNewFile();
			    }
				if(!file2.exists()) {
				file2.createNewFile();
				}
				if(!file3.exists()) {
				file3.createNewFile();
				}
				if(!file4.exists()) {
				file4.createNewFile();
				}
			}
				catch (IOException e) {
				e.printStackTrace();
				}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:MM");
			System.out.println("   날짜         시간       형태         크기      이름");
			System.out.println("------------------------------------------------");
			
			
			
			File[] files=test.listFiles();
			for(File f:files) {
				System.out.print(sdf.format(new Date(f.lastModified())));
				if(f.isDirectory()) {
					System.out.print("\t<DIR>\t\t\t"+f.getName());
				}else {
					System.out.print("\t\t\t"+f.length()+"\t"+f.getName());
				}
				System.out.println();
			}
		}
	}


