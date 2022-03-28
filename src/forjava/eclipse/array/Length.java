package forjava.eclipse.array;

public class Length {

	public static void main(String[] args) {
		String[] classgroup = new String[4];
		classgroup[0] = "ÃÖÁøÇõ";
		System.out.println(classgroup.length);
		classgroup[1] = "ÃÖÀ¯ºó";
		System.out.println(classgroup.length);
		classgroup[2] = "ÇÑÀÌ¶÷";
		System.out.println(classgroup.length);
		classgroup[3] = "ÀÌ°íÀ×";
		System.out.println(classgroup.length);
	}

}
