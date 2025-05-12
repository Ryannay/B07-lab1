package polynomial;

public class Polynomial {
	double[] coef_;
	
	public Polynomial() {
		
	}
	
	public Polynomial(double[] coef_) {
		for (int i=0; i<coef_.length; i++) {
			this.coef_[i] = coef_[i];
		}
	}
	
	public int length(Polynomial coefs) {
		return coefs.coef_.length;
	}
	
	public Polynomial add(Polynomial c1) {
		int length = 0;
		Polynomial added = new Polynomial(this.coef_); 
		
		if (length(c1) < length(this)) {
			length = length(c1);
		}
		else {
			length = length(this);
			added = new Polynomial(c1.coef_);
		}
		// Below is thought. Try to debug.
		
		for (int i=0; i<length; i++) {
			added.coef_[i] += this.coef_[i];
		}
		
		return added;
	}
	
	public double evaluate(double x) {
		double sum = 0;
		
		for (int i=0; i<length(this) ; i++) {
			sum += this.coef_[i] * Math.pow(x, i);
		}
		
		return sum;
	}
	
	public boolean hasRoot(double x) {
		if (this.evaluate(x) == 0) {
			return true;
		}
		return false;
	}
}
