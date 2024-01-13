import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan=new Scanner(System.in);
	static Televizyon tv;
	static boolean tv_ackapa=false;
	
	public static void main(String[] args) {
		

		menuGoster();
		boolean cikis=false;
		while(!cikis) {
			
			
			int secim=scan.nextInt();
			switch(secim) {
			case 1:
				kurulumYap();
				break;
			case 2:
				televizyonAc();
				break;
			case 3:
				sesAc();
				break;
			case 4:
				sesKapa();
				break;
			case 5:
				kanalDegis();
				break;
			case 6:
				kanalBilgi();
				break;
			case 7:
				tvKapa();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				System.out.println("Sistemden cikiliyor");
				cikis=true;
				break;
			default:
				System.out.println("0-8 arasi bir deger girin");
			
			}
			
		}
		
		
	}

	private static void tvKapa() {
		if(tv!=null) {
		tv_ackapa=false;
		tv.tv_kapa();
		}
		else
			System.out.println("Kurulum yapin");
		
	}

	private static void kanalBilgi() {
		
		if(tv!=null ) {
			if(tv_ackapa==true)
			tv.kanal_bilgi();
			else
			System.out.println("TV'yi acin");
			}
			else
				System.out.println("Kurulum yapin");		
		
	}

	private static void kanalDegis() {
		if(tv!=null ) {
			if(tv_ackapa==true)
			tv.getKanallar();
			else
			System.out.println("TV'yi acin");
			}
			else
				System.out.println("Kurulum yapin");
		
	}

	private static void sesKapa() {
		if(tv!=null) {
			if(tv_ackapa==true)
			tv.sesKis();
			else
				System.out.println("TV'yi acin");
			}
			else
				System.out.println("Kurulum yapin");
				
	}

	private static void sesAc() {
		if(tv!=null) {
			if(tv_ackapa==true)
			tv.sesAc();
			else
				System.out.println("TV'yi acin");
			}
			else
				System.out.println("Kurulum yapin");
	}

	private static void televizyonAc() {
		if(tv!=null) {
			tv_ackapa=true;
			tv.tv_ac();
			}
			else
				System.out.println("Kurulum yapin");
		
	}

	private static void kurulumYap() {
		if(tv==null) {
		System.out.println("TV MARKASI GIRINIZ");
		String tvMarka=scan.next();
		System.out.println("Kac kanal girilecek");
		int kanalsayi=scan.nextInt();
		int sayac=0;
		ArrayList<String> kanallar=new ArrayList<>();
		while(sayac<kanalsayi) {
			kanallar.add(scan.next());
			sayac++;
		}
		tv=new Televizyon(tvMarka,kanallar);
		System.out.println("Kurulum basariyla tamamlandi...");
		}
		else
			System.out.println("kurulum zaten yapildi");
	}

	private static void menuGoster() {

		System.out.println("******************MENU******************");
		System.out.println("0-Cikis\n"
				+ "1-Kurulum yap\n"
				+ "2-Televizyonu ac\n"
				+ "3-Sesi ac\n"
				+ "4-Sesi kapat\n"
				+ "5-Kanal degistir\n"
				+ "6-Kanal bilgisi goster\n"
				+ "7-Televizyonu kapat\n"
				+ "8-Menu goster");
		
	}

}
