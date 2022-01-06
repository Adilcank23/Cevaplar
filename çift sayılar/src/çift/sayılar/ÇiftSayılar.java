
package çift.sayılar;
import java.util.Scanner;
public class ÇiftSayılar {
public static void main(String[] args) {
 Scanner klavye=new Scanner(System.in);
 System.out.print("Bir tamsayı giriniz:");
 int sayi=klavye.nextInt();
 int b=1;
 int tektop=0;
 int cifttop=0;
 int carpım=1;
for(int i=2;i<sayi;i+=2){
int a=i*i;
cifttop+=a;

}
while(b<sayi){
    tektop=tektop+b;
    carpım=carpım*b;
    b+=2;
            
}
 System.out.println("girdiğiniz sayıya kadar olan çift sayıların karelerinin toplamı:"+cifttop
 +" tek sayıların toplamı:"+tektop+" çarpımları ise şudur:"+carpım);


  

    
         
         
    }
    
}
