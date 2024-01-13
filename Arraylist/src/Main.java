import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<telefonlar> telefonlarim=new ArrayList<>();
		telefonlar a=new telefonlar((int) (Math.random()*8030),"Samsung");
		telefonlar b=new telefonlar((int) (Math.random()*6030),"Samsung");
		telefonlar c=new telefonlar((int) (Math.random()*3020),"Samsung");
		
		
		telefonlarim.add(a);//Eleman ekleme
		telefonlarim.add(b);
		telefonlarim.add(c);
		telefonlarim.get(0).getTel();//Eleman getirme
		telefonlarim.remove(a);//a nesnesinin gösterdiği elemanı siler
		telefonlarim.size();//listenin eleman sayisi
		
		Listele(telefonlarim);

		
	}
	public static void Listele(ArrayList<telefonlar> listem) {
		
		for(telefonlar i:listem) {
			
			i.getTel();
			
		}
		
		
	}

}

class telefonlar{
	
	private int fiyat;
	private String model;
	
	public telefonlar(int fiyat,String model) {
		
		this.fiyat=fiyat;
		this.model=model;
		
	}
	public void getTel() {
		
		System.out.println("Model:"+this.model);
		System.out.println("Fiyat:"+this.fiyat);
		
		
	}
	public void zamYap(int a) {
		
		this.fiyat+=a;
		
	}
	
	
	
	
}