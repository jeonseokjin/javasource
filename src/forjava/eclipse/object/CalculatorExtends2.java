package forjava.eclipse.object;
class DivisionCalculator extends ExtractionCalculator{
	public void Division() {
		System.out.println(this.left/this.right);
	}
	public void sum() {
		System.out.println("실행결과는"+(this.left+this.right)+"입니다");
	}
}
public class CalculatorExtends2 {

	public static void main(String[] args) {
          DivisionCalculator c1=new DivisionCalculator();
          c1.setOprands(10,2);
          c1.sum();
          c1.avg();
          c1.multiple();
          c1.Division();
          c1.Extraction();

	}

}
