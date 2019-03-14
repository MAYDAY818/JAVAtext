package specical;

public class Triangle {
	Double a;
    Double b;
    Double c;
    public Triangle(Double a, Double b, Double c) throws SpecialException {
			if (a + b < c) {
				throw new SpecialException();
			} else if (a + c < b) {
				throw new SpecialException();
			} else if (b + c < a) {
				throw new SpecialException();
			}
			this.a = a;
             this.b = b;
             this.c = c;
    }

}
