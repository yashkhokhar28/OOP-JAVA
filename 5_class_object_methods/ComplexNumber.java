class Complex{
	double r;
	double i;

	public Complex(){
		this.r = 0;
		this.i = 0;
	}

	public Complex(double r,double i){
		this.r=r;
		this.i=i;
	}

	public void print(Complex co2){
		String temp = "";
		double tempR = this.r + co2.r;
		double tempC = this.i + co2.i;


		System.out.println(tempR+ " + "+tempC+ "i");
	}

	public void display(){
		System.out.println(r+ " + "+ i+" i ");
	}
}

public class ComplexNumber{
	public static void main(String[] args) {
		Complex co1 = new Complex(1,2);
		Complex co2 = new Complex(1,2);
		co1.print(co2);
	}
}