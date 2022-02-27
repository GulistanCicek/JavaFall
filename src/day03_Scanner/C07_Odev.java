package day03_Scanner;

import java.util.Scanner;

public class C07_Odev {

	public static void main(String[] args) {
		// Kullanicidan iki tamsayi alip bu sayilarin toplam, fark ve carpimlarini yazdirin
		
		int a= 12;
		int b= 30;
		
		System.out.println(a+b);  //42
		
		System.out.println(a*b);  //360
		
		System.out.println(a-b);  //-18
		
		// Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
		
		int k=5;
		int s=4;
		
		System.out.println(k*s);   //20
		
		System.out.println(k*k);  //25
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz..");
		
		String isim=scan.nextLine();
				
	    System.out.println("Lutfen soyisminizi giriniz");
		
		String soyisim=scan.nextLine();
		
		System.out.println("girilen isim " + isim + " " + soyisim + " " + "kursumuza katiliminiz icin tesekkür ederiz");
		
		
		


	}

}
