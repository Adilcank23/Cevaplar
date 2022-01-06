
package ucgen;
import java.util.Scanner;
public class Ucgen {

    public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);
System.out.println("lütfen üçgenin 3 kenarının uzunluğunu giriniz:");
int a=klavye.nextInt();
int b=klavye.nextInt();
int c=klavye.nextInt();

int h=Math.abs(a-b);
int j=a+b;
if(h<c&&c<j){
double u=(double)((a+(b+c))/2);
double alan=(double)(u*(u-a)*(u-b)*(u-c));
 if(a==b&&b==c&&a==c){
 System.out.println("Bu üçgen eşkenar bir üçgendir ve alanı:"+Math.pow(alan,0.5)+" çevresi:"+(2*u));
 }
 if(a==b&&a!=c||b==c&&a!=b||a==c&&c!=b){
  System.out.println("Bu üçgen ikizkenar bir üçgendir ve alanı:"+Math.pow(alan,0.5)+" çevresi:"+(2*u));    
 }
 if(a!=b&&a!=c&&b!=c)
   System.out.println("Bu üçgen çeşitkenar bir üçgendir ve alanı:"+Math.pow(alan,0.5)+" çevresi:"+(2*u));     
 
}
else
System.out.println("Yazdığınız kenarlar ile bir üçgen çizilemez");
       
    }
    
}
