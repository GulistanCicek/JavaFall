package day10_ternary_Switchcase;

public class C08_SwithCase {

	public static void main(String[] args) {
  //gun numarasina gore hafta ici veya hafta sonu yazdiralim
        
        
        int gunNo=8;
        
        switch(gunNo) {
        
        case 1:         
        case 2: 
        case 3:
        case 4:
        case 5:
            System.out.println("Hafta Ici");
            break;
        case 6: 
        case 7:
            System.out.println("Hafta Sonu");
            break;
        default:
            System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
        
        }


	}

}
