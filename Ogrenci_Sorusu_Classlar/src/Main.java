
public class Main {

	public static void main(String[] args) {
		
		Ogrenci a=new Ogrenci(12,100);
		System.out.println(a.getid());
		
	}
	
}

class Ogrenci{
	
	private int id;
	private int not;
	
	public Ogrenci(int id,int not) {
		
		this.id=id;
		this.not=not;
		
	}
	
	public int getid() {
		
		return id;
	}
	public int getnot() {
		return not;
	}
	
	
	
	
	
}
		
