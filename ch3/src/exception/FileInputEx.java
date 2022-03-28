package exception;

import java.io.FileInputStream;


/*
 *  try{} : 단독 사용 불가
 *  try{}catch{}
 *  try{}finally{}
 *  try{]catch{]finally{} : 처럼 같이 써주어야한다.
 */
public class FileInputEx {
	public static void main(String[] args) {
//		FileInputStream fis=null;
//		try {
//			fis = new FileInputStream("file.txt"); 
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {  //자원해제
//			try {
//				fis.close();
//			} catch (Exception e2) {
//				e.printStackTrace();
//			}
		try(FileInputStream fis=new FileInputStream("file.txt")) {
			
		} catch(Exception e) {
		}
		
	}
}
