package oopEx3_1;

public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;
	public MyComplex() {
		this.real= real;
		this.imag=imag;
	}
	public MyComplex(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	@Override
	public String toString() {
		return real+"+"+ imag ;
	}
	public boolean isReal() {
		if(imag==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isImaginary() {
		if(real==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	public boolean equals( MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	public double magnitude() {
		return magnitude(x+yi) = Math.sqrt(x*x + y*y)
	}
}
