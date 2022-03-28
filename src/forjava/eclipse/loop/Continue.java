package forjava.eclipse.loop;

public class Continue {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
			} System.out.println("coding everybody"+i);  //continue는 if문에 해당되는 참일때만 작동되고 거짓일때는 똑같이 for문이 작성된다. 따라서 i==5일때만 작동된다.
			
		}

	}

}
