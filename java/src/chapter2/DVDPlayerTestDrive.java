package chapter2;

class DVDPlayer{
	boolean canRecord = false;
	
	void recordDVD(){
		System.out.println("DVD recording");
	}
}

public class DVDPlayerTestDrive {
	public static void main(String[] args){
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		
		if(d.canRecord == true){
			d.recordDVD();
		}
	}
}
