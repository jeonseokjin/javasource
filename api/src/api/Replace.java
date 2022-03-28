package api;

public class Replace {
	public static void main(String[] args) {
		//String :imutable(객체)
		String str1 = "Hello Java";
		str1.replace("java", "자바");
		System.out.println(str1);
		
		
		String str2="hellow";
		str2+="안녕하세요";
		str2+="반갑습니다";
		str2+="감사합니다";
		System.out.println(str2);
		
	}
}
