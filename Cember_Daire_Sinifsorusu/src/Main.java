


public class Main {

	public static void main(String[] args) {
		
		Cember n1=new Cember(2.0f);
		System.out.println(n1.alan());
		System.out.println(n1.cevre());
	
		
		
	}
	
}

class Cember{
	
	private double cap;
	
	public Cember(double cap) {
		
		this.cap=cap;
		
	}
	public double cevre() {
		
		return (double)2.0f*Math.PI*cap;
		
	}
	public double alan() {
		
		return (double)Math.PI*cap*cap;
	}
	
	
}