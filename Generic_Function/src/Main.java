
public class Main {
	
	public static void main(String[] args) {
		String[] stdizi= {"Salih","Tuce"};
		Integer [] intdizi= {1,2,3,4};
		Character [] chdizi= {'a','b'};
		yazdir(stdizi);
		yazdir(intdizi);
		yazdir(chdizi);
	}
	public static <Genel /*(extends Number) yazılırsa sadece numara içerenleri kabul eder string char kabul etmez.*/> void yazdir(Genel[] a) {
		
		for(Genel gecici:a) {
			System.out.println(gecici);
		}
		
	}
}
