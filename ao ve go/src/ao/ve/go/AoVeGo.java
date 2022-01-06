
package ao.ve.go;
import java.util.Scanner;
public class AoVeGo {

    public static void main(String[] args) {
 Scanner klavye=new Scanner(System.in);
System.out.println("bir tamsayı giriniz:");
int sayi=klavye.nextInt();
int top=0;
   int car=1;
 int sayac=0;
if(sayi%2==0){
while(sayi!=0){
int a=sayi%10;
sayi/=10;
top+=a;
 sayac++;
} double sonuc=(double)top/sayac;
System.out.println("girdiğiniz sayının rakamlarının aritmetik ortalaması:"+sonuc);
}
else{
while(sayi!=0){
  int b=sayi%10;
  sayi/=10;
  car*=b;
  sayac++;
}
double sonuc=Math.pow(car,(1.0/ sayac) );
System.out.println("girdiğiniz rakamların geometrik ortalaması:"+sonuc);
}
    
    }
    
}
