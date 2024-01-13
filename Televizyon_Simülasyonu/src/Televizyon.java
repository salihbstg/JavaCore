import java.util.ArrayList;

public class Televizyon {
	
	private String model;
	private ArrayList<String> kanallar=new ArrayList<>();
	private int ses,acik_kanal;
	private boolean tv_ackapa=false;
	
	Televizyon(String model,ArrayList<String> kanal){
		
		this.model=model;
		this.kanallar=kanal;
		this.ses=0;
		
	}
	public void getModel(){
		
		System.out.println("Model:"+this.model);
		
	}
	public void getKanallar(){
		if(acik_kanal<kanallar.size() && acik_kanal>=0) {
			acik_kanal++;
			System.out.println(acik_kanal+":"+kanallar.get(acik_kanal));
			
			
		}
		if(acik_kanal==kanallar.size()) {
			acik_kanal=0;
		}
		
		
	}
	public void sesKis() {
		if(ses>0) {
			ses-=5;
			System.out.println("Ses kisildi:"+ses);
			}
			else
			System.out.println("Ses zaten"+ses);
	}
	public void sesAc() {

		if(ses<100) {
			ses+=5;
			System.out.println("Ses acildi:"+ses);
			}
			else
			System.out.println("Ses zaten"+ses);
	}
	public void tv_ac() {
		
		if(this.tv_ackapa==false) {
			
			this.tv_ackapa=true;
			System.out.println("TV acildi");
			
		}
		else
			System.out.println("TV zaten acik");
		
		
	}
	public void tv_kapa() {
		
		if(this.tv_ackapa==true) {
			
			this.tv_ackapa=false;
			System.out.println("TV kapandi");
			
		}
		else
			System.out.println("TV zaten kapali");
		
		
	}
	public void kanal_bilgi() {
		System.out.println(kanallar.get(acik_kanal));
		
		
	}
}
