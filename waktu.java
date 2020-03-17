public class waktu{
	public static void main (String[] args){
			int detik,menit,jam,hasil1,hasil2;
			detik=6500;
			
			jam = detik/3600;
			hasil1 = detik%3600;
			menit = (int) hasil1/60;
			hasil2 = hasil1%60;
		
	System.out.println("Hasil Konversi : " +detik+" Detik = "+jam+" Jam : "+menit+" Menit : "+hasil2+" Detik");	
	}
}