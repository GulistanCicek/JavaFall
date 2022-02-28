package day04_IncrementDecrement;

public class C07_PredecrementPostdecrement {

	public static void main(String[] args) {
		
        int sayi=10;
        
        sayi--;
        
        System.out.println(sayi); // 9
        
        int a=sayi--;  // 2 iþlem , int a assigment, sayi-- decrement, 
                       // önce atama yapilir. sonra azaltma yapilir
                       // a 9 olur sayiyi yazdirinca 8 olur.
        
        
        System.out.println(a); //9
        System.out.println(sayi);//8
        
        
        System.out.println(--a); // 

	}

}
