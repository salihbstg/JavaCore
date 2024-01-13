
public class Main {

	public static void main(String[] args) {
		String[] stdizi= {"Salih","Tuce"};
		Integer [] intdizi= {1,2,3,4};
		Character [] chdizi= {'a','b'};
		Veriyazdir<String> styazdir=new Veriyazdir<>();
		styazdir.yazdir(stdizi);
		Veriyazdir<Integer> intyazdir=new Veriyazdir<>();
		intyazdir.yazdir(intdizi);
		Veriyazdir<Character> chyazdir=new Veriyazdir<>();
		chyazdir.yazdir(chdizi);
		
	}
	
}
class Veriyazdir<Gelenveri>{
	//<Gelenveri> kısmına ne yazarsan yaz neesne oluştururken <Integer> yazarsan <Gelenveri> olan her yer <Integer> olur ve int veriden başkasını kabul etmez
	public void yazdir(Gelenveri[] a) {
	for(Gelenveri gecici:a) {
		System.out.println(gecici);
	}
	
	}
}