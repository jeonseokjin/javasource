package exam;

public class Won2Dollar extends Converter{
	double ratio=1200;
	@Override
	protected double convert(double src) {
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "¿ø";
	}

	@Override
	protected String getDestString() {
		return "´Þ·¯";
	}

}
