package innerclass_hesapmakinesi;

public class Main {

	public static void main(String[] args) {
		
	int a=5,b=10;
	double c=10.4,d=11.4;
	float e=57.33f,f=132.3f;
	Hesaplama sinifim=new Hesaplama();
	Hesaplama.Toplamaislemi toplama=sinifim.new Toplamaislemi();
	Hesaplama.Cikarmaislemi cikarma=sinifim.new Cikarmaislemi();
	Hesaplama.Carpmaislemi carpma=sinifim.new Carpmaislemi();
	Hesaplama.Bolmeislemi bolme=sinifim.new Bolmeislemi();		

	System.out.println("Int toplam:"+toplama.Toplama(a,b));
	System.out.println("Double toplam:"+toplama.Toplama(c,d));
	System.out.println("Float toplam:"+toplama.Toplama(e,f));
	System.out.println("Int cikarma:"+cikarma.Cikarma(a,b));
	System.out.println("Double cikarma:"+cikarma.Cikarma(c,d));
	System.out.println("Float cikarma:"+cikarma.Cikarma(e,f));
	System.out.println("Int carpma:"+carpma.Carpma(a,b));
	System.out.println("Double carpma:"+carpma.Carpma(c,d));
	System.out.println("Float carpma:"+carpma.Carpma(e,f));
	System.out.println("Int bolme:"+bolme.Bolme(a,b));
	System.out.println("Double bolme:"+bolme.Bolme(c,d));
	System.out.println("Float bolme:"+bolme.Bolme(e,f));
	
	
		
	}
		
}

class Hesaplama {

	 class Toplamaislemi{
		
		public int Toplama(int a,int b) {
			
			return a+b;
		}
		public float Toplama(float a,float b) {
			
			return a+b;
		}
		public double Toplama(double a,double b) {
			
			return a+b;
		}				
}
	 class Cikarmaislemi{
		
		public int Cikarma(int a,int b) {
			
			return a-b;
		}
		public float Cikarma(float a,float b) {
			
			return a-b;
		}
		public double Cikarma(double a,double b) {
			
			return a-b;
		}	
}
	 class Carpmaislemi{
		public int Carpma(int a,int b) {
			
			return a*b;
		}
		public float Carpma(float a,float b) {
			
			return a*b;
		}
		public double Carpma(double a,double b) {
			
			return a*b;
		}
	}
	 class Bolmeislemi{
		public int Bolme(int a,int b) {
			
			return a/b;
		}
		public float Bolme(float a,float b) {
			
			return a/b;
		}
		public double Bolme(double a,double b) {
			
			return a/b;
		}
	}
	
}
/*SALİH KOD YAZIYOR HEPSİ GİZLİ DSJFLDSKFHH 
<3 <3 <3 BİDE TUÇEYİ ÇOK SEVİYORUM <3 <3 <3
				19.02.2023
		 Doğum tarihim:06.10.2022
*/