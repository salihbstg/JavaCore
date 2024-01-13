
public class Main {

	public static void main(String[] args) {
		
		Araba arabam=new Araba();
		arabam.hareket();
		arabam.fren();
		arabam.arabayi_kapat();
		
		
	}
	
}
class Motor{
	
	private String motor,model,beygir;
	
	public Motor() {
		
		model="Honda";
		motor="1.6";
		beygir="165";
		System.out.println("Motor olusturuldu.");
	}
	public void calistir() {
		
		System.out.println("Motor calistirildi.");
		
	}
	public void durdur() {
		
		System.out.println("Motor durduruldu.");
		
	}
	
	
}

class Araba{
	private String renk,kapi,uretim_yili;
	Motor motorum;
	
	public Araba() {
		motorum=new Motor();
		renk="Kirmizi";
		kapi="4";
		uretim_yili="2010";	
	}
	public void hareket() {
		
		motorum.calistir();
		System.out.println("Hareket ediliyor");
		
	}
	public void fren() {
		
		System.out.println("Frene basildi.");
		
	}
	public void arabayi_kapat() {
		
		System.out.println("Hiz sifirlandi.");
		motorum.durdur();
		
	}
	
	
}
