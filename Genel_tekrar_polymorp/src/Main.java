
public class Main {
	
	public static void main(String[] args) {
		
		Kuslar kus2=new Kuslar(false,"11","hava");
		
		Kartal kartalim=new Kartal(false,"22","hava");
		Canli deneme=new Kuslar(true,"11","hava");
		Kuslar deneme2=new Kartal(true,"42","heryer");		
		Kuslar deneme3=new Kartal(false,"22","cehennemin dibinin ortasin");
		Konus(deneme);
		Konus(deneme2);
		Konus(deneme3);
		Konus(kartalim);
		Konus(kus2);
		Canli kus3=new Kuslar(false,"2","hava");
		kus3.AdiniSoyle();
		//nesnenin kuş olduğunu Kuslar sinifina cevirerek belli ettiğimiz için uc fonksiyonunu kullanabildik
		((Kuslar)kus3).uc();
		Canli kartal=new Kartal(true,"21","karada");
		((Kartal)kartal).saldir();
		String yazi1=new String();
		System.out.println(yazi1.hashCode());
		char aa='b';
		char bb='b';
		if(aa==bb) {
			System.out.println("ikisi ayni");
		}
		
	}
	
	public static void Konus(Canli a) {
		a.AdiniSoyle();
	}
}

class Canli{
	private String yas,yasamalani;
	
	public Canli(String yas,String yasamalani) {
		
		this.yas=yas;
		this.yasamalani=yasamalani;
		
	}
	
	public void AdiniSoyle() {
		
		System.out.println("Ben canli sinifinin nesnesiyim "+getYas()+" yasindayim. "+yasamalani+"da yasarim");
		
	}

	public String getYas() {
		
		return yas;
		
	}
	public String getYasamalani() {
		
		return this.yasamalani;
		
	}
}
class Kuslar extends Canli{
	
	private boolean kanat;
	public Kuslar(boolean kanat,String yas,String yasamalani) {
		super(yas,yasamalani);
		this.kanat=kanat;
		
	}
	public void AdiniSoyle() {
		
		if(kanat) {
			System.out.println("Ben Kuslar sinifinin nesnesiyim,kanadim var yasim "+getYas()+" "+getYasamalani()+"da yasarim");
		}
		else
			System.out.println("Ben Kuslar sinifinin nesnesiyim,kanadim yok yasim "+getYas()+" "+getYasamalani()+"da yasarim");
		
		
	}	
	public void uc() {
		
		System.out.println("Kus ucuyor");
		
	}
}
class Kartal extends Kuslar{
	
	public Kartal(boolean kanat,String yas,String yasamalani) {
		
		super(kanat,yas,yasamalani);
				
	}
	public void AdiniSoyle() {
		
		System.out.println("Ben Kuslar sinifinin nesnesiyim,kanadim var ve yirticiyim yasim "+getYas()+" "+getYasamalani()+"da yasarim");
	}
	public void saldir() {
		
		System.out.println("Kartal saldirdi");
		
	}
	
}



