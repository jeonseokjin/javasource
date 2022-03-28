package forjava.eclipse.object;
class MultipleCalculator extends Calculator3{
	public void multiple() {
		System.out.println(this.left*this.right);
	}
}
class ExtractionCalculator extends MultipleCalculator{
	public void Extraction() {
		System.out.println(this.left-this.right);
	}
}
public class CalculatorExtends {

	public static void main(String[] args) {
		ExtractionCalculator c1= new ExtractionCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiple();
		c1.Extraction();

	}

}
