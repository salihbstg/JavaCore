package tuce;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HeartShape {
    
	
	public static void main(String[] args) {

		ArrayList<Integer> arrayList=new ArrayList<>();
		LinkedList<Integer> linkedList=new LinkedList<>();
		
		
		long baslangicSuresi=System.currentTimeMillis();
		listeDoldur(arrayList);
		long bitisSuresi=System.currentTimeMillis();
		System.out.println("ArrayList:" +(bitisSuresi-baslangicSuresi)+"ms");
		System.out.println(arrayList);
		
		baslangicSuresi=System.currentTimeMillis();
		listeDoldur(linkedList);
		bitisSuresi=System.currentTimeMillis();
		System.out.println("LinkedList:"+(bitisSuresi-baslangicSuresi)+"ms");
		System.out.println(linkedList);
		
		
		
		
		
    	
    }

	private static void listeDoldur(List<Integer> liste) {

		for(int i=0;i<1000;i++) {	
			int uretilenSayi=(int)(Math.random()*1321);
			listeSirala(uretilenSayi,liste);
		}
	}

	private static boolean listeSirala(int uretilenSayi, List<Integer> liste) {

		ListIterator<Integer> ite=liste.listIterator();

		
		
		while(ite.hasNext()) {
			int karsilastirmaSonucu=ite.next().compareTo(uretilenSayi);
			if(karsilastirmaSonucu>0) {	
				ite.previous();
				ite.add(uretilenSayi);
				return true;
			}
			else if(karsilastirmaSonucu==0) {
				
				
				ite.add(uretilenSayi);
				return true;
			}
		
		}
		ite.add(uretilenSayi);
		return true;
		
		
	}

		
}
