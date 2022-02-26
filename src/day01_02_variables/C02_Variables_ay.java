package day01_02_variables;

public class C02_Variables_ay {

	public static void main(String[] args) {
		
		String okul="Yildiz Koleji";
		
		// ayni isim ve degisken turu ile ikinci defa variable olusturulamaz
		//String okul="Mehmet Koleji";

		
		// farkli data turu de olsa ayni isim ile ikinci defa variable olusturulamaz
		// int okul=20;
			
		
		// varolan bir variable'a yeni deger atayabiliriz
			okul="Ankara Koleji";	

				
				System.out.println(okul);
				
				//yazdirma isleminde aciklama yazmak istersek
				// mesela okul adi: Mehmet Koleji yazdiralim
				
				
				
				
				System.out.println("okul adi : " + okul);   // okul adi : Ankara Koleji
				System.out.println("okul adi : " + "okul"); // okul adi : okul
	}

}
