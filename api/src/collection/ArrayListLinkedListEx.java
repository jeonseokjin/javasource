package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 순차적으로 추가, 삭제하는 경우는 ArrayList 가 LinkedList 보다 빠름
 * 중간에 데이터를 추가, 삭제하는 경우는 LinkedList 가 ArrayList 보다 빠름
 */


public class ArrayListLinkedListEx {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(2000000);
		LinkedList<String> ll = new LinkedList<String>();
		
		System.out.println("---순차적 추가---");
		
		public static long add1(List<String> list) {
			long start = System.currentTimeMillis();
			for(int i=0; i<1000000; i++) {
				list.add(i+"");
			}
			long end = System.currentTimeMillis();
			return end-start;
		}
		public static long add12(List<String> list) {
			long start = System.currentTimeMillis();
			for(int i=0; i<10000; i)
		}
		public static long add1(List<String> list) {
		}
		public static long add1(List<String> list) {
		}
	}
}
