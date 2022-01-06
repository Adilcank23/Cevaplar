
package taşkagıtmakas;
import java.util.Scanner;
public class Taşkagıtmakas {

    public static void main(String[] args) {
  Scanner klavye=new Scanner(System.in);
  System.out.println("lütfen 0,1,2 sayılarından birini giriniz (0:taş,1:kağıt,2:makas):");
  byte a=klavye.nextByte();
  byte b=(byte)(Math.random()*3);
  
  if(a==b)
System.out.println("berabere");
  
  
  if(a==0&&b==1)
   System.out.println(":("+" taş kağıda yenilir");
  
  if(a==0&&b==2)
   System.out.println(":)"+" taş makası yener");
  
  if(a==1&&b==0)
   System.out.println(":)"+" kağıt taşı yener"); 

   if(a==1&&b==2)  
   System.out.println(":("+" kağıt makasa yenilir");

   
   if(a==2&&b==0)
   System.out.println(":("+ " makas taşa yenilir");       
   if(a==2&&b==1)
   System.out.println(":)"+" makas kağıdı yener");
          
      
      }  
}
