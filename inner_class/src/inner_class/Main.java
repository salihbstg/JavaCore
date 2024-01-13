package inner_class;

public class Main {

	public static void main(String[] args) {
		String[] dizi= {"salih","sezin","tuce"};
		Yaziciclass a=new Yaziciclass();
		a.defaultMetod(dizi);
		Yaziciclass.StringDiziYazdir degisken=new Yaziciclass().new StringDiziYazdir(dizi);
		System.out.println(degisken.sinif2nesne1);
		
		//iç içe classların nesnelerinin oluşturulması
		A.B.C degiskenc=new A().new B().new C(); // C classı
		degiskenc.cfonks();
		A.B degiskenb=new A().new B(); // B classı
		degiskenb.bfonks();
		A degiskena=new A(); // A classı
		degiskena.afonks();
	}
	
}
class Yaziciclass{
	
	private int privateDegisken;
	int defaultDegisken=5;
	protected int protectedDegisken;
	public int publicDegisken;
	
	void defaultMetod(String[] dizi) {
		StringDiziYazdir a=new StringDiziYazdir(dizi);
		System.out.println(a.sinif2nesne1);
	}
	protected void protectedMetod() {
		
	}
	public void publicMetod() {
		 
	}
	
	 class StringDiziYazdir{
		public int sinif2nesne1=9;//Dışardaki sınıf bu değişkene nesne üretmeden ulaşamaz
		public int sinif2nesne=19; //Dışardaki sınıf bu değişkene nesne üretmeden ulaşamaz
		public StringDiziYazdir(String[] a ) {
			
			System.out.println(defaultDegisken);
			System.out.println(publicDegisken);
			System.out.println(privateDegisken);
			System.out.println(protectedDegisken);
			
			/*
			 * Yorum satırına almazsak fonksiyonlar boş olduğu için çalışma zamanı hatası
			publicMetod();
			privateMetod();
			defaultMetod(a);
			protectedMetod();
			*/
			
			
			for(String gecici:a) {
				System.out.println(gecici);
			}
			
		}
		
	}
}
//3 tane iç içe class
class A{
	
	public void afonks() {
		
	}
	class B{
		
		public void bfonks() {
			
		}
		class C{
			
			public void cfonks(){
				
			}
			
		}
		
	}
	
	
}


