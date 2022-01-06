
package denklemler;
import java.util.Scanner;
public class Denklemler {

    public static void main(String[] args) {
 Scanner klavye = new Scanner(System.in); 
  System.out.println("ax^2+bx+c Şeklindeki Denklemin Katsayılarını Giriniz:");
   int a = klavye.nextInt();
 int b= klavye.nextInt(); 
  int c = klavye.nextInt(); 
  int delta = (b * b) - (4 * a * c);
   if (delta < 0)
   System.out.println("Denklemin Gerçel Kökü Yoktur."); 
   if(delta==0){
   double kok1=(-1*b)/(2*a);
   System.out.println("Denklemin Kökü:"+kok1);
   
   }
   if(delta>0){
  double kok1=((-1*b)+(delta^1/2))/(2*a); 
  double kok2=((-1*b)-(delta^1/2))/(2*a);
  System.out.println("Denklemin Kökleri:"+kok1+","+kok2);
   }
    }
    
}
