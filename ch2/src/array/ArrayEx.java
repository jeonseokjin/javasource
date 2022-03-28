package array;

//배열 : 같은타입, 연속적으로 저장 => heap공간에 저장(new 키워드 필요)
//		기본값으로 초기화를 해줌(정수 : 0, 실수 : 0.0, boolean : false)

public class ArrayEx {
	public static void main(String[] args) {
		//5개의 변수(정수타입)
		int num1=3, num2=4, num3=5, num4=6, num5=7;
		int num6;
		
//		System.out.println(num6);
		
		//배열 선언 및 생성
		boolean arr[]=new boolean[5];
		int arr1[]=new int[5];
		System.out.println(arr);
		arr[3]=true;
		System.out.println(arr[3]);
		arr1[2]=123;
		System.out.println(arr1[2]); //index 번호는 0번부터 시작
		
		//int arr[] = {3,4,5,6,7};
	}
}
