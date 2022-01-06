
package basamak.alma;
import java.util.Scanner;
public class BasamakAlma {

    public static void main(String[] args) {
   Scanner klavye= new Scanner(System.in);
   int i=0;
        System.out.print("0-99999 arasında bir sayı giriniz:");
        int sayi = klavye.nextInt();
        
   
  
   while(sayi > 0) {
            sayi /= 10; 
            i++;
   }
   System.out.println("sayı "+i+" "+"basamaklıdır");
    }
    
}
