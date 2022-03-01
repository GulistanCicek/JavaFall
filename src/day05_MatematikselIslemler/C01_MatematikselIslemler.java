package day05_MatematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
	
          System.out.println(4*(2+5)/2); // 14
        
        
        System.out.println(4*(2+5)/3); // 9   28/3 = 9
        
        // sonucu virgullu yazdirmak istersek
        
        double sonuc=4*(2+5)/3 ; // esitligin solu variable sagi deger(value). burada once deger hesaplaniyor.
                                 // java sonucu virgullu degil tamsayi olarak kabul ediyor. 
                                 //yani double sonuc=9. // ancak syso(sonuc) yazdirirken 
        //sonuc double oldugu icin 9.0 olarak yazdiriyor
        
        
        System.out.println(sonuc); // 9.0 
        
        sonuc= (double)(4*(2+5)/3) ; // parantez ici virgullu ciksa bile tamsayi yazilir. 
        // cunku double isleme girmiyor. asagida sonucu yazdýrýnca double 9'u yazdiriyoruz. o da 9.0 oluyor
        
        
        System.out.println(sonuc); // 9.0
        
        
        sonuc=(double)4 * (2+5)/3 ;
        
        System.out.println(sonuc); // 9.333333333333334
        
        sonuc=4 * (2+5)/(double)3 ; // herhangi bir degiskenin onune double yazilirsa sonuc double olur
        
        System.out.println(sonuc); // 9.333333333333334
        
        
        int sayi1=5;
        int sayi2=2;
        double sayi3=2;
        
        
        System.out.println(sayi1/sayi2); // 5/2=2 iþleme girenlerin ikisi de int oldugu icin 
                                         //    tamsayi degeri alir
        
        System.out.println(sayi1/sayi3); // 5/2=2.5 iþleme girenlerin biri int biri double oldugu icin double
                                         // degeri alir
        
        System.out.println(sayi1+sayi3/sayi2); // 6.0 islemin icinde double oldugu icin sonuc virgullu cikar
        

	}

}
